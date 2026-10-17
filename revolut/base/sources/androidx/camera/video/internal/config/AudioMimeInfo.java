package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/camera/video/internal/config/AudioMimeInfo;", "", "", "mimeType", "", "profile", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "compatibleAudioProfile", "<init>", "(Ljava/lang/String;ILandroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "I", "getProfile", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "getCompatibleAudioProfile", "()Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AudioMimeInfo {
    private final EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;

    @NotNull
    private final String mimeType;
    private final int profile;

    public AudioMimeInfo(@NotNull String mimeType, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.mimeType = mimeType;
        this.profile = i;
        this.compatibleAudioProfile = audioProfileProxy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioMimeInfo)) {
            return false;
        }
        AudioMimeInfo audioMimeInfo = (AudioMimeInfo) other;
        return Intrinsics.f(this.mimeType, audioMimeInfo.mimeType) && this.profile == audioMimeInfo.profile && Intrinsics.f(this.compatibleAudioProfile, audioMimeInfo.compatibleAudioProfile);
    }

    public final EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile() {
        return this.compatibleAudioProfile;
    }

    @NotNull
    public String getMimeType() {
        return this.mimeType;
    }

    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int iB = a.b(this.profile, this.mimeType.hashCode() * 31, 31);
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.compatibleAudioProfile;
        return iB + (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode());
    }

    @NotNull
    public String toString() {
        return "AudioMimeInfo(mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleAudioProfile=" + this.compatibleAudioProfile + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
