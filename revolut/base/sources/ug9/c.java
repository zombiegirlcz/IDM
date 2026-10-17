package ug9;

import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepeaterDropdownField f279987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279988b;

    public c(RepeaterDropdownField formField, List fieldInputs) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
        this.f279987a = formField;
        this.f279988b = fieldInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f279987a, cVar.f279987a) && Intrinsics.f(this.f279988b, cVar.f279988b);
    }

    public final int hashCode() {
        return this.f279988b.hashCode() + (this.f279987a.hashCode() * 31);
    }
}
