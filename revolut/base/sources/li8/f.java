package li8;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDetailsForm f195429a;

    public f(PersonalDetailsForm form) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.f195429a = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f195429a, ((f) obj2).f195429a);
    }

    public final int hashCode() {
        return this.f195429a.hashCode();
    }
}
