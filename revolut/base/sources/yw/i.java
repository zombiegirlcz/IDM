package yw;

import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEncodingBitRate f317242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317243b;

    public i(VideoEncodingBitRate videoEncodingBitRate, boolean z) {
        Intrinsics.checkNotNullParameter(videoEncodingBitRate, "videoEncodingBitRate");
        this.f317242a = videoEncodingBitRate;
        this.f317243b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317242a, iVar.f317242a) && this.f317243b == iVar.f317243b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317243b) + (this.f317242a.hashCode() * 31);
    }
}
