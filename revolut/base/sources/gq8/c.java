package gq8;

import aii.r;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTasksTransferTaxes f145594a;

    public c(JuniorTasksTransferTaxes taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f145594a = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f145594a, ((c) obj2).f145594a);
    }

    public final int hashCode() {
        return this.f145594a.hashCode();
    }
}
