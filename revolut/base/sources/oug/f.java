package oug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedbackFeature f229873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229874b;

    public f(AccountClosureFeedbackFeature feature, String str) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f229873a = feature;
        this.f229874b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f229873a, fVar.f229873a) && Intrinsics.f(this.f229874b, fVar.f229874b);
    }

    public final int hashCode() {
        int iHashCode = this.f229873a.hashCode() * 31;
        String str = this.f229874b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
