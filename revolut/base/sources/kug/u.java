package kug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedbackOptions f189809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xug.a f189810b;

    public u(AccountClosureFeedbackOptions feedbackOptions, xug.a bottomSheetType) {
        Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
        Intrinsics.checkNotNullParameter(bottomSheetType, "bottomSheetType");
        this.f189809a = feedbackOptions;
        this.f189810b = bottomSheetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f189809a, uVar.f189809a) && this.f189810b == uVar.f189810b;
    }

    public final int hashCode() {
        return this.f189810b.hashCode() + (this.f189809a.hashCode() * 31);
    }
}
