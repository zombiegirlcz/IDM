package kbk;

import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingButton;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanGiftingHyperText f182629c;
    public final PlanGiftingHyperText d;
    public final PlanGiftingHyperText e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f182630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PlanGiftingButton f182631h;
    public final PlanGiftingButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PlanGiftingButton f182632j;
    public final PlanGiftingRefund k;

    public j(String id10, String planId, PlanGiftingHyperText title, PlanGiftingHyperText subtitle, PlanGiftingHyperText terms, d asset, String actionButton, PlanGiftingButton planGiftingButton, PlanGiftingButton planGiftingButton2, PlanGiftingButton planGiftingButton3, PlanGiftingRefund planGiftingRefund) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.f182627a = id10;
        this.f182628b = planId;
        this.f182629c = title;
        this.d = subtitle;
        this.e = terms;
        this.f = asset;
        this.f182630g = actionButton;
        this.f182631h = planGiftingButton;
        this.i = planGiftingButton2;
        this.f182632j = planGiftingButton3;
        this.k = planGiftingRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f182627a, jVar.f182627a) && Intrinsics.f(this.f182628b, jVar.f182628b) && Intrinsics.f(this.f182629c, jVar.f182629c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f182630g, jVar.f182630g) && Intrinsics.f(this.f182631h, jVar.f182631h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f182632j, jVar.f182632j) && Intrinsics.f(this.k, jVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f182629c.hashCode() + p.a.c(this.f182627a.hashCode() * 31, 31, this.f182628b)) * 31)) * 31)) * 31)) * 31, 31, this.f182630g);
        PlanGiftingButton planGiftingButton = this.f182631h;
        int iHashCode = (iC + (planGiftingButton == null ? 0 : planGiftingButton.f102432a.hashCode())) * 31;
        PlanGiftingButton planGiftingButton2 = this.i;
        int iHashCode2 = (iHashCode + (planGiftingButton2 == null ? 0 : planGiftingButton2.f102432a.hashCode())) * 31;
        PlanGiftingButton planGiftingButton3 = this.f182632j;
        int iHashCode3 = (iHashCode2 + (planGiftingButton3 == null ? 0 : planGiftingButton3.f102432a.hashCode())) * 31;
        PlanGiftingRefund planGiftingRefund = this.k;
        return iHashCode3 + (planGiftingRefund != null ? planGiftingRefund.hashCode() : 0);
    }
}
