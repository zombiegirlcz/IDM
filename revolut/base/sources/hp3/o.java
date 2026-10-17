package hp3;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f154422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154424c;
    public final List d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f154425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f154426h;
    public final boolean i;

    public o(Clause navBarTitle, List navBarMenuItems, List items, List tabs, String selectedTab, Integer num, Integer num2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f154422a = navBarTitle;
        this.f154423b = navBarMenuItems;
        this.f154424c = items;
        this.d = tabs;
        this.e = selectedTab;
        this.f = num;
        this.f154425g = num2;
        this.f154426h = z;
        this.i = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f154424c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f154422a, oVar.f154422a) && Intrinsics.f(this.f154423b, oVar.f154423b) && Intrinsics.f(this.f154424c, oVar.f154424c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f154425g, oVar.f154425g) && this.f154426h == oVar.f154426h && this.i == oVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.d(p.a.d(this.f154422a.hashCode() * 31, 31, this.f154423b), 31, this.f154424c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f154425g;
        return Boolean.hashCode(this.i) + j6.a.c((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f154426h);
    }
}
