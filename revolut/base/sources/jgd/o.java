package jgd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f173976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f173977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f173978c;
    public final boolean d;
    public final List e;

    public o(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, List navBarMenuItems, List items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f173976a = navBarTitle;
        this.f173977b = navBarDescription;
        this.f173978c = navBarMenuItems;
        this.d = z;
        this.e = items;
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f173976a.equals(oVar.f173976a) && this.f173977b.equals(oVar.f173977b) && Intrinsics.f(this.f173978c, oVar.f173978c) && this.d == oVar.d && this.e.equals(oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.d(t61.a.a(this.f173976a.hashCode() * 31, 31, this.f173977b), 31, this.f173978c), 31, this.d);
    }
}
