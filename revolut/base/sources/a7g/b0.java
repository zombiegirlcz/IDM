package a7g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1877c;
    public final List d;
    public final q e;

    public b0(List items, a0 searchInputUiState, List menuItems, List quickFilters, q toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchInputUiState, "searchInputUiState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(quickFilters, "quickFilters");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f1875a = items;
        this.f1876b = searchInputUiState;
        this.f1877c = menuItems;
        this.d = quickFilters;
        this.e = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f1875a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f1875a, b0Var.f1875a) && Intrinsics.f(this.f1876b, b0Var.f1876b) && Intrinsics.f(this.f1877c, b0Var.f1877c) && Intrinsics.f(this.d, b0Var.d) && this.e == b0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.d((this.f1876b.hashCode() + (this.f1875a.hashCode() * 31)) * 31, 31, this.f1877c), 31, this.d);
    }
}
