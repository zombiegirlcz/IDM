package androidx.camera.video.internal.config;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/camera/video/internal/config/FormatCombo;", "", "", "container", "", "videoMime", "audioMime", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getContainer", "getContainer$annotations", "()V", "Ljava/lang/String;", "getVideoMime", "getAudioMime", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FormatCombo {
    private final String audioMime;
    private final int container;
    private final String videoMime;

    public FormatCombo(int i, String str, String str2) {
        this.container = i;
        this.videoMime = str;
        this.audioMime = str2;
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormatCombo)) {
            return false;
        }
        FormatCombo formatCombo = (FormatCombo) other;
        return this.container == formatCombo.container && Intrinsics.f(this.videoMime, formatCombo.videoMime) && Intrinsics.f(this.audioMime, formatCombo.audioMime);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.container) * 31;
        String str = this.videoMime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioMime;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("FormatCombo(container=");
        sb6.append(this.container);
        sb6.append(", videoMime=");
        sb6.append(this.videoMime);
        sb6.append(", audioMime=");
        return a.u(sb6, this.audioMime, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
