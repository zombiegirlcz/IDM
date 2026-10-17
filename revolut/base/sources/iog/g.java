package iog;

import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDetails f163319a;

    public g(PersonalDetails personalDetails) {
        Intrinsics.checkNotNullParameter(personalDetails, "personalDetails");
        this.f163319a = personalDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f163319a, ((g) obj2).f163319a);
    }

    public final int hashCode() {
        return this.f163319a.hashCode();
    }
}
