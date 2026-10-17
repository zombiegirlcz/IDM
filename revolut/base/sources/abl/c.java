package abl;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog f2981a;

    public c(SuspiciousTransactionDialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f2981a = dialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f2981a, ((c) obj2).f2981a);
    }

    public final int hashCode() {
        return this.f2981a.hashCode();
    }
}
