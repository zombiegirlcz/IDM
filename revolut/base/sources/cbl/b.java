package cbl;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Question f22891a;

    public b(SuspiciousTransactionDialog.Question question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.f22891a = question;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f22891a, ((b) obj2).f22891a);
    }

    public final int hashCode() {
        return this.f22891a.hashCode();
    }
}
