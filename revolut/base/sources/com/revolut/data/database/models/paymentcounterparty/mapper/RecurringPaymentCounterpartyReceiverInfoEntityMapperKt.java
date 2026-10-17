package com.revolut.data.database.models.paymentcounterparty.mapper;

import com.revolut.data.database.models.paymentcounterparty.PaymentCounterpartyReceiverInfoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.h;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqua/h;", "Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;", "toEmbeddedEntity", "(Lqua/h;)Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;", "toDomain", "(Lcom/revolut/data/database/models/paymentcounterparty/PaymentCounterpartyReceiverInfoEntity;)Lqua/h;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentCounterpartyReceiverInfoEntityMapperKt {
    @NotNull
    public static final h toDomain(@NotNull PaymentCounterpartyReceiverInfoEntity paymentCounterpartyReceiverInfoEntity) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyReceiverInfoEntity, "<this>");
        return new h(paymentCounterpartyReceiverInfoEntity.getId(), paymentCounterpartyReceiverInfoEntity.getName());
    }

    @NotNull
    public static final PaymentCounterpartyReceiverInfoEntity toEmbeddedEntity(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new PaymentCounterpartyReceiverInfoEntity(hVar.f249297a, hVar.f249298b);
    }
}
