package com.revolut.data.database.models.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/revolut/data/database/models/transfer/TransferReasonEmbeddedEntity;", "", "type", "Lcom/revolut/data/database/models/transfer/TransferReasonTypeEmbeddedEntity;", "code", "", "description", "exportDetails", "Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;", "<init>", "(Lcom/revolut/data/database/models/transfer/TransferReasonTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;)V", "getType", "()Lcom/revolut/data/database/models/transfer/TransferReasonTypeEmbeddedEntity;", "getCode", "()Ljava/lang/String;", "getDescription", "getExportDetails", "()Lcom/revolut/data/database/models/transfer/TransferOverseaGoodsDetailsEmbeddedEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonEmbeddedEntity {

    @b("code")
    private final String code;

    @b("description")
    @NotNull
    private final String description;

    @b("export_details")
    private final TransferOverseaGoodsDetailsEmbeddedEntity exportDetails;

    @b("type")
    @NotNull
    private final TransferReasonTypeEmbeddedEntity type;

    public TransferReasonEmbeddedEntity(@NotNull TransferReasonTypeEmbeddedEntity type, String str, @NotNull String description, TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.type = type;
        this.code = str;
        this.description = description;
        this.exportDetails = transferOverseaGoodsDetailsEmbeddedEntity;
    }

    public static /* synthetic */ TransferReasonEmbeddedEntity copy$default(TransferReasonEmbeddedEntity transferReasonEmbeddedEntity, TransferReasonTypeEmbeddedEntity transferReasonTypeEmbeddedEntity, String str, String str2, TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity, int i, Object obj2) {
        if ((i & 1) != 0) {
            transferReasonTypeEmbeddedEntity = transferReasonEmbeddedEntity.type;
        }
        if ((i & 2) != 0) {
            str = transferReasonEmbeddedEntity.code;
        }
        if ((i & 4) != 0) {
            str2 = transferReasonEmbeddedEntity.description;
        }
        if ((i & 8) != 0) {
            transferOverseaGoodsDetailsEmbeddedEntity = transferReasonEmbeddedEntity.exportDetails;
        }
        return transferReasonEmbeddedEntity.copy(transferReasonTypeEmbeddedEntity, str, str2, transferOverseaGoodsDetailsEmbeddedEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TransferReasonTypeEmbeddedEntity getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TransferOverseaGoodsDetailsEmbeddedEntity getExportDetails() {
        return this.exportDetails;
    }

    @NotNull
    public final TransferReasonEmbeddedEntity copy(@NotNull TransferReasonTypeEmbeddedEntity type, String code, @NotNull String description, TransferOverseaGoodsDetailsEmbeddedEntity exportDetails) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        return new TransferReasonEmbeddedEntity(type, code, description, exportDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferReasonEmbeddedEntity)) {
            return false;
        }
        TransferReasonEmbeddedEntity transferReasonEmbeddedEntity = (TransferReasonEmbeddedEntity) other;
        return this.type == transferReasonEmbeddedEntity.type && Intrinsics.f(this.code, transferReasonEmbeddedEntity.code) && Intrinsics.f(this.description, transferReasonEmbeddedEntity.description) && Intrinsics.f(this.exportDetails, transferReasonEmbeddedEntity.exportDetails);
    }

    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final TransferOverseaGoodsDetailsEmbeddedEntity getExportDetails() {
        return this.exportDetails;
    }

    @NotNull
    public final TransferReasonTypeEmbeddedEntity getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.code;
        int iC = a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        TransferOverseaGoodsDetailsEmbeddedEntity transferOverseaGoodsDetailsEmbeddedEntity = this.exportDetails;
        return iC + (transferOverseaGoodsDetailsEmbeddedEntity != null ? transferOverseaGoodsDetailsEmbeddedEntity.hashCode() : 0);
    }
}
