package com.revolut.data.database.models.credit.mapper;

import com.revolut.data.database.models.credit.PayLaterReceiverEmbeddedEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tua.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltua/d;", "Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "toEmbeddedEntity", "(Ltua/d;)Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;", "toDomain", "(Lcom/revolut/data/database/models/credit/PayLaterReceiverEmbeddedEntity;)Ltua/d;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PayLaterReceiverEmbeddedEntityMapperKt {
    @NotNull
    public static final d toDomain(@NotNull PayLaterReceiverEmbeddedEntity payLaterReceiverEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(payLaterReceiverEmbeddedEntity, "<this>");
        return new d(payLaterReceiverEmbeddedEntity.getInstalmentState(), payLaterReceiverEmbeddedEntity.getFee(), payLaterReceiverEmbeddedEntity.getPlanId(), payLaterReceiverEmbeddedEntity.getInstalmentIndex(), payLaterReceiverEmbeddedEntity.getInstalmentCount(), payLaterReceiverEmbeddedEntity.getMerchantName(), payLaterReceiverEmbeddedEntity.getMerchantLogoName(), payLaterReceiverEmbeddedEntity.getMerchantCategory(), payLaterReceiverEmbeddedEntity.getRepaymentSource(), payLaterReceiverEmbeddedEntity.getLogoUrl(), payLaterReceiverEmbeddedEntity.getFeeAmount());
    }

    @NotNull
    public static final PayLaterReceiverEmbeddedEntity toEmbeddedEntity(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new PayLaterReceiverEmbeddedEntity(dVar.f274549a, dVar.f274550b, dVar.f274551c, dVar.d, dVar.e, dVar.f, dVar.f274552g, dVar.f274553h, dVar.i, dVar.f274554j, dVar.k);
    }
}
