package kai;

import aii.e;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditConsentInputData f182493a;

    public a(CreditConsentInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f182493a = inputData;
    }

    public final CreditConsentInputData b() {
        return this.f182493a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f182493a, ((a) obj2).f182493a);
    }

    public final int hashCode() {
        return this.f182493a.hashCode();
    }
}
