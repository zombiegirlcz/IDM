package ip0;

import com.revolut.core.ui_kit.delegates.RadialSliderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p70 implements koi.j, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165781c;
    public int d;
    public final int e;
    public final int f;

    public p70(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i2 = R$attr.uikit_dp0;
        this.f165779a = listId;
        this.f165780b = i;
        this.f165781c = i2;
        this.d = i2;
        this.e = i2;
        this.f = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RadialSliderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55086c() {
        return this.f165779a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p70)) {
            return false;
        }
        p70 p70Var = (p70) obj2;
        return this.f165779a.equals(p70Var.f165779a) && this.f165780b == p70Var.f165780b && this.f165781c == p70Var.f165781c && this.d == p70Var.d && this.e == p70Var.e && this.f == p70Var.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53621s() {
        return this.f165781c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165781c = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f165781c, j6.a.c(j6.a.b(this.f165780b, this.f165779a.hashCode() * 31, 31), 31, false), 31), 31), 31);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53622t() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.e;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof p70 ? (p70) oldItem : null) != null) {
            return new o70(((p70) oldItem).f165780b != this.f165780b, false);
        }
        return null;
    }
}
