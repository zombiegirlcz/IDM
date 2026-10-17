package com.revolut.data.database.models.creditor.mapper;

import com.revolut.data.database.models.creditor.CreditorEmbeddedEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uua.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "Luua/a;", "toDomain", "(Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;)Luua/a;", "toEmbeddedEntity", "(Luua/a;)Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CreditorEmbeddedEntityMapperKt {
    @NotNull
    public static final a toDomain(@NotNull CreditorEmbeddedEntity creditorEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(creditorEmbeddedEntity, "<this>");
        return new a(creditorEmbeddedEntity.getId(), creditorEmbeddedEntity.getName(), creditorEmbeddedEntity.getLogo(), creditorEmbeddedEntity.getBgColor(), null);
    }

    @NotNull
    public static final CreditorEmbeddedEntity toEmbeddedEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new CreditorEmbeddedEntity(aVar.f283188a, aVar.f283189b, aVar.f283190c, aVar.d);
    }
}
