package go2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.DropdownFormField$Choice;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropdownFormField$Choice f145079a;

    public e(DropdownFormField$Choice choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f145079a = choice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f145079a, ((e) obj2).f145079a);
    }

    public final int hashCode() {
        return this.f145079a.hashCode();
    }
}
