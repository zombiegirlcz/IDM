package o3j;

import aii.r;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$Choice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefinitionSelectorContract$Choice f221827a;

    public b(DefinitionSelectorContract$Choice choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f221827a = choice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f221827a, ((b) obj2).f221827a);
    }

    public final int hashCode() {
        return this.f221827a.hashCode();
    }
}
