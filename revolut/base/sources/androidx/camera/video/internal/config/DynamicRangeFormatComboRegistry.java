package androidx.camera.video.internal.config;

import android.os.Build;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.config.FormatComboRegistry;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uyh.t;
import uz8.s;
import yhm.j;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R!\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Landroidx/camera/video/internal/config/DynamicRangeFormatComboRegistry;", "", "<init>", "()V", "Landroidx/camera/video/internal/config/FormatComboRegistry;", "buildSdrRegistry", "()Landroidx/camera/video/internal/config/FormatComboRegistry;", "buildHlgRegistry", "buildHdr10Registry", "buildHdr10PlusRegistry", "buildDolbyVisionRegistry", "", "", "minSdk", "takeIf", "(Ljava/lang/String;I)Ljava/lang/String;", "videoMime", "", "Landroidx/camera/core/DynamicRange;", "getDynamicRangesForVideoMime", "(Ljava/lang/String;)Ljava/util/Set;", "MIMETYPE_VIDEO_HEVC_GATED", "Ljava/lang/String;", "MIMETYPE_VIDEO_VP9_GATED", "MIMETYPE_AUDIO_OPUS_GATED", "MIMETYPE_VIDEO_DOLBY_VISION_GATED", "MIMETYPE_VIDEO_AV1_GATED", "MIMETYPE_VIDEO_APV_GATED", "", "registries$delegate", "Lkotlin/Lazy;", "getRegistries", "()Ljava/util/Map;", "registries", "", "standardMp4Audios$delegate", "getStandardMp4Audios", "()Ljava/util/List;", "standardMp4Audios", "standardWebmAudios$delegate", "getStandardWebmAudios", "standardWebmAudios", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicRangeFormatComboRegistry {

    @NotNull
    public static final DynamicRangeFormatComboRegistry INSTANCE;
    private static final String MIMETYPE_AUDIO_OPUS_GATED;
    private static final String MIMETYPE_VIDEO_APV_GATED;
    private static final String MIMETYPE_VIDEO_AV1_GATED;
    private static final String MIMETYPE_VIDEO_DOLBY_VISION_GATED;
    private static final String MIMETYPE_VIDEO_HEVC_GATED;
    private static final String MIMETYPE_VIDEO_VP9_GATED;

    /* JADX INFO: renamed from: registries$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy registries;

    /* JADX INFO: renamed from: standardMp4Audios$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy standardMp4Audios;

    /* JADX INFO: renamed from: standardWebmAudios$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy standardWebmAudios;

    static {
        DynamicRangeFormatComboRegistry dynamicRangeFormatComboRegistry = new DynamicRangeFormatComboRegistry();
        INSTANCE = dynamicRangeFormatComboRegistry;
        MIMETYPE_VIDEO_HEVC_GATED = dynamicRangeFormatComboRegistry.takeIf("video/hevc", 24);
        MIMETYPE_VIDEO_VP9_GATED = dynamicRangeFormatComboRegistry.takeIf("video/x-vnd.on2.vp9", 24);
        MIMETYPE_AUDIO_OPUS_GATED = dynamicRangeFormatComboRegistry.takeIf("audio/opus", 29);
        MIMETYPE_VIDEO_DOLBY_VISION_GATED = dynamicRangeFormatComboRegistry.takeIf("video/dolby-vision", 33);
        MIMETYPE_VIDEO_AV1_GATED = dynamicRangeFormatComboRegistry.takeIf("video/av01", 34);
        MIMETYPE_VIDEO_APV_GATED = dynamicRangeFormatComboRegistry.takeIf("video/apv", 36);
        registries = j.b(new s(4));
        standardMp4Audios = j.b(new s(5));
        standardWebmAudios = j.b(new s(6));
    }

    private DynamicRangeFormatComboRegistry() {
    }

    private final FormatComboRegistry buildDolbyVisionRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new t(10));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildDolbyVisionRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        container.support(v.l(MIMETYPE_VIDEO_DOLBY_VISION_GATED), INSTANCE.getStandardMp4Audios());
        return Unit.f186387a;
    }

    private final FormatComboRegistry buildHdr10PlusRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new t(11));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHdr10PlusRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        String[] elements = {MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        container.support(d.L(elements), INSTANCE.getStandardMp4Audios());
        return Unit.f186387a;
    }

    private final FormatComboRegistry buildHdr10Registry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new t(15));
        builder.container(1, new t(16));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHdr10Registry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        String[] elements = {MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        container.support(d.L(elements), INSTANCE.getStandardMp4Audios());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHdr10Registry$lambda$0$1(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        container.support(v.l(MIMETYPE_VIDEO_VP9_GATED), INSTANCE.getStandardWebmAudios());
        return Unit.f186387a;
    }

    private final FormatComboRegistry buildHlgRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new t(12));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildHlgRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        String[] elements = {MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        container.support(d.L(elements), INSTANCE.getStandardMp4Audios());
        return Unit.f186387a;
    }

    private final FormatComboRegistry buildSdrRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new t(13));
        builder.container(1, new t(14));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSdrRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        String[] elements = {"video/avc", "video/mp4v-es", "video/3gpp", MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_DOLBY_VISION_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        container.support(d.L(elements), INSTANCE.getStandardMp4Audios());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSdrRegistry$lambda$0$1(FormatComboRegistry.Builder.ContainerScope container) {
        Intrinsics.checkNotNullParameter(container, "$this$container");
        String[] elements = {"video/x-vnd.on2.vp8", MIMETYPE_VIDEO_VP9_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        container.support(d.L(elements), INSTANCE.getStandardWebmAudios());
        return Unit.f186387a;
    }

    private final Map<DynamicRange, FormatComboRegistry> getRegistries() {
        return (Map) registries.getValue();
    }

    private final List<String> getStandardMp4Audios() {
        return (List) standardMp4Audios.getValue();
    }

    private final List<String> getStandardWebmAudios() {
        return (List) standardWebmAudios.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map registries_delegate$lambda$0() {
        DynamicRange dynamicRange = DynamicRange.SDR;
        DynamicRangeFormatComboRegistry dynamicRangeFormatComboRegistry = INSTANCE;
        return r0.n(new Pair(dynamicRange, dynamicRangeFormatComboRegistry.buildSdrRegistry()), new Pair(DynamicRange.HLG_10_BIT, dynamicRangeFormatComboRegistry.buildHlgRegistry()), new Pair(DynamicRange.HDR10_10_BIT, dynamicRangeFormatComboRegistry.buildHdr10Registry()), new Pair(DynamicRange.HDR10_PLUS_10_BIT, dynamicRangeFormatComboRegistry.buildHdr10PlusRegistry()), new Pair(DynamicRange.DOLBY_VISION_8_BIT, dynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()), new Pair(DynamicRange.DOLBY_VISION_10_BIT, dynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List standardMp4Audios_delegate$lambda$0() {
        String[] elements = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List standardWebmAudios_delegate$lambda$0() {
        String[] elements = {"audio/vorbis", MIMETYPE_AUDIO_OPUS_GATED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }

    private final String takeIf(String str, int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return str;
        }
        return null;
    }

    @NotNull
    public final Set<DynamicRange> getDynamicRangesForVideoMime(@NotNull String videoMime) {
        Intrinsics.checkNotNullParameter(videoMime, "videoMime");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<DynamicRange, FormatComboRegistry> entry : getRegistries().entrySet()) {
            DynamicRange key = entry.getKey();
            if (!entry.getValue().getCombosForVideo(videoMime).isEmpty()) {
                linkedHashSet.add(key);
            }
        }
        return linkedHashSet;
    }
}
