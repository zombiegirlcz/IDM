package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.internal.HighSpeedResolver;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u0002H\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u001b\"\u0004\b\u0000\u0010\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u0002H\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u001bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fJ&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u00162\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u0016J'\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0%\u0018\u00010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\u0010'J$\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0016\"\u0004\b\u0000\u0010\u001c*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u00160\u0016H\u0002J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0%0\u00162\u0006\u0010 \u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver;", "", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "isHighSpeedSupported", "", "()Z", "isHighSpeedSupported$delegate", "Lkotlin/Lazy;", "maxSize", "Landroid/util/Size;", "getMaxSize", "()Landroid/util/Size;", "maxSize$delegate", "streamConfigurationMapCompat", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "getStreamConfigurationMapCompat", "()Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "streamConfigurationMapCompat$delegate", "supportedSizes", "", "getSupportedSizes", "()Ljava/util/List;", "supportedSizes$delegate", "filterCommonSupportedSizes", "", "T", "sizesMap", "getMaxFrameRate", "", "size", "getSizeArrangements", "sizesList", "getFrameRateRangesFor", "", "Landroid/util/Range;", "surfaceSizes", "(Ljava/util/List;)[Landroid/util/Range;", "findCommonElements", "getHighSpeedVideoFpsRangesFor", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HighSpeedResolver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Range<Integer> DEFAULT_FPS;

    @NotNull
    private final CameraMetadata cameraMetadata;

    /* JADX INFO: renamed from: isHighSpeedSupported$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isHighSpeedSupported;

    /* JADX INFO: renamed from: maxSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxSize;

    /* JADX INFO: renamed from: streamConfigurationMapCompat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy streamConfigurationMapCompat;

    /* JADX INFO: renamed from: supportedSizes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedSizes;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_FPS", "Landroid/util/Range;", "", "getDEFAULT_FPS", "()Landroid/util/Range;", "isHighSpeedOn", "", "attachedSurfaces", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "newUseCaseConfigs", "Landroidx/camera/core/impl/UseCaseConfig;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Range<Integer> getDEFAULT_FPS() {
            return HighSpeedResolver.DEFAULT_FPS;
        }

        public final boolean isHighSpeedOn(@NotNull Collection<? extends AttachedSurfaceInfo> attachedSurfaces, @NotNull Collection<? extends UseCaseConfig<?>> newUseCaseConfigs) {
            boolean z;
            Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
            Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
            Collection<? extends AttachedSurfaceInfo> collection = attachedSurfaces;
            ArrayList arrayList = new ArrayList(w.t(collection, 10));
            Iterator<T> it8 = collection.iterator();
            while (it8.hasNext()) {
                arrayList.add(Integer.valueOf(((AttachedSurfaceInfo) it8.next()).getSessionType()));
            }
            Collection<? extends UseCaseConfig<?>> collection2 = newUseCaseConfigs;
            ArrayList arrayList2 = new ArrayList(w.t(collection2, 10));
            Iterator<T> it9 = collection2.iterator();
            while (true) {
                z = false;
                if (!it9.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((UseCaseConfig) it9.next()).getSessionType(0)));
            }
            ArrayList arrayListE0 = d0.E0(arrayList2, arrayList);
            if (!arrayListE0.isEmpty()) {
                Iterator it10 = arrayListE0.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        break;
                    }
                    if (((Number) it10.next()).intValue() == 1) {
                        z = true;
                        break;
                    }
                }
            }
            if (z && !arrayListE0.isEmpty()) {
                Iterator it11 = arrayListE0.iterator();
                while (it11.hasNext()) {
                    if (((Number) it11.next()).intValue() != 1) {
                        throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                    }
                }
            }
            return z;
        }

        private Companion() {
        }
    }

    static {
        Integer numValueOf = Integer.valueOf(SyslogConstants.LOG_CLOCK);
        DEFAULT_FPS = new Range<>(numValueOf, numValueOf);
    }

    public HighSpeedResolver(@NotNull CameraMetadata cameraMetadata) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        this.cameraMetadata = cameraMetadata;
        final int i = 0;
        this.isHighSpeedSupported = j.b(new Function0(this) { // from class: t.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HighSpeedResolver f266833b;

            {
                this.f266833b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$0(this.f266833b));
                    case 1:
                        return HighSpeedResolver.maxSize_delegate$lambda$0(this.f266833b);
                    case 2:
                        return HighSpeedResolver.streamConfigurationMapCompat_delegate$lambda$0(this.f266833b);
                    default:
                        return HighSpeedResolver.supportedSizes_delegate$lambda$0(this.f266833b);
                }
            }
        });
        final int i2 = 1;
        this.maxSize = j.b(new Function0(this) { // from class: t.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HighSpeedResolver f266833b;

            {
                this.f266833b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$0(this.f266833b));
                    case 1:
                        return HighSpeedResolver.maxSize_delegate$lambda$0(this.f266833b);
                    case 2:
                        return HighSpeedResolver.streamConfigurationMapCompat_delegate$lambda$0(this.f266833b);
                    default:
                        return HighSpeedResolver.supportedSizes_delegate$lambda$0(this.f266833b);
                }
            }
        });
        final int i3 = 2;
        this.streamConfigurationMapCompat = j.b(new Function0(this) { // from class: t.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HighSpeedResolver f266833b;

            {
                this.f266833b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$0(this.f266833b));
                    case 1:
                        return HighSpeedResolver.maxSize_delegate$lambda$0(this.f266833b);
                    case 2:
                        return HighSpeedResolver.streamConfigurationMapCompat_delegate$lambda$0(this.f266833b);
                    default:
                        return HighSpeedResolver.supportedSizes_delegate$lambda$0(this.f266833b);
                }
            }
        });
        final int i5 = 3;
        this.supportedSizes = j.b(new Function0(this) { // from class: t.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HighSpeedResolver f266833b;

            {
                this.f266833b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$0(this.f266833b));
                    case 1:
                        return HighSpeedResolver.maxSize_delegate$lambda$0(this.f266833b);
                    case 2:
                        return HighSpeedResolver.streamConfigurationMapCompat_delegate$lambda$0(this.f266833b);
                    default:
                        return HighSpeedResolver.supportedSizes_delegate$lambda$0(this.f266833b);
                }
            }
        });
    }

    private final <T> List<T> findCommonElements(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayListF1 = d0.f1((Collection) d0.b0(list));
        Iterator<T> it8 = d0.V(list, 1).iterator();
        while (it8.hasNext()) {
            arrayListF1.retainAll((List) it8.next());
        }
        return arrayListF1;
    }

    private final List<Range<Integer>> getHighSpeedVideoFpsRangesFor(Size size) {
        Object objA;
        List<Range<Integer>> listD1;
        try {
            m.Companion companion = m.INSTANCE;
            objA = getStreamConfigurationMapCompat().getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        Range[] rangeArr = (Range[]) objA;
        return (rangeArr == null || (listD1 = d0.d1(d.L(rangeArr))) == null) ? f0.f322471a : listD1;
    }

    private final StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        return (StreamConfigurationMapCompat) this.streamConfigurationMapCompat.getValue();
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isHighSpeedSupported_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        CameraMetadata cameraMetadata = highSpeedResolver.cameraMetadata;
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size maxSize_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        List<Size> supportedSizes = highSpeedResolver.getSupportedSizes();
        if (supportedSizes.isEmpty()) {
            supportedSizes = null;
        }
        if (supportedSizes == null) {
            return null;
        }
        Iterator<T> it8 = supportedSizes.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            int area = SizeUtil.getArea((Size) next);
            do {
                Object next2 = it8.next();
                int area2 = SizeUtil.getArea((Size) next2);
                if (area < area2) {
                    next = next2;
                    area = area2;
                }
            } while (it8.hasNext());
        }
        return (Size) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreamConfigurationMapCompat streamConfigurationMapCompat_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        CameraMetadata cameraMetadata = highSpeedResolver.cameraMetadata;
        CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(highSpeedResolver.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supportedSizes_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        List listV0;
        Size[] highSpeedVideoSizes = highSpeedResolver.getStreamConfigurationMapCompat().getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (listV0 = d.v0(highSpeedVideoSizes)) == null) ? f0.f322471a : listV0;
    }

    @NotNull
    public final <T> Map<T, List<Size>> filterCommonSupportedSizes(@NotNull Map<T, ? extends List<Size>> sizesMap) {
        Intrinsics.checkNotNullParameter(sizesMap, "sizesMap");
        List<T> listFindCommonElements = findCommonElements(d0.d1(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (T t2 : listFindCommonElements) {
            if (getSupportedSizes().contains((Size) t2)) {
                arrayList.add(t2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(sizesMap.size()));
        Iterator<T> it8 = sizesMap.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (arrayList.contains((Size) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final Range<Integer>[] getFrameRateRangesFor(@NotNull List<Size> surfaceSizes) {
        Intrinsics.checkNotNullParameter(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || d0.U(surfaceSizes).size() != 1) {
            return null;
        }
        List<Range<Integer>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(surfaceSizes.get(0));
        if (highSpeedVideoFpsRangesFor.isEmpty()) {
            highSpeedVideoFpsRangesFor = null;
        }
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : highSpeedVideoFpsRangesFor) {
                Range range = (Range) obj2;
                if (Intrinsics.f(range.getLower(), range.getUpper())) {
                    arrayList.add(obj2);
                }
            }
            highSpeedVideoFpsRangesFor = arrayList;
        }
        return (Range[]) highSpeedVideoFpsRangesFor.toArray(new Range[0]);
    }

    public final int getMaxFrameRate(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        List<Range<Integer>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(size);
        if (highSpeedVideoFpsRangesFor.isEmpty()) {
            highSpeedVideoFpsRangesFor = null;
        }
        if (highSpeedVideoFpsRangesFor == null) {
            Logger.w("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it8 = highSpeedVideoFpsRangesFor.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it8.next()).getUpper();
        while (it8.hasNext()) {
            Integer num2 = (Integer) ((Range) it8.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(num, "maxOf(...)");
        return num.intValue();
    }

    public final Size getMaxSize() {
        return (Size) this.maxSize.getValue();
    }

    @NotNull
    public final List<List<Size>> getSizeArrangements(@NotNull List<? extends List<Size>> sizesList) {
        Intrinsics.checkNotNullParameter(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return f0.f322471a;
        }
        List<Size> listFindCommonElements = findCommonElements(sizesList);
        ArrayList arrayList = new ArrayList(w.t(listFindCommonElements, 10));
        for (Size size : listFindCommonElements) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i = 0; i < size2; i++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final boolean isHighSpeedSupported() {
        return ((Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }
}
