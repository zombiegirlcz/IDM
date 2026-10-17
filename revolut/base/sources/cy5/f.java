package cy5;

import aw0.q0;
import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky5.a f110049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f110050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f110051c;
    public final ArrayList d;

    public f(ky5.a aVar, Clause clause, q0 q0Var, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110049a = aVar;
        this.f110050b = clause;
        this.f110051c = q0Var;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f110049a, fVar.f110049a) && Intrinsics.f(this.f110050b, fVar.f110050b) && Intrinsics.f(this.f110051c, fVar.f110051c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        ky5.a aVar = this.f110049a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Clause clause = this.f110050b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        q0 q0Var = this.f110051c;
        return this.d.hashCode() + ((iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0)) * 31);
    }
}
