package sug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedback f265761a;

    public g(AccountClosureFeedback feedback) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f265761a = feedback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f265761a, ((g) obj2).f265761a);
    }

    public final int hashCode() {
        return this.f265761a.hashCode();
    }
}
