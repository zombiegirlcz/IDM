package ug9;

import cli.j;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepeaterDropdownField f279985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279986b;

    public b(RepeaterDropdownField formField, List fieldInputs) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(fieldInputs, "fieldInputs");
        this.f279985a = formField;
        this.f279986b = fieldInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f279985a, bVar.f279985a) && Intrinsics.f(this.f279986b, bVar.f279986b);
    }

    public final int hashCode() {
        return this.f279986b.hashCode() + (this.f279985a.hashCode() * 31);
    }
}
