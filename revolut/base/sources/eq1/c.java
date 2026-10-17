package eq1;

import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillFormV2 f128220a;

    public c(BillFormV2 form) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.f128220a = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f128220a, ((c) obj2).f128220a);
    }

    public final int hashCode() {
        return this.f128220a.hashCode();
    }
}
