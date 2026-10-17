package mg9;

import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropdownField f205196a;

    public d(DropdownField formField) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        this.f205196a = formField;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f205196a, ((d) obj2).f205196a);
    }

    public final int hashCode() {
        return this.f205196a.hashCode();
    }
}
