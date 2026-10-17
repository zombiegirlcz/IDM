package ebl;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Warning f124385a;

    public c(SuspiciousTransactionDialog.Warning warning) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        this.f124385a = warning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f124385a, ((c) obj2).f124385a);
    }

    public final int hashCode() {
        return this.f124385a.hashCode();
    }
}
