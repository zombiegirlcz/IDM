package vw;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f292605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f292606c;
    public final l d;
    public final ArrayList e;
    public final h f;

    public m(String sessionId, j status, long j2, l preferredVideoFrameTimestampSource, ArrayList videoFrameTimestamps, h imuRawData) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(preferredVideoFrameTimestampSource, "preferredVideoFrameTimestampSource");
        Intrinsics.checkNotNullParameter(videoFrameTimestamps, "videoFrameTimestamps");
        Intrinsics.checkNotNullParameter(imuRawData, "imuRawData");
        this.f292604a = sessionId;
        this.f292605b = status;
        this.f292606c = j2;
        this.d = preferredVideoFrameTimestampSource;
        this.e = videoFrameTimestamps;
        this.f = imuRawData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f292604a, mVar.f292604a) && this.f292605b == mVar.f292605b && this.f292606c == mVar.f292606c && this.d == mVar.d && this.e.equals(mVar.e) && this.f.equals(mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + a0.d.c((this.f292605b.hashCode() + (this.f292604a.hashCode() * 31)) * 31, 31, this.f292606c)) * 31, 31);
    }
}
