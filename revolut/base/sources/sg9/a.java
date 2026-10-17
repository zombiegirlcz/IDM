package sg9;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillFormField.Choice f262632b;

    public a(String name, BillFormField.Choice choice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f262631a = name;
        this.f262632b = choice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f262631a, aVar.f262631a) && Intrinsics.f(this.f262632b, aVar.f262632b);
    }

    public final int hashCode() {
        return this.f262632b.hashCode() + (this.f262631a.hashCode() * 31);
    }
}
