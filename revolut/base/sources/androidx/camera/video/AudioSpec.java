package androidx.camera.video;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cBE\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/camera/video/AudioSpec;", "", "", "bitrate", "sourceFormat", "source", "sampleRate", "channelCount", "", "mimeType", "<init>", "(IIIIILjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getBitrate", "getSourceFormat", "getSource", "getSampleRate", "getChannelCount", "Ljava/lang/String;", "getMimeType", "Companion", "Builder", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final AudioSpec DEFAULT;
    private final int bitrate;
    private final int channelCount;

    @NotNull
    private final String mimeType;
    private final int sampleRate;
    private final int source;
    private final int sourceFormat;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/camera/video/AudioSpec$Builder;", "", "<init>", "()V", "Landroidx/camera/video/AudioSpec;", "build", "()Landroidx/camera/video/AudioSpec;", "", "bitrate", "I", "sourceFormat", "source", "sampleRate", "channelCount", "", "mimeType", "Ljava/lang/String;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private int bitrate;
        private int sampleRate;
        private int sourceFormat = -1;
        private int source = -1;
        private int channelCount = -1;

        @NotNull
        private String mimeType = "audio/*";

        @NotNull
        public final AudioSpec build() {
            return new AudioSpec(this.bitrate, this.sourceFormat, this.source, this.sampleRate, this.channelCount, this.mimeType);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/camera/video/AudioSpec$Companion;", "", "<init>", "()V", "SOURCE_FORMAT_UNSPECIFIED", "", "SOURCE_FORMAT_PCM_16BIT", "CHANNEL_COUNT_UNSPECIFIED", "CHANNEL_COUNT_NONE", "CHANNEL_COUNT_MONO", "CHANNEL_COUNT_STEREO", "SOURCE_UNSPECIFIED", "SOURCE_CAMCORDER", "SOURCE_DEFAULT", "SOURCE_MIC", "SOURCE_UNPROCESSED", "SOURCE_VOICE_COMMUNICATION", "SOURCE_VOICE_RECOGNITION", "SOURCE_VOICE_PERFORMANCE", "BITRATE_UNSPECIFIED", "SAMPLE_RATE_UNSPECIFIED", "MIME_TYPE_UNSPECIFIED", "", "DEFAULT", "Landroidx/camera/video/AudioSpec;", "getDEFAULT", "()Landroidx/camera/video/AudioSpec;", "builder", "Landroidx/camera/video/AudioSpec$Builder;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @NotNull
        public final AudioSpec getDEFAULT() {
            return AudioSpec.DEFAULT;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        DEFAULT = companion.builder().build();
    }

    public AudioSpec(int i, int i2, int i3, int i5, int i6, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.bitrate = i;
        this.sourceFormat = i2;
        this.source = i3;
        this.sampleRate = i5;
        this.channelCount = i6;
        this.mimeType = mimeType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) other;
        return this.sourceFormat == audioSpec.sourceFormat && this.source == audioSpec.source && this.channelCount == audioSpec.channelCount && this.bitrate == audioSpec.bitrate && this.sampleRate == audioSpec.sampleRate && Intrinsics.f(this.mimeType, audioSpec.mimeType);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getSourceFormat() {
        return this.sourceFormat;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.bitrate), Integer.valueOf(this.sourceFormat), Integer.valueOf(this.source), Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount));
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("AudioSpec{bitrate=");
        sb6.append(this.bitrate);
        sb6.append(", sourceFormat=");
        sb6.append(this.sourceFormat);
        sb6.append(", source=");
        sb6.append(this.source);
        sb6.append(", sampleRate=");
        sb6.append(this.sampleRate);
        sb6.append(", channelCount=");
        sb6.append(this.channelCount);
        sb6.append(", mimeType=");
        return j6.a.u(sb6, this.mimeType, CoreConstants.CURLY_RIGHT);
    }
}
