package mug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedback f209028a;

    public f(AccountClosureFeedback feedback) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f209028a = feedback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f209028a, ((f) obj2).f209028a);
    }

    public final int hashCode() {
        return this.f209028a.hashCode();
    }
}
