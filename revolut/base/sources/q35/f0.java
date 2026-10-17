package q35;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f241814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241815c;
    public final boolean d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aim.o f241816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f241817h;

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
    public f0(String loanCurrency, List allowedPocketTypes, boolean z, boolean z3) {
        k1j.a aVar;
        Intrinsics.checkNotNullParameter(allowedPocketTypes, "allowedPocketTypes");
        Intrinsics.checkNotNullParameter(loanCurrency, "loanCurrency");
        this.f241813a = allowedPocketTypes;
        this.f241814b = z;
        this.f241815c = loanCurrency;
        this.d = z3;
        io3.l lVar = io3.l.CURRENT;
        Pair pair = new Pair(lVar, k1j.a.POCKETS);
        io3.l lVar2 = io3.l.SAVINGS;
        Pair pair2 = new Pair(lVar2, k1j.a.VAULTS);
        io3.l lVar3 = io3.l.SAVINGS_INTEREST_BEARING;
        this.e = r0.k(pair, pair2, new Pair(lVar3, k1j.a.SAVINGS));
        this.f = r0.k(new Pair(lVar, k1j.a.JOINT_ACCOUNT), new Pair(lVar2, k1j.a.JOINT_VAULTS), new Pair(lVar3, k1j.a.JOINT_SAVINGS));
        aim.o oVar = new aim.o();
        Iterator it8 = allowedPocketTypes.iterator();
        while (it8.hasNext()) {
            io3.l lVar4 = (io3.l) it8.next();
            k1j.a aVar2 = (k1j.a) this.e.get(lVar4);
            if (aVar2 != null) {
                oVar.add(aVar2);
            }
            if (this.d && (aVar = (k1j.a) this.f.get(lVar4)) != null) {
                oVar.add(aVar);
            }
        }
        this.f241816g = y0.a(oVar);
        this.f241817h = this.f241814b ? y0.b(this.f241815c) : null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f241813a, f0Var.f241813a) && this.f241814b == f0Var.f241814b && Intrinsics.f(this.f241815c, f0Var.f241815c) && this.d == f0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(j6.a.c(this.f241813a.hashCode() * 31, 31, this.f241814b), 31, this.f241815c);
    }
}
