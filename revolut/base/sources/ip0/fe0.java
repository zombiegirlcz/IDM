package ip0;

import com.revolut.core.ui_kit.delegates.ShowPinDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fe0 implements koi.j, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164246c;
    public final int d;
    public final int e;

    public fe0(TextClause pin, int i) {
        int i2 = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter("CARD_PIN_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f164244a = pin;
        this.f164245b = i;
        this.f164246c = i2;
        this.d = i2;
        this.e = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ShowPinDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53482a() {
        return "CARD_PIN_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fe0)) {
            return false;
        }
        fe0 fe0Var = (fe0) obj2;
        return this.f164244a.equals(fe0Var.f164244a) && this.f164245b == fe0Var.f164245b && this.f164246c == fe0Var.f164246c && this.d == fe0Var.d && this.e == fe0Var.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f164245b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164245b = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f164246c, j6.a.b(this.f164245b, v7.b(2076062589, 31, this.f164244a), 31), 31), 31);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.f164246c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164246c = i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.d;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof fe0 ? (fe0) oldItem : null) != null) {
            return new ge0(!((fe0) oldItem).f164244a.equals(this.f164244a));
        }
        return null;
    }
}
