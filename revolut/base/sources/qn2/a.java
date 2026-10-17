package qn2;

import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static BankInformation a(rn2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new BankInformation(aVar.getName(), aVar.getLogo(), aVar.getIban() != null ? new BankInformation.Iban(aVar.getIban()) : (aVar.getSortingCode() == null || aVar.getAccountNumber() == null) ? null : new BankInformation.Uk(aVar.getSortingCode(), aVar.getAccountNumber()));
    }
}
