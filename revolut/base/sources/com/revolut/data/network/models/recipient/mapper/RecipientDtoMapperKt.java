package com.revolut.data.network.models.recipient.mapper;

import com.revolut.data.network.models.recipient.RecipientDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vua.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/recipient/RecipientDto;", "Lvua/a;", "toDomain", "(Lcom/revolut/data/network/models/recipient/RecipientDto;)Lvua/a;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecipientDtoMapperKt {
    @NotNull
    public static final a toDomain(@NotNull RecipientDto recipientDto) {
        Intrinsics.checkNotNullParameter(recipientDto, "<this>");
        return new a(recipientDto.getId(), recipientDto.getFirstName(), recipientDto.getLastName(), recipientDto.getAccount(), recipientDto.getUsername(), recipientDto.getCode());
    }
}
