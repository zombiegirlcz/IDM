package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f120794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120796c;
    public final u d;
    public final z2 e;

    public v(long j2, long j3, String text, u style, z2 z2Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f120794a = j2;
        this.f120795b = j3;
        this.f120796c = text;
        this.d = style;
        this.e = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f120794a == vVar.f120794a && this.f120795b == vVar.f120795b && Intrinsics.f(this.f120796c, vVar.f120796c) && this.d == vVar.d && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(a0.d.c(Long.hashCode(this.f120794a) * 31, 31, this.f120795b), 31, this.f120796c)) * 31;
        z2 z2Var = this.e;
        return iHashCode + (z2Var == null ? 0 : z2Var.hashCode());
    }
}
