package cbl;

import aii.r;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Question f22892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SuspiciousTransactionDialogAnswer f22893b;

    public c(SuspiciousTransactionDialog.Question question, SuspiciousTransactionDialogAnswer answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f22892a = question;
        this.f22893b = answer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f22892a, cVar.f22892a) && Intrinsics.f(this.f22893b, cVar.f22893b);
    }

    public final int hashCode() {
        return this.f22893b.hashCode() + (this.f22892a.hashCode() * 31);
    }
}
