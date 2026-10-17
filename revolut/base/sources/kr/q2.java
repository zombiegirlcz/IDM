package kr;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class q2 {

    @NotNull
    public static final g2 Companion = new g2();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f188563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f188564c;
    public final List d;
    public final k2 e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new kl7.w0(28)), null, yhm.j.c(kVar, new kl7.w0(29)), null};
    }

    public /* synthetic */ q2(int i, String str, p2 p2Var, long j2, List list, k2 k2Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(f2.f188494a.getDescriptor(), i, 31);
            throw null;
        }
        this.f188562a = str;
        this.f188563b = p2Var;
        this.f188564c = j2;
        this.d = list;
        this.e = k2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f188562a, q2Var.f188562a) && this.f188563b == q2Var.f188563b && this.f188564c == q2Var.f188564c && Intrinsics.f(this.d, q2Var.d) && Intrinsics.f(this.e, q2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(a0.d.c((this.f188563b.hashCode() + (this.f188562a.hashCode() * 31)) * 31, 31, this.f188564c), 31, this.d);
    }

    public q2(String sessionId, p2 status, long j2, ArrayList videoFrameTimestampsNanoseconds, k2 imuRawData) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(videoFrameTimestampsNanoseconds, "videoFrameTimestampsNanoseconds");
        Intrinsics.checkNotNullParameter(imuRawData, "imuRawData");
        this.f188562a = sessionId;
        this.f188563b = status;
        this.f188564c = j2;
        this.d = videoFrameTimestampsNanoseconds;
        this.e = imuRawData;
    }
}
