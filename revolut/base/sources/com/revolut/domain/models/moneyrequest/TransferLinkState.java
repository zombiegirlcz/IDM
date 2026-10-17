package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/TransferLinkState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTIVE", "REDEEMED", "REJECTED", "EXPIRED", "CANCELLED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferLinkState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferLinkState[] $VALUES;

    @NotNull
    private final String value;
    public static final TransferLinkState ACTIVE = new TransferLinkState("ACTIVE", 0, "ACTIVE");
    public static final TransferLinkState REDEEMED = new TransferLinkState("REDEEMED", 1, "REDEEMED");
    public static final TransferLinkState REJECTED = new TransferLinkState("REJECTED", 2, "REJECTED");
    public static final TransferLinkState EXPIRED = new TransferLinkState("EXPIRED", 3, "EXPIRED");
    public static final TransferLinkState CANCELLED = new TransferLinkState("CANCELLED", 4, "CANCELLED");

    private static final /* synthetic */ TransferLinkState[] $values() {
        return new TransferLinkState[]{ACTIVE, REDEEMED, REJECTED, EXPIRED, CANCELLED};
    }

    static {
        TransferLinkState[] transferLinkStateArr$values = $values();
        $VALUES = transferLinkStateArr$values;
        $ENTRIES = s.n(transferLinkStateArr$values);
    }

    private TransferLinkState(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TransferLinkState valueOf(String str) {
        return (TransferLinkState) Enum.valueOf(TransferLinkState.class, str);
    }

    public static TransferLinkState[] values() {
        return (TransferLinkState[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
