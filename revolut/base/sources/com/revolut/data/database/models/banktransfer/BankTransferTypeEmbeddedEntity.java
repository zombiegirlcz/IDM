package com.revolut.data.database.models.banktransfer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/data/database/models/banktransfer/BankTransferTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BankTransferTypeEmbeddedEntity[] $VALUES;

    @b("STANDARD")
    public static final BankTransferTypeEmbeddedEntity STANDARD = new BankTransferTypeEmbeddedEntity("STANDARD", 0);

    private static final /* synthetic */ BankTransferTypeEmbeddedEntity[] $values() {
        return new BankTransferTypeEmbeddedEntity[]{STANDARD};
    }

    static {
        BankTransferTypeEmbeddedEntity[] bankTransferTypeEmbeddedEntityArr$values = $values();
        $VALUES = bankTransferTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(bankTransferTypeEmbeddedEntityArr$values);
    }

    private BankTransferTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BankTransferTypeEmbeddedEntity valueOf(String str) {
        return (BankTransferTypeEmbeddedEntity) Enum.valueOf(BankTransferTypeEmbeddedEntity.class, str);
    }

    public static BankTransferTypeEmbeddedEntity[] values() {
        return (BankTransferTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
