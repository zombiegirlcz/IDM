package com.revolut.data.database.models.credit.mapper;

import com.revolut.data.database.models.credit.LoanReceiverEmbeddedEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tua.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltua/c;", "Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "toEmbeddedEntity", "(Ltua/c;)Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "toDomain", "(Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;)Ltua/c;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LoanReceiverEmbeddedEntityMapperKt {
    @NotNull
    public static final c toDomain(@NotNull LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(loanReceiverEmbeddedEntity, "<this>");
        return new c(loanReceiverEmbeddedEntity.getLoanId(), loanReceiverEmbeddedEntity.getRepaymentId(), loanReceiverEmbeddedEntity.getLoanName());
    }

    @NotNull
    public static final LoanReceiverEmbeddedEntity toEmbeddedEntity(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new LoanReceiverEmbeddedEntity(cVar.f274546a, cVar.f274547b, cVar.f274548c);
    }
}
