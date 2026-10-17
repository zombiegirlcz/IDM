package xy2;

import aii.e;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardIssuanceAgreementControllerContract$InputData f309556a;

    public b(CardIssuanceAgreementControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f309556a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309556a, ((b) obj2).f309556a);
    }

    public final int hashCode() {
        return this.f309556a.hashCode();
    }
}
