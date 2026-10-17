package com.revolut.data.database.models.vaults.mapper;

import com.revolut.data.database.models.vaults.VaultReceiverInfoEmbeddedEntity;
import fva.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;", "Lfva/m;", "toDomain", "(Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;)Lfva/m;", "toEmbeddedEntity", "(Lfva/m;)Lcom/revolut/data/database/models/vaults/VaultReceiverInfoEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class VaultReceiverEntityMapperKt {
    @NotNull
    public static final m toDomain(@NotNull VaultReceiverInfoEmbeddedEntity vaultReceiverInfoEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(vaultReceiverInfoEmbeddedEntity, "<this>");
        return new m(vaultReceiverInfoEmbeddedEntity.getName());
    }

    @NotNull
    public static final VaultReceiverInfoEmbeddedEntity toEmbeddedEntity(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new VaultReceiverInfoEmbeddedEntity(mVar.f138404a);
    }
}
