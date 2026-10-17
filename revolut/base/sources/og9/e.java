package og9;

import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropdownField f225058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225059b;

    public e(DropdownField formField, String searchQuery) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f225058a = formField;
        this.f225059b = searchQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225058a, eVar.f225058a) && Intrinsics.f(this.f225059b, eVar.f225059b);
    }

    public final int hashCode() {
        return this.f225059b.hashCode() + (this.f225058a.hashCode() * 31);
    }
}
