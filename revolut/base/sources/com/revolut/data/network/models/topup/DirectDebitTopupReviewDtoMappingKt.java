package com.revolut.data.network.models.topup;

import e71.c;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/topup/DirectDebitTopupReviewDto;", "Le71/c;", "toDomain", "(Lcom/revolut/data/network/models/topup/DirectDebitTopupReviewDto;)Le71/c;", "feature_topup_screen_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitTopupReviewDtoMappingKt {
    @NotNull
    public static final c toDomain(@NotNull DirectDebitTopupReviewDto directDebitTopupReviewDto) {
        Intrinsics.checkNotNullParameter(directDebitTopupReviewDto, "<this>");
        LocalDate localDate = LocalDate.parse(directDebitTopupReviewDto.getEstimatedValueDate(), DateTimeFormatter.ISO_LOCAL_DATE);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return new c(localDate);
    }
}
