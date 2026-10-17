package com.fourthline.vision.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Size;
import android.view.Display;
import com.fourthline.core.internal.AndroidDevicesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class b0 {
    private static final b i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f35975j = 8;
    private static final Size k = new Size(1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f35976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f35977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Display f35978c;
    private final String d;
    private final Size e;
    private final Size f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f35980h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35981a = new a("PREVIEW", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f35982b = new a("RECORDING", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f35983c;
        private static final /* synthetic */ EnumEntries d;

        private static final /* synthetic */ a[] $values() {
            return new a[]{f35981a, f35982b};
        }

        static {
            a[] aVarArr$values = $values();
            f35983c = aVarArr$values;
            d = vc.s.n(aVarArr$values);
        }

        private a(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return d;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35983c.clone();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35984a = new c("FRONT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f35985b = new c("BACK", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f35986c;
        private static final /* synthetic */ EnumEntries d;

        private static final /* synthetic */ c[] $values() {
            return new c[]{f35984a, f35985b};
        }

        static {
            c[] cVarArr$values = $values();
            f35986c = cVarArr$values;
            d = vc.s.n(cVarArr$values);
        }

        private c(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return d;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f35986c.clone();
        }
    }

    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f35984a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f35985b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b0(@NotNull CameraManager delegate, @NotNull c cameraDirection, @NotNull Display display) throws CameraAccessException {
        String str;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f35976a = delegate;
        this.f35977b = cameraDirection;
        this.f35978c = display;
        String[] cameraIdList = delegate.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i2];
            Integer num = (Integer) delegate.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
            int i3 = d.$EnumSwitchMapping$0[this.f35977b.ordinal()];
            int i5 = 1;
            if (i3 == 1) {
                i5 = 0;
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null && num.intValue() == i5) {
                break;
            } else {
                i2++;
            }
        }
        this.d = str;
        this.e = getSize(SurfaceTexture.class);
        this.f = getSize(ImageReader.class);
        this.f35979g = getRotationCompensation();
        this.f35980h = AndroidDevicesKt.isXiaomiRedmi9TDevice() ? a.f35981a : a.f35982b;
    }

    private final List<Size> getAllSupportedSizes(Class<?> cls) {
        StreamConfigurationMap streamConfigurationMap;
        String str = this.d;
        if (str == null || (streamConfigurationMap = (StreamConfigurationMap) this.f35976a.getCameraCharacteristics(str).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null || !StreamConfigurationMap.isOutputSupportedFor(cls)) {
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
        Intrinsics.checkNotNullExpressionValue(outputSizes, "getOutputSizes(...)");
        return zhm.p.c(outputSizes);
    }

    private final int getRotationCompensation() {
        int i2;
        if (this.d == null) {
            return 0;
        }
        int rotation = this.f35978c.getRotation();
        if (rotation == 0) {
            i2 = 90;
        } else if (rotation == 1) {
            i2 = 0;
        } else if (rotation == 2) {
            i2 = 270;
        } else {
            if (rotation != 3) {
                if (getClass().isAnonymousClass()) {
                    String name = getClass().getName();
                    if (name.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    String simpleName = getClass().getSimpleName();
                    if (simpleName.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                return 0;
            }
            i2 = 180;
        }
        Integer num = (Integer) this.f35976a.getCameraCharacteristics(this.d).get(CameraCharacteristics.SENSOR_ORIENTATION);
        return ((i2 + (num != null ? num.intValue() : 0)) + 270) % 360;
    }

    public final String getCameraId() {
        return this.d;
    }

    @NotNull
    public final Size getCameraPreviewSize() {
        return this.e;
    }

    @NotNull
    public final CameraManager getDelegate() {
        return this.f35976a;
    }

    @NotNull
    public Size getImageReaderSize() {
        return this.f;
    }

    public final int getOrientationHint() {
        return this.f35979g;
    }

    @NotNull
    public final Size getSize(@NotNull Class<?> expectedConsumerClass) {
        ArrayList arrayList;
        Size size;
        Object next;
        Intrinsics.checkNotNullParameter(expectedConsumerClass, "expectedConsumerClass");
        List<Size> allSupportedSizes = getAllSupportedSizes(expectedConsumerClass);
        Size size2 = null;
        Object next2 = null;
        if (allSupportedSizes != null) {
            arrayList = new ArrayList();
            for (Object obj2 : allSupportedSizes) {
                if (((Size) obj2).getHeight() >= 1080) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it8 = arrayList.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    int height = ((Size) next).getHeight();
                    do {
                        Object next3 = it8.next();
                        int height2 = ((Size) next3).getHeight();
                        if (height > height2) {
                            next = next3;
                            height = height2;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next = null;
            }
            size = (Size) next;
        } else {
            size = null;
        }
        if (size != null) {
            return size;
        }
        if (allSupportedSizes != null) {
            Iterator<T> it9 = allSupportedSizes.iterator();
            if (it9.hasNext()) {
                next2 = it9.next();
                if (it9.hasNext()) {
                    int height3 = ((Size) next2).getHeight();
                    do {
                        Object next4 = it9.next();
                        int height4 = ((Size) next4).getHeight();
                        if (height3 < height4) {
                            next2 = next4;
                            height3 = height4;
                        }
                    } while (it9.hasNext());
                }
            }
            size2 = (Size) next2;
        }
        return size2 == null ? k : size2;
    }

    @NotNull
    public final a getSupportedCameraTemplate() {
        return this.f35980h;
    }
}
