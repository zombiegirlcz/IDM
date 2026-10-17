package cy5;

import aw0.q0;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky5.a f110046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f110048c;
    public final List d;
    public final Clause e;
    public final q0 f;

    public e() {
        this(0);
    }

    public static e a(e eVar, ky5.a aVar, List list, List list2, List list3, Clause clause, q0 q0Var, int i) {
        if ((i & 1) != 0) {
            aVar = eVar.f110046a;
        }
        ky5.a aVar2 = aVar;
        if ((i & 2) != 0) {
            list = eVar.f110047b;
        }
        List chartItems = list;
        if ((i & 4) != 0) {
            list2 = eVar.f110048c;
        }
        List aboutItems = list2;
        if ((i & 8) != 0) {
            list3 = eVar.d;
        }
        List collectionCurrenciesItems = list3;
        if ((i & 16) != 0) {
            clause = eVar.e;
        }
        Clause clause2 = clause;
        if ((i & 32) != 0) {
            q0Var = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(collectionCurrenciesItems, "collectionCurrenciesItems");
        return new e(aVar2, chartItems, aboutItems, collectionCurrenciesItems, clause2, q0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f110046a, eVar.f110046a) && Intrinsics.f(this.f110047b, eVar.f110047b) && Intrinsics.f(this.f110048c, eVar.f110048c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        ky5.a aVar = this.f110046a;
        int iD = p.a.d(p.a.d(p.a.d((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f110047b), 31, this.f110048c), 31, this.d);
        Clause clause = this.e;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        q0 q0Var = this.f;
        return iHashCode + (q0Var != null ? q0Var.hashCode() : 0);
    }

    public e(ky5.a aVar, List chartItems, List aboutItems, List collectionCurrenciesItems, Clause clause, q0 q0Var) {
        Intrinsics.checkNotNullParameter(chartItems, "chartItems");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(collectionCurrenciesItems, "collectionCurrenciesItems");
        this.f110046a = aVar;
        this.f110047b = chartItems;
        this.f110048c = aboutItems;
        this.d = collectionCurrenciesItems;
        this.e = clause;
        this.f = q0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(int i) {
        f0 f0Var = f0.f322471a;
        this(null, f0Var, f0Var, f0Var, null, null);
    }
}
