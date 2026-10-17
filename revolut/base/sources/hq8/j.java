package hq8;

import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTasksTransferTaxes f154632a;

    public j(JuniorTasksTransferTaxes taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f154632a = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f154632a, ((j) obj2).f154632a);
    }

    public final int hashCode() {
        return this.f154632a.hashCode();
    }
}
