package mci;

import com.revolut.feature_retail_user_declarations.terms_review.TermsReviewInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsReviewInputData f204361a;

    public a(TermsReviewInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204361a = inputData;
    }

    public final TermsReviewInputData b() {
        return this.f204361a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f204361a, ((a) obj2).f204361a);
    }

    public final int hashCode() {
        return this.f204361a.hashCode();
    }
}
