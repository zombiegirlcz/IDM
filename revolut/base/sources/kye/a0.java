package kye;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedMethod f190697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f190699c;
    public final TopupMethod.SuggestedMethod d;

    public a0(SelectedMethod selectedMethod, dj0.d amount, TopUpTarget topUpTarget, TopupMethod.SuggestedMethod suggestedMethod) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f190697a = selectedMethod;
        this.f190698b = amount;
        this.f190699c = topUpTarget;
        this.d = suggestedMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f190697a, a0Var.f190697a) && Intrinsics.f(this.f190698b, a0Var.f190698b) && Intrinsics.f(this.f190699c, a0Var.f190699c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f190699c.hashCode() + v7.c(this.f190697a.hashCode() * 31, 31, this.f190698b)) * 31;
        TopupMethod.SuggestedMethod suggestedMethod = this.d;
        return iHashCode + (suggestedMethod == null ? 0 : suggestedMethod.hashCode());
    }
}
