package gfk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\f\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgfk/c0;", "", "", "toString", "()Ljava/lang/String;", "Lgfk/f0;", "a", "Lgfk/f0;", "e", "()Lgfk/f0;", "user", "Lgfk/e0;", "b", "Lgfk/e0;", "d", "()Lgfk/e0;", "plan", "Lgfk/d0;", "c", "Lgfk/d0;", "()Lgfk/d0;", "family", "Lgfk/c;", "Lgfk/c;", "()Lgfk/c;", "charge", "", "Lgfk/q0;", "Ljava/util/List;", "()Ljava/util/List;", "discounts", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("user")
    @NotNull
    private final f0 user;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("plan")
    @NotNull
    private final e0 plan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("family")
    private final d0 family;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("charge")
    private final c charge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("discounts")
    @NotNull
    private final List<q0> discounts;

    public c0(f0 user, e0 plan, d0 d0Var, c cVar, ArrayList discounts) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        this.user = user;
        this.plan = plan;
        this.family = d0Var;
        this.charge = cVar;
        this.discounts = discounts;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getCharge() {
        return this.charge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d0 getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e0 getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f0 getUser() {
        return this.user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.user, c0Var.user) && Intrinsics.f(this.plan, c0Var.plan) && Intrinsics.f(this.family, c0Var.family) && Intrinsics.f(this.charge, c0Var.charge) && Intrinsics.f(this.discounts, c0Var.discounts);
    }

    public final int hashCode() {
        int iHashCode = (this.plan.hashCode() + (this.user.hashCode() * 31)) * 31;
        d0 d0Var = this.family;
        int iHashCode2 = (iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        c cVar = this.charge;
        return this.discounts.hashCode() + ((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
