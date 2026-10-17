package ghk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f143974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarMenuItem f143975c;
    public final Integer d;
    public final List e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b f143976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimatedBackgroundType f143977h;

    public o(String selectedPlanId, Clause title, NavBarMenuItem navBarMenuItem, Integer num, List planTabs, h buttons, com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.b footer, AnimatedBackgroundType background) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(planTabs, "planTabs");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f143973a = selectedPlanId;
        this.f143974b = title;
        this.f143975c = navBarMenuItem;
        this.d = num;
        this.e = planTabs;
        this.f = buttons;
        this.f143976g = footer;
        this.f143977h = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f143973a, oVar.f143973a) && Intrinsics.f(this.f143974b, oVar.f143974b) && Intrinsics.f(this.f143975c, oVar.f143975c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f143976g, oVar.f143976g) && Intrinsics.f(this.f143977h, oVar.f143977h);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f143973a.hashCode() * 31, 31, this.f143974b);
        NavBarMenuItem navBarMenuItem = this.f143975c;
        int iHashCode = (iA + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31;
        Integer num = this.d;
        return this.f143977h.hashCode() + ((this.f143976g.hashCode() + ((this.f.hashCode() + p.a.d((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }
}
