package ar0;

import com.revolut.core.ui_kit.views.q;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f8486c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8487g;

    public e(String listId, g selectionDetails, q tabItem, boolean z, boolean z3, boolean z4, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectionDetails, "selectionDetails");
        Intrinsics.checkNotNullParameter(tabItem, "tabItem");
        this.f8484a = listId;
        this.f8485b = selectionDetails;
        this.f8486c = tabItem;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f8487g = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f8484a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f8484a, eVar.f8484a) && Intrinsics.f(this.f8485b, eVar.f8485b) && Intrinsics.f(this.f8486c, eVar.f8486c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.f8487g == eVar.f8487g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8487g) + j6.a.c(j6.a.c(j6.a.c((this.f8486c.hashCode() + ((this.f8485b.hashCode() + (this.f8484a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof e)) {
            return null;
        }
        e eVar = (e) oldItem;
        boolean z12 = !eVar.f8485b.equals(this.f8485b);
        boolean z29 = !eVar.f8486c.equals(this.f8486c);
        if (eVar.d != this.d) {
            z = true;
            z3 = z29;
            z4 = true;
        } else {
            z = true;
            z3 = z29;
            z4 = false;
        }
        if (eVar.e != this.e) {
            z6 = z;
        } else {
            z6 = z;
            z = false;
        }
        if (eVar.f != this.f) {
            z11 = z6;
        } else {
            z11 = z6;
            z6 = false;
        }
        return new f(z12, z3, z4, z, z6, eVar.f8487g != this.f8487g ? z11 : false);
    }
}
