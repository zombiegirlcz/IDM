package li8;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDetailsForm f195430a;

    public g(PersonalDetailsForm form) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.f195430a = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f195430a, ((g) obj2).f195430a);
    }

    public final int hashCode() {
        return this.f195430a.hashCode();
    }
}
