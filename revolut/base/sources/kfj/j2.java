package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006'"}, d2 = {"Lkfj/j2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "g", "type", "c", "e", "state", "Lkfj/l2;", "d", "Lkfj/l2;", "h", "()Lkfj/l2;", "upsell", "Lkfj/i2;", "Lkfj/i2;", "()Lkfj/i2;", "offer", "f", "pricingPlanId", "Lkfj/h2;", "Lkfj/h2;", "()Lkfj/h2;", "mobilePlan", "Lkfj/b5;", "Lkfj/b5;", "()Lkfj/b5;", "terms", "Lkfj/c5;", "i", "Lkfj/c5;", "()Lkfj/c5;", "validityDisclaimer", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("upsell")
    private final l2 upsell;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("offer")
    private final i2 offer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pricingPlanId")
    private final String pricingPlanId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlan")
    @NotNull
    private final h2 mobilePlan;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final b5 terms;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("validityDisclaimer")
    private final c5 validityDisclaimer;

    public j2(String id10, String type, String state, l2 l2Var, i2 i2Var, String str, h2 mobilePlan, b5 terms, c5 c5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.upsell = l2Var;
        this.offer = i2Var;
        this.pricingPlanId = str;
        this.mobilePlan = mobilePlan;
        this.terms = terms;
        this.validityDisclaimer = c5Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h2 getMobilePlan() {
        return this.mobilePlan;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i2 getOffer() {
        return this.offer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPricingPlanId() {
        return this.pricingPlanId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.id, j2Var.id) && Intrinsics.f(this.type, j2Var.type) && Intrinsics.f(this.state, j2Var.state) && Intrinsics.f(this.upsell, j2Var.upsell) && Intrinsics.f(this.offer, j2Var.offer) && Intrinsics.f(this.pricingPlanId, j2Var.pricingPlanId) && Intrinsics.f(this.mobilePlan, j2Var.mobilePlan) && Intrinsics.f(this.terms, j2Var.terms) && Intrinsics.f(this.validityDisclaimer, j2Var.validityDisclaimer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b5 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l2 getUpsell() {
        return this.upsell;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state);
        l2 l2Var = this.upsell;
        int iHashCode = (iC + (l2Var == null ? 0 : l2Var.hashCode())) * 31;
        i2 i2Var = this.offer;
        int iHashCode2 = (iHashCode + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        String str = this.pricingPlanId;
        int iHashCode3 = (this.terms.hashCode() + ((this.mobilePlan.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        c5 c5Var = this.validityDisclaimer;
        return iHashCode3 + (c5Var != null ? c5Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c5 getValidityDisclaimer() {
        return this.validityDisclaimer;
    }
}
