package com.revolut.data.database.models.recipient.mapper;

import com.revolut.data.database.models.recipient.RecipientEmbeddedEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vua.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "Lvua/a;", "toDomain", "(Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;)Lvua/a;", "toEmbeddedEntity", "(Lvua/a;)Lcom/revolut/data/database/models/recipient/RecipientEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecipientEmbeddedEntityMapperKt {
    @NotNull
    public static final a toDomain(@NotNull RecipientEmbeddedEntity recipientEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(recipientEmbeddedEntity, "<this>");
        return new a(recipientEmbeddedEntity.getId(), recipientEmbeddedEntity.getFirstName(), recipientEmbeddedEntity.getLastName(), recipientEmbeddedEntity.getAccount(), recipientEmbeddedEntity.getUsername(), recipientEmbeddedEntity.getCode());
    }

    @NotNull
    public static final RecipientEmbeddedEntity toEmbeddedEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new RecipientEmbeddedEntity(aVar.f292279a, aVar.f292280b, aVar.f292281c, aVar.d, aVar.f, aVar.e);
    }
}
