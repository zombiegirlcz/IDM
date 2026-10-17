package xlb;

import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountCreationStepDestination f306982a;

    public e(SavingsAccountCreationStepDestination input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f306982a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f306982a, ((e) obj2).f306982a);
    }

    public final int hashCode() {
        return this.f306982a.hashCode();
    }
}
