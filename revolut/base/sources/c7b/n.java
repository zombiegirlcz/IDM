package c7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlan f21904a;

    public n(CobrandedCardsPlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f21904a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f21904a, ((n) obj2).f21904a);
    }

    public final int hashCode() {
        return this.f21904a.hashCode();
    }
}
