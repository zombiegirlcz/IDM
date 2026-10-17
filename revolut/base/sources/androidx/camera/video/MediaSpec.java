package androidx.camera.video;

import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012¨\u0006 "}, d2 = {"Landroidx/camera/video/MediaSpec;", "", "Landroidx/camera/video/VideoSpec;", "videoSpec", "Landroidx/camera/video/AudioSpec;", "audioSpec", "", "outputFormat", "<init>", "(Landroidx/camera/video/VideoSpec;Landroidx/camera/video/AudioSpec;I)V", "Landroidx/camera/video/MediaSpec$Builder;", "toBuilder", "()Landroidx/camera/video/MediaSpec$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/video/VideoSpec;", "getVideoSpec", "()Landroidx/camera/video/VideoSpec;", "Landroidx/camera/video/AudioSpec;", "getAudioSpec", "()Landroidx/camera/video/AudioSpec;", "I", "getOutputFormat", "Companion", "Builder", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AudioSpec audioSpec;
    private final int outputFormat;

    @NotNull
    private final VideoSpec videoSpec;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001c\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003¨\u0006\u001d"}, d2 = {"Landroidx/camera/video/MediaSpec$Builder;", "", "<init>", "()V", "Landroidx/camera/video/AudioSpec;", "audioSpec", "setAudioSpec", "(Landroidx/camera/video/AudioSpec;)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/camera/video/VideoSpec;", "videoSpec", "setVideoSpec", "(Landroidx/camera/video/VideoSpec;)Landroidx/camera/video/MediaSpec$Builder;", "", "format", "setOutputFormat", "(I)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/VideoSpec$Builder;", "configBlock", "configureVideo", "(Landroidx/core/util/Consumer;)Landroidx/camera/video/MediaSpec$Builder;", "Landroidx/camera/video/MediaSpec;", "build", "()Landroidx/camera/video/MediaSpec;", "Landroidx/camera/video/AudioSpec;", "Landroidx/camera/video/VideoSpec;", "outputFormat", "I", "getOutputFormat$annotations", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private AudioSpec audioSpec = AudioSpec.INSTANCE.getDEFAULT();

        @NotNull
        private VideoSpec videoSpec = VideoSpec.INSTANCE.getDEFAULT();
        private int outputFormat = -1;

        @NotNull
        public final MediaSpec build() {
            return new MediaSpec(this.videoSpec, this.audioSpec, this.outputFormat);
        }

        @NotNull
        public final Builder configureVideo(@NotNull Consumer<VideoSpec.Builder> configBlock) {
            Intrinsics.checkNotNullParameter(configBlock, "configBlock");
            VideoSpec.Builder builder = this.videoSpec.toBuilder();
            configBlock.accept(builder);
            this.videoSpec = builder.build();
            return this;
        }

        @NotNull
        public final Builder setAudioSpec(@NotNull AudioSpec audioSpec) {
            Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
            this.audioSpec = audioSpec;
            return this;
        }

        @NotNull
        public final Builder setOutputFormat(int format) {
            this.outputFormat = format;
            return this;
        }

        @NotNull
        public final Builder setVideoSpec(@NotNull VideoSpec videoSpec) {
            Intrinsics.checkNotNullParameter(videoSpec, "videoSpec");
            this.videoSpec = videoSpec;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0001J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0001J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0001J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/camera/video/MediaSpec$Companion;", "", "<init>", "()V", "AUDIO_ENCODER_MIME_MPEG4_DEFAULT", "", "AUDIO_ENCODER_MIME_WEBM_DEFAULT", "VIDEO_ENCODER_MIME_MPEG4_DEFAULT", "VIDEO_ENCODER_MIME_WEBM_DEFAULT", "AAC_DEFAULT_PROFILE", "", "OUTPUT_FORMAT_UNSPECIFIED", "OUTPUT_FORMAT_MPEG_4", "OUTPUT_FORMAT_WEBM", "outputFormatToAudioMime", "outputFormat", "outputFormatToAudioProfile", "outputFormatToVideoMime", "outputFormatToMuxerFormat", "builder", "Landroidx/camera/video/MediaSpec$Builder;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @NotNull
        public final String outputFormatToAudioMime(int outputFormat) {
            return outputFormat == 1 ? "audio/vorbis" : "audio/mp4a-latm";
        }

        public final int outputFormatToAudioProfile(int outputFormat) {
            return Intrinsics.f(outputFormatToAudioMime(outputFormat), "audio/mp4a-latm") ? 2 : -1;
        }

        public final int outputFormatToMuxerFormat(int outputFormat) {
            return outputFormat == 1 ? 1 : 0;
        }

        @NotNull
        public final String outputFormatToVideoMime(int outputFormat) {
            return outputFormat == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
        }

        private Companion() {
        }
    }

    public MediaSpec(@NotNull VideoSpec videoSpec, @NotNull AudioSpec audioSpec, int i) {
        Intrinsics.checkNotNullParameter(videoSpec, "videoSpec");
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        this.videoSpec = videoSpec;
        this.audioSpec = audioSpec;
        this.outputFormat = i;
    }

    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static final int outputFormatToMuxerFormat(int i) {
        return INSTANCE.outputFormatToMuxerFormat(i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) other;
        return Intrinsics.f(this.videoSpec, mediaSpec.videoSpec) && Intrinsics.f(this.audioSpec, mediaSpec.audioSpec) && this.outputFormat == mediaSpec.outputFormat;
    }

    @NotNull
    public final AudioSpec getAudioSpec() {
        return this.audioSpec;
    }

    public final int getOutputFormat() {
        return this.outputFormat;
    }

    @NotNull
    public final VideoSpec getVideoSpec() {
        return this.videoSpec;
    }

    public int hashCode() {
        return Objects.hash(this.videoSpec, this.audioSpec, Integer.valueOf(this.outputFormat));
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setVideoSpec(this.videoSpec).setAudioSpec(this.audioSpec).setOutputFormat(this.outputFormat);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("MediaSpec{videoSpec=");
        sb6.append(this.videoSpec);
        sb6.append(", audioSpec=");
        sb6.append(this.audioSpec);
        sb6.append(", outputFormat=");
        return j6.a.t(sb6, this.outputFormat, CoreConstants.CURLY_RIGHT);
    }
}
