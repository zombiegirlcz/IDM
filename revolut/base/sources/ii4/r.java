package ii4;

import com.revolut.data.model.Data;
import hs3.u1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f161548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f161549c;
    public final it3.d d;

    public r(Data applicationData, g0 spinnerPayload, u1 u1Var, it3.d dVar) {
        Intrinsics.checkNotNullParameter(applicationData, "applicationData");
        Intrinsics.checkNotNullParameter(spinnerPayload, "spinnerPayload");
        this.f161547a = applicationData;
        this.f161548b = spinnerPayload;
        this.f161549c = u1Var;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f161547a, rVar.f161547a) && Intrinsics.f(this.f161548b, rVar.f161548b) && Intrinsics.f(this.f161549c, rVar.f161549c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f161548b.hashCode() + (this.f161547a.hashCode() * 31)) * 31;
        u1 u1Var = this.f161549c;
        int iHashCode2 = (iHashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        it3.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
