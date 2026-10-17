package com.revolut.feature.credit.loan.api.models.rev10;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final boolean a(LoanBackupCard loanBackupCard) {
        Intrinsics.checkNotNullParameter(loanBackupCard, "<this>");
        return (loanBackupCard instanceof LoanBackupCard.ExternalCard) && ((LoanBackupCard.ExternalCard) loanBackupCard).f70129a;
    }
}
