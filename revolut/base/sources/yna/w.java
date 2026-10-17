package yna;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f315380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f315381c;
    public final Data d;
    public final Clause e;
    public final Data f;

    public w(Data subscriptionData, Data pricingPlansData, Data pendingOrderData, Data revPointsBalance, TextLocalisedClause textLocalisedClause, Data nudgeState) {
        Intrinsics.checkNotNullParameter(subscriptionData, "subscriptionData");
        Intrinsics.checkNotNullParameter(pricingPlansData, "pricingPlansData");
        Intrinsics.checkNotNullParameter(pendingOrderData, "pendingOrderData");
        Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
        Intrinsics.checkNotNullParameter(nudgeState, "nudgeState");
        this.f315379a = subscriptionData;
        this.f315380b = pricingPlansData;
        this.f315381c = pendingOrderData;
        this.d = revPointsBalance;
        this.e = textLocalisedClause;
        this.f = nudgeState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f315379a, wVar.f315379a) && Intrinsics.f(this.f315380b, wVar.f315380b) && Intrinsics.f(this.f315381c, wVar.f315381c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f315381c, kii.e.c(this.f315380b, this.f315379a.hashCode() * 31, 31), 31), 31);
        Clause clause = this.e;
        return this.f.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
