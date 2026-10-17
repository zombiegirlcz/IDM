package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/TransferLinkDirection;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INCOMING", "OUTGOING", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferLinkDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferLinkDirection[] $VALUES;
    public static final TransferLinkDirection INCOMING = new TransferLinkDirection("INCOMING", 0, "IN");
    public static final TransferLinkDirection OUTGOING = new TransferLinkDirection("OUTGOING", 1, "OUT");

    @NotNull
    private final String value;

    private static final /* synthetic */ TransferLinkDirection[] $values() {
        return new TransferLinkDirection[]{INCOMING, OUTGOING};
    }

    static {
        TransferLinkDirection[] transferLinkDirectionArr$values = $values();
        $VALUES = transferLinkDirectionArr$values;
        $ENTRIES = s.n(transferLinkDirectionArr$values);
    }

    private TransferLinkDirection(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TransferLinkDirection valueOf(String str) {
        return (TransferLinkDirection) Enum.valueOf(TransferLinkDirection.class, str);
    }

    public static TransferLinkDirection[] values() {
        return (TransferLinkDirection[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
