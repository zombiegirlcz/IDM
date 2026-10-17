package v44;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f285952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f285953c;
    public final boolean d;
    public final List e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f285954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f285955h;
    public final boolean i;

    public k(aim.e items, TextLocalisedClause toolbarTitle, Clause clause, boolean z, List menuItems, Integer num, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f285951a = items;
        this.f285952b = toolbarTitle;
        this.f285953c = clause;
        this.d = z;
        this.e = menuItems;
        this.f = num;
        this.f285954g = z3;
        this.f285955h = z4;
        this.i = z6;
    }

    @Override // cli.p
    public final List c() {
        return this.f285951a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f285951a, kVar.f285951a) && this.f285952b.equals(kVar.f285952b) && Intrinsics.f(this.f285953c, kVar.f285953c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f285954g == kVar.f285954g && this.f285955h == kVar.f285955h && this.i == kVar.i;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f285951a.hashCode() * 31, 31, this.f285952b);
        Clause clause = this.f285953c;
        int iD = p.a.d(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c((iD + (num != null ? num.hashCode() : 0)) * 31, 31, this.f285954g), 31, this.f285955h);
    }
}
