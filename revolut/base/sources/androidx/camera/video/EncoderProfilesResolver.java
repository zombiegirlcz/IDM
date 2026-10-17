package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/camera/video/EncoderProfilesResolver;", "", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "hostProfilesProvider", "", "qualitySource", "", "Landroidx/camera/core/DynamicRange;", "supportedDynamicRanges", "<init>", "(Landroidx/camera/core/impl/EncoderProfilesProvider;ILjava/util/Set;)V", "dynamicRange", "Landroidx/camera/video/CapabilitiesByQuality;", "getCapabilities", "(Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/CapabilitiesByQuality;", "", "Landroidx/camera/video/Quality;", "getSupportedQualities", "(Landroidx/camera/core/DynamicRange;)Ljava/util/List;", "quality", "Landroid/util/Size;", "getResolution", "(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Landroid/util/Size;", "Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;", "getProfiles", "(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;", "size", "findNearestHigherSupportedEncoderProfilesFor", "(Landroid/util/Size;Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "I", "", "fullySpecifiedMap", "Ljava/util/Map;", "nonFullySpecifiedMap", "Ljava/util/Set;", "getSupportedDynamicRanges", "()Ljava/util/Set;", "Companion", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncoderProfilesResolver {

    @NotNull
    public static final EncoderProfilesResolver EMPTY;

    @NotNull
    private final Map<DynamicRange, CapabilitiesByQuality> fullySpecifiedMap;

    @NotNull
    private final EncoderProfilesProvider hostProfilesProvider;

    @NotNull
    private final Map<DynamicRange, CapabilitiesByQuality> nonFullySpecifiedMap;
    private final int qualitySource;

    @NotNull
    private final Set<DynamicRange> supportedDynamicRanges;

    static {
        EncoderProfilesProvider EMPTY2 = EncoderProfilesProvider.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        EMPTY = new EncoderProfilesResolver(EMPTY2, 1, h0.f322473a);
    }

    public EncoderProfilesResolver(@NotNull EncoderProfilesProvider hostProfilesProvider, int i, @NotNull Set<DynamicRange> supportedDynamicRanges) {
        Intrinsics.checkNotNullParameter(hostProfilesProvider, "hostProfilesProvider");
        Intrinsics.checkNotNullParameter(supportedDynamicRanges, "supportedDynamicRanges");
        this.hostProfilesProvider = hostProfilesProvider;
        this.qualitySource = i;
        this.fullySpecifiedMap = new LinkedHashMap();
        this.nonFullySpecifiedMap = new LinkedHashMap();
        for (DynamicRange dynamicRange : supportedDynamicRanges) {
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource);
            List<Quality> supportedQualities = capabilitiesByQuality.getSupportedQualities();
            Intrinsics.checkNotNullExpressionValue(supportedQualities, "getSupportedQualities(...)");
            if (!supportedQualities.isEmpty()) {
                this.fullySpecifiedMap.put(dynamicRange, capabilitiesByQuality);
            }
        }
        this.supportedDynamicRanges = this.fullySpecifiedMap.keySet();
    }

    private final CapabilitiesByQuality getCapabilities(DynamicRange dynamicRange) {
        if (dynamicRange.isFullySpecified()) {
            return this.fullySpecifiedMap.get(dynamicRange);
        }
        Map<DynamicRange, CapabilitiesByQuality> map = this.nonFullySpecifiedMap;
        CapabilitiesByQuality capabilitiesByQuality = map.get(dynamicRange);
        if (capabilitiesByQuality == null) {
            capabilitiesByQuality = DynamicRanges.canResolve(dynamicRange, this.fullySpecifiedMap.keySet()) ? new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource) : null;
            map.put(dynamicRange, capabilitiesByQuality);
        }
        return capabilitiesByQuality;
    }

    public final VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(@NotNull Size size, @NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.findNearestHigherSupportedEncoderProfilesFor(size);
        }
        return null;
    }

    public final VideoValidatedEncoderProfilesProxy getProfiles(@NotNull Quality quality, @NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.getProfiles(quality);
        }
        return null;
    }

    public final Size getResolution(@NotNull Quality quality, @NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.getResolution(quality);
        }
        return null;
    }

    @NotNull
    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return this.supportedDynamicRanges;
    }

    @NotNull
    public final List<Quality> getSupportedQualities(@NotNull DynamicRange dynamicRange) {
        List<Quality> supportedQualities;
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        return (capabilities == null || (supportedQualities = capabilities.getSupportedQualities()) == null) ? f0.f322471a : supportedQualities;
    }
}
