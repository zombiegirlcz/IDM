package sg9;

import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChoiceV2 f262634b;

    public b(String name, ChoiceV2 choice) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f262633a = name;
        this.f262634b = choice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f262633a, bVar.f262633a) && Intrinsics.f(this.f262634b, bVar.f262634b);
    }

    public final int hashCode() {
        return this.f262634b.hashCode() + (this.f262633a.hashCode() * 31);
    }
}
