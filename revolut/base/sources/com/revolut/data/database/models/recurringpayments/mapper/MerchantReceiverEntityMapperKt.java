package com.revolut.data.database.models.recurringpayments.mapper;

import com.revolut.data.database.models.recurringpayments.MerchantEmbeddedEntity;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.g;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "Lqua/g;", "toDomain", "(Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;)Lqua/g;", "toEmbeddedEntity", "(Lqua/g;)Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MerchantReceiverEntityMapperKt {
    @NotNull
    public static final g toDomain(@NotNull MerchantEmbeddedEntity merchantEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(merchantEmbeddedEntity, "<this>");
        String id10 = merchantEmbeddedEntity.getId();
        String str = id10.length() == 0 ? null : id10;
        String title = merchantEmbeddedEntity.getTitle();
        String logo = merchantEmbeddedEntity.getLogo();
        String category = merchantEmbeddedEntity.getCategory();
        boolean zIsBlocked = merchantEmbeddedEntity.isBlocked();
        boolean canBeBlocked = merchantEmbeddedEntity.getCanBeBlocked();
        String blockedMerchantId = merchantEmbeddedEntity.getBlockedMerchantId();
        String blockDate = merchantEmbeddedEntity.getBlockDate();
        return new g(str, title, category, logo, zIsBlocked, canBeBlocked, blockedMerchantId, blockDate != null ? LocalDate.parse(blockDate) : null, merchantEmbeddedEntity.getReferenceId());
    }

    @NotNull
    public static final MerchantEmbeddedEntity toEmbeddedEntity(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f249292a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = gVar.f249293b;
        String str4 = gVar.d;
        String str5 = gVar.f249294c;
        boolean z = gVar.e;
        boolean z3 = gVar.f;
        String str6 = gVar.f249295g;
        LocalDate localDate = gVar.f249296h;
        return new MerchantEmbeddedEntity(str2, str3, str4, str5, z, z3, str6, localDate != null ? localDate.toString() : null, gVar.i);
    }
}
