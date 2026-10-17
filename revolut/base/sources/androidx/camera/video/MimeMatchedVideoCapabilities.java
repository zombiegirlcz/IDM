package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/camera/video/MimeMatchedVideoCapabilities;", "Landroidx/camera/video/VideoCapabilities;", "", "mime", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "<init>", "(Ljava/lang/String;Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", "Landroidx/camera/core/DynamicRange;", "getSupportedDynamicRanges", "()Ljava/util/Set;", "dynamicRange", "", "Landroidx/camera/video/Quality;", "getSupportedQualities", "(Landroidx/camera/core/DynamicRange;)Ljava/util/List;", "quality", "Landroid/util/Size;", "getResolution", "(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Landroid/util/Size;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "validatedData$delegate", "Lkotlin/Lazy;", "getValidatedData", "()Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "validatedData", "ValidatedData", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MimeMatchedVideoCapabilities implements VideoCapabilities {

    @NotNull
    private final CameraInfoInternal cameraInfo;

    @NotNull
    private final String mime;

    /* JADX INFO: renamed from: validatedData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy validatedData;

    public MimeMatchedVideoCapabilities(@NotNull String mime, @NotNull CameraInfoInternal cameraInfo, @NotNull VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.mime = mime;
        this.cameraInfo = cameraInfo;
        this.validatedData = yhm.j.b(new rxe.b(videoEncoderInfoFinder, this, 7));
    }

    private final ValidatedData getValidatedData() {
        return (ValidatedData) this.validatedData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidatedData validatedData_delegate$lambda$0(VideoEncoderInfo.Finder finder, MimeMatchedVideoCapabilities mimeMatchedVideoCapabilities) {
        Object next;
        String str = mimeMatchedVideoCapabilities.mime;
        ((w0.f) finder).getClass();
        VideoEncoderInfo videoEncoderInfoFINDER$lambda$0 = VideoEncoderInfoImpl.FINDER$lambda$0(str);
        if (videoEncoderInfoFINDER$lambda$0 == null) {
            return new ValidatedData(null, null, 3, null);
        }
        Set<DynamicRange> supportedDynamicRanges = mimeMatchedVideoCapabilities.cameraInfo.getSupportedDynamicRanges();
        Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        if (supportedDynamicRanges.isEmpty()) {
            return new ValidatedData(null, null, 3, null);
        }
        Set setH0 = d0.h0(supportedDynamicRanges, VideoConfigUtil.INSTANCE.getDynamicRangesForMime(mimeMatchedVideoCapabilities.mime));
        if (setH0.isEmpty()) {
            return new ValidatedData(null, null, 3, null);
        }
        List<Size> supportedResolutions = mimeMatchedVideoCapabilities.cameraInfo.getSupportedResolutions(34);
        Intrinsics.checkNotNullExpressionValue(supportedResolutions, "getSupportedResolutions(...)");
        HashSet hashSetB1 = d0.b1(supportedResolutions);
        List<Quality> sortedQualities = Quality.getSortedQualities();
        Intrinsics.checkNotNullExpressionValue(sortedQualities, "getSortedQualities(...)");
        ArrayList<Quality.ConstantQuality> arrayList = new ArrayList();
        for (Object obj2 : sortedQualities) {
            if (obj2 instanceof Quality.ConstantQuality) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Quality.ConstantQuality constantQuality : arrayList) {
            List<Size> typicalSizes = constantQuality.getTypicalSizes();
            Intrinsics.checkNotNullExpressionValue(typicalSizes, "getTypicalSizes(...)");
            Iterator<T> it8 = typicalSizes.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Size size = (Size) next;
                if (hashSetB1.contains(size) && videoEncoderInfoFINDER$lambda$0.isSizeSupported(size.getWidth(), size.getHeight())) {
                    break;
                }
            }
            Size size2 = (Size) next;
            Pair pair = size2 != null ? new Pair(constantQuality, size2) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Map mapT = r0.t(arrayList2);
        return mapT.isEmpty() ? new ValidatedData(null, null, 3, null) : new ValidatedData(setH0, mapT);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public Size getResolution(@NotNull Quality quality, @NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        if (DynamicRanges.canResolve(dynamicRange, getValidatedData().getDynamicRanges())) {
            return getValidatedData().getQualityToSizeMap().get(quality);
        }
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NotNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return getValidatedData().getDynamicRanges();
    }

    @Override // androidx.camera.video.VideoCapabilities
    @NotNull
    public List<Quality> getSupportedQualities(@NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        return DynamicRanges.canResolve(dynamicRange, getValidatedData().getDynamicRanges()) ? d0.d1(getValidatedData().getQualityToSizeMap().keySet()) : f0.f322471a;
    }

    @NotNull
    public String toString() {
        return "MimeMatchedVideoCapabilities(mime=" + this.mime + ", cameraInfo=" + this.cameraInfo + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/camera/video/MimeMatchedVideoCapabilities$ValidatedData;", "", "", "Landroidx/camera/core/DynamicRange;", "dynamicRanges", "", "Landroidx/camera/video/Quality;", "Landroid/util/Size;", "qualityToSizeMap", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getDynamicRanges", "()Ljava/util/Set;", "Ljava/util/Map;", "getQualityToSizeMap", "()Ljava/util/Map;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidatedData {

        @NotNull
        private final Set<DynamicRange> dynamicRanges;

        @NotNull
        private final Map<Quality, Size> qualityToSizeMap;

        public ValidatedData(Set set, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? h0.f322473a : set, (i & 2) != 0 ? r0.g() : map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidatedData)) {
                return false;
            }
            ValidatedData validatedData = (ValidatedData) other;
            return Intrinsics.f(this.dynamicRanges, validatedData.dynamicRanges) && Intrinsics.f(this.qualityToSizeMap, validatedData.qualityToSizeMap);
        }

        @NotNull
        public final Set<DynamicRange> getDynamicRanges() {
            return this.dynamicRanges;
        }

        @NotNull
        public final Map<Quality, Size> getQualityToSizeMap() {
            return this.qualityToSizeMap;
        }

        public int hashCode() {
            return this.qualityToSizeMap.hashCode() + (this.dynamicRanges.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ValidatedData(dynamicRanges=" + this.dynamicRanges + ", qualityToSizeMap=" + this.qualityToSizeMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public ValidatedData(@NotNull Set<DynamicRange> dynamicRanges, @NotNull Map<Quality, Size> qualityToSizeMap) {
            Intrinsics.checkNotNullParameter(dynamicRanges, "dynamicRanges");
            Intrinsics.checkNotNullParameter(qualityToSizeMap, "qualityToSizeMap");
            this.dynamicRanges = dynamicRanges;
            this.qualityToSizeMap = qualityToSizeMap;
        }
    }
}
