package aw7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreenContract$UIState$Page;
import java.util.List;
import jki.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f10745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10746c;
    public final PlanComparisonScreenContract$UIState$Page d;
    public final List e;
    public final Clause f;

    public k(List items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, PlanComparisonScreenContract$UIState$Page planComparisonScreenContract$UIState$Page, List tabs, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f10744a = items;
        this.f10745b = title;
        this.f10746c = textLocalisedClause;
        this.d = planComparisonScreenContract$UIState$Page;
        this.e = tabs;
        this.f = textLocalisedClause2;
    }

    @Override // jki.m
    public final o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof k) {
            return new j(!Intrinsics.f(((k) oldState).d, this.d));
        }
        return null;
    }

    @Override // jki.n
    public final List c() {
        return this.f10744a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f10744a, kVar.f10744a) && this.f10745b.equals(kVar.f10745b) && Intrinsics.f(this.f10746c, kVar.f10746c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f10744a.hashCode() * 31, 31, this.f10745b);
        Clause clause = this.f10746c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        PlanComparisonScreenContract$UIState$Page planComparisonScreenContract$UIState$Page = this.d;
        int iD = p.a.d((iHashCode + (planComparisonScreenContract$UIState$Page == null ? 0 : planComparisonScreenContract$UIState$Page.hashCode())) * 31, 31, this.e);
        Clause clause2 = this.f;
        return iD + (clause2 != null ? clause2.hashCode() : 0);
    }
}
