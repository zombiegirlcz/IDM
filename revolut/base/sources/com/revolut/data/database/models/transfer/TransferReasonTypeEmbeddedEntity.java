package com.revolut.data.database.models.transfer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/database/models/transfer/TransferReasonTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "PREDEFINED", "CUSTOM", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferReasonTypeEmbeddedEntity[] $VALUES;

    @b("PREDEFINED")
    public static final TransferReasonTypeEmbeddedEntity PREDEFINED = new TransferReasonTypeEmbeddedEntity("PREDEFINED", 0);

    @b("CUSTOM")
    public static final TransferReasonTypeEmbeddedEntity CUSTOM = new TransferReasonTypeEmbeddedEntity("CUSTOM", 1);

    private static final /* synthetic */ TransferReasonTypeEmbeddedEntity[] $values() {
        return new TransferReasonTypeEmbeddedEntity[]{PREDEFINED, CUSTOM};
    }

    static {
        TransferReasonTypeEmbeddedEntity[] transferReasonTypeEmbeddedEntityArr$values = $values();
        $VALUES = transferReasonTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(transferReasonTypeEmbeddedEntityArr$values);
    }

    private TransferReasonTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TransferReasonTypeEmbeddedEntity valueOf(String str) {
        return (TransferReasonTypeEmbeddedEntity) Enum.valueOf(TransferReasonTypeEmbeddedEntity.class, str);
    }

    public static TransferReasonTypeEmbeddedEntity[] values() {
        return (TransferReasonTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
