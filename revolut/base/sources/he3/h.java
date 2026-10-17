package he3;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.o3;
import tof.t4;
import tof.u4;
import tof.v4;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f151559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151560b;

    public h(List connectedEntities, a3 originalTransaction) {
        Intrinsics.checkNotNullParameter(originalTransaction, "originalTransaction");
        Intrinsics.checkNotNullParameter(connectedEntities, "connectedEntities");
        this.f151559a = originalTransaction;
        this.f151560b = connectedEntities;
    }

    public final List a(xi0.b desiredCurrency, boolean z) {
        dj0.d dVarA0;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(desiredCurrency, "targetCcy");
        a3 a3Var = this.f151559a;
        v4 v4Var = a3Var.u;
        if (!(v4Var instanceof u4)) {
            if (v4Var instanceof t4) {
                return z ? f0.f322471a : b(desiredCurrency);
            }
            if (v4Var == null) {
                return b(desiredCurrency);
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        Intrinsics.checkNotNullParameter(desiredCurrency, "desiredCurrency");
        dj0.d dVar2 = a3Var.k;
        dj0.d dVar3 = null;
        u4 u4Var = v4Var instanceof u4 ? (u4) v4Var : null;
        if (u4Var != null) {
            dj0.d dVar4 = u4Var.f273101a;
            if (Intrinsics.f(dVar4.f115083b, desiredCurrency)) {
                dVarA0 = pyd.c.U(dVar4, t1.a(dVar2));
            } else {
                o3 o3Var = a3Var.J;
                if (o3Var != null && (dVar = o3Var.f272965a) != null && Intrinsics.f(dVar.f115083b, desiredCurrency)) {
                    dVar3 = dVar;
                }
                dVarA0 = (dVar3 == null || dVar4.k()) ? pyd.c.U(dVar4, t1.a(dVar2)) : pyd.c.U(pyd.c.K(dVar4, t1.D(dVar3) / t1.D(dVar2), desiredCurrency), t1.a(dVar3));
            }
        } else {
            dVarA0 = t1.a0(a3Var, desiredCurrency);
        }
        return u.c(dVarA0);
    }

    public final ArrayList b(xi0.b bVar) {
        List list;
        a3 a3Var = this.f151559a;
        ArrayList arrayListN = v.n(t1.a0(a3Var, bVar));
        List<g> list2 = this.f151560b;
        if (list2.isEmpty()) {
            k71.o oVarA0 = k71.k.a0(a3Var);
            k71.n nVar = oVarA0 instanceof k71.n ? (k71.n) oVarA0 : null;
            arrayListN.add(nVar != null ? nVar.f181793b : null);
        } else {
            ArrayList arrayList = new ArrayList();
            for (g gVar : list2) {
                if (gVar instanceof f) {
                    list = ((f) gVar).f151558a;
                } else {
                    if (!(gVar instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = ((e) gVar).f151557a;
                }
                a0.x(list, arrayList);
            }
            a0.x(arrayList, arrayListN);
        }
        return d0.Z(arrayListN);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f151559a, hVar.f151559a) && Intrinsics.f(this.f151560b, hVar.f151560b);
    }

    public final int hashCode() {
        return this.f151560b.hashCode() + (this.f151559a.hashCode() * 31);
    }
}
