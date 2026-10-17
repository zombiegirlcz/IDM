package imk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.api.models.c f162551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f162552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f162553c;
    public final Clause d;
    public final boolean e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimatedBackgroundType f162554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f162555h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f162556j;

    public w(com.revolut.retail.feature.pricing_plans.ui.api.models.c style, Clause title, TextClause navigationTitle, Clause clause, boolean z, v vVar, AnimatedBackgroundType animatedBackgroundType, ArrayList menuItems, ArrayList actions, Set highlightedActionIds) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(highlightedActionIds, "highlightedActionIds");
        this.f162551a = style;
        this.f162552b = title;
        this.f162553c = navigationTitle;
        this.d = clause;
        this.e = z;
        this.f = vVar;
        this.f162554g = animatedBackgroundType;
        this.f162555h = menuItems;
        this.i = actions;
        this.f162556j = highlightedActionIds;
    }

    @Override // imk.y
    public final com.revolut.retail.feature.pricing_plans.ui.api.models.c a() {
        return this.f162551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f162551a == wVar.f162551a && this.f162552b.equals(wVar.f162552b) && this.f162553c.equals(wVar.f162553c) && Intrinsics.f(this.d, wVar.d) && this.e == wVar.e && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f162554g, wVar.f162554g) && this.f162555h.equals(wVar.f162555h) && this.i.equals(wVar.i) && Intrinsics.f(this.f162556j, wVar.f162556j);
    }

    public final int hashCode() {
        int iB = v7.b(p.a.a(this.f162551a.hashCode() * 31, 31, this.f162552b), 31, this.f162553c);
        Clause clause = this.d;
        int iC = j6.a.c((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        v vVar = this.f;
        int iHashCode = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f162554g;
        return this.f162556j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f162555h, (iHashCode + (animatedBackgroundType != null ? animatedBackgroundType.hashCode() : 0)) * 31, 31), 31);
    }
}
