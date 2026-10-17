package com.revolut.data.network.models.recurringpayment.mapper;

import com.revolut.data.network.models.recurringpayment.RecurringPaymentMerchantDto;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.b;
import qua.g;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMerchantDto;", "Lqua/g;", "toDomain", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMerchantDto;)Lqua/g;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MerchantInfoMapperKt {
    @NotNull
    public static final g toDomain(@NotNull RecurringPaymentMerchantDto recurringPaymentMerchantDto) {
        Intrinsics.checkNotNullParameter(recurringPaymentMerchantDto, "<this>");
        String id10 = recurringPaymentMerchantDto.getId();
        String title = recurringPaymentMerchantDto.getTitle();
        String category = recurringPaymentMerchantDto.getCategory();
        String logo = recurringPaymentMerchantDto.getLogo();
        boolean zJ = b.j(recurringPaymentMerchantDto.isBlocked());
        boolean zJ2 = b.j(recurringPaymentMerchantDto.getCanBeBlocked());
        String blockedMerchantId = recurringPaymentMerchantDto.getBlockedMerchantId();
        String blockDate = recurringPaymentMerchantDto.getBlockDate();
        return new g(id10, title, category, logo, zJ, zJ2, blockedMerchantId, blockDate != null ? LocalDate.parse(blockDate) : null, recurringPaymentMerchantDto.getReferenceId());
    }
}
