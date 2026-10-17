package dsf;

import com.revolut.feature.transfer_reasons.api.navigation.LegalConfirmationInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegalConfirmationInputData f117307a;

    public a(LegalConfirmationInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f117307a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f117307a, ((a) obj2).f117307a);
    }

    public final int hashCode() {
        return this.f117307a.hashCode();
    }
}
