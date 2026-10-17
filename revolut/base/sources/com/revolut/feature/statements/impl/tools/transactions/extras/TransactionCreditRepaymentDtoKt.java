package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n35.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCreditRepaymentDto;", "Ln35/a;", "toDomain", "(Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCreditRepaymentDto;)Ln35/a;", "toTransactionDto", "(Ln35/a;)Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCreditRepaymentDto;", "retail_feature_statements_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransactionCreditRepaymentDtoKt {
    public static final a toDomain(TransactionCreditRepaymentDto transactionCreditRepaymentDto) {
        if (transactionCreditRepaymentDto == null) {
            return null;
        }
        String date = transactionCreditRepaymentDto.getDate();
        long interest = transactionCreditRepaymentDto.getInterest();
        String currency = transactionCreditRepaymentDto.getCurrency();
        String str = currency == null ? "" : currency;
        LocalDateTime localDateTime = LocalDateTime.parse(transactionCreditRepaymentDto.getDate());
        Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
        long principal = transactionCreditRepaymentDto.getPrincipal();
        Double apr = transactionCreditRepaymentDto.getApr();
        double dDoubleValue = apr != null ? apr.doubleValue() : 0.0d;
        String displayCard = transactionCreditRepaymentDto.getDisplayCard();
        String transactionId = transactionCreditRepaymentDto.getTransactionId();
        return new a(date, interest, principal, str, localDateTime, displayCard, dDoubleValue, transactionId == null ? "" : transactionId);
    }

    @NotNull
    public static final TransactionCreditRepaymentDto toTransactionDto(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long j2 = aVar.f211866b;
        long j3 = aVar.f211867c;
        String string = aVar.e.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str = aVar.f;
        String str2 = aVar.d;
        double d = aVar.f211868g;
        return new TransactionCreditRepaymentDto(j2, j3, string, str2, str, Double.valueOf(d), aVar.f211869h);
    }
}
