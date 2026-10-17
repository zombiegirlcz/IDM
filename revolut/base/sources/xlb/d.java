package xlb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f306979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavingsChallengeOnboarding f306981c;
    public final String d;
    public final SavingsOnboardingFlowContract$Step e;

    public d(List filteredProducts, List allProducts, SavingsChallengeOnboarding savingsChallengeOnboarding, String str, SavingsOnboardingFlowContract$Step savingsOnboardingFlowContract$Step) {
        Intrinsics.checkNotNullParameter(filteredProducts, "filteredProducts");
        Intrinsics.checkNotNullParameter(allProducts, "allProducts");
        this.f306979a = filteredProducts;
        this.f306980b = allProducts;
        this.f306981c = savingsChallengeOnboarding;
        this.d = str;
        this.e = savingsOnboardingFlowContract$Step;
    }

    public static d a(d dVar, List list, List list2, SavingsChallengeOnboarding savingsChallengeOnboarding, String str, SavingsOnboardingFlowContract$Step savingsOnboardingFlowContract$Step, int i) {
        if ((i & 1) != 0) {
            list = dVar.f306979a;
        }
        List filteredProducts = list;
        if ((i & 2) != 0) {
            list2 = dVar.f306980b;
        }
        List allProducts = list2;
        if ((i & 4) != 0) {
            savingsChallengeOnboarding = dVar.f306981c;
        }
        SavingsChallengeOnboarding savingsChallengeOnboarding2 = savingsChallengeOnboarding;
        if ((i & 8) != 0) {
            str = dVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            savingsOnboardingFlowContract$Step = dVar.e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(filteredProducts, "filteredProducts");
        Intrinsics.checkNotNullParameter(allProducts, "allProducts");
        return new d(filteredProducts, allProducts, savingsChallengeOnboarding2, str2, savingsOnboardingFlowContract$Step);
    }

    public final ArrayList c(ncd.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List list = this.f306979a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((SavingsProductData) obj2).f86683a.f86619c == type) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f306979a, dVar.f306979a) && Intrinsics.f(this.f306980b, dVar.f306980b) && Intrinsics.f(this.f306981c, dVar.f306981c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f306979a.hashCode() * 31, 31, this.f306980b);
        SavingsChallengeOnboarding savingsChallengeOnboarding = this.f306981c;
        int iHashCode = (iD + (savingsChallengeOnboarding == null ? 0 : savingsChallengeOnboarding.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SavingsOnboardingFlowContract$Step savingsOnboardingFlowContract$Step = this.e;
        return iHashCode2 + (savingsOnboardingFlowContract$Step != null ? savingsOnboardingFlowContract$Step.hashCode() : 0);
    }
}
