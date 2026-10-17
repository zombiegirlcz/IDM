package mg9;

import cli.j;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropdownField f205195a;

    public c(DropdownField formField) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        this.f205195a = formField;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f205195a, ((c) obj2).f205195a);
    }

    public final int hashCode() {
        return this.f205195a.hashCode();
    }
}
