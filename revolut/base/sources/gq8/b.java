package gq8;

import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTasksTransferTaxes f145593a;

    public b(JuniorTasksTransferTaxes taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f145593a = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f145593a, ((b) obj2).f145593a);
    }

    public final int hashCode() {
        return this.f145593a.hashCode();
    }
}
