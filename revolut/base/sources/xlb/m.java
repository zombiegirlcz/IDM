package xlb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f306989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavingsChallengeOnboarding f306991c;
    public final String d;

    public m(List filteredProducts, List allProducts, SavingsChallengeOnboarding savingsChallengeOnboarding, String str) {
        Intrinsics.checkNotNullParameter(filteredProducts, "filteredProducts");
        Intrinsics.checkNotNullParameter(allProducts, "allProducts");
        this.f306989a = filteredProducts;
        this.f306990b = allProducts;
        this.f306991c = savingsChallengeOnboarding;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f306989a, mVar.f306989a) && Intrinsics.f(this.f306990b, mVar.f306990b) && Intrinsics.f(this.f306991c, mVar.f306991c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f306989a.hashCode() * 31, 31, this.f306990b);
        SavingsChallengeOnboarding savingsChallengeOnboarding = this.f306991c;
        int iHashCode = (iD + (savingsChallengeOnboarding == null ? 0 : savingsChallengeOnboarding.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
