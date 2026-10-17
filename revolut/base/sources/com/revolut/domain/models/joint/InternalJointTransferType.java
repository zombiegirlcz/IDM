package com.revolut.domain.models.joint;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/joint/InternalJointTransferType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_UP_TO_JOINT", "TOP_UP_FROM_PERSONAL", "WITHDRAW_TO_PERSONAL", "WITHDRAW_FROM_JOINT", "TOP_UP_FROM_PEER", "WITHDRAW_TO_PEER", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalJointTransferType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InternalJointTransferType[] $VALUES;
    public static final InternalJointTransferType TOP_UP_TO_JOINT = new InternalJointTransferType("TOP_UP_TO_JOINT", 0);
    public static final InternalJointTransferType TOP_UP_FROM_PERSONAL = new InternalJointTransferType("TOP_UP_FROM_PERSONAL", 1);
    public static final InternalJointTransferType WITHDRAW_TO_PERSONAL = new InternalJointTransferType("WITHDRAW_TO_PERSONAL", 2);
    public static final InternalJointTransferType WITHDRAW_FROM_JOINT = new InternalJointTransferType("WITHDRAW_FROM_JOINT", 3);
    public static final InternalJointTransferType TOP_UP_FROM_PEER = new InternalJointTransferType("TOP_UP_FROM_PEER", 4);
    public static final InternalJointTransferType WITHDRAW_TO_PEER = new InternalJointTransferType("WITHDRAW_TO_PEER", 5);

    private static final /* synthetic */ InternalJointTransferType[] $values() {
        return new InternalJointTransferType[]{TOP_UP_TO_JOINT, TOP_UP_FROM_PERSONAL, WITHDRAW_TO_PERSONAL, WITHDRAW_FROM_JOINT, TOP_UP_FROM_PEER, WITHDRAW_TO_PEER};
    }

    static {
        InternalJointTransferType[] internalJointTransferTypeArr$values = $values();
        $VALUES = internalJointTransferTypeArr$values;
        $ENTRIES = s.n(internalJointTransferTypeArr$values);
    }

    private InternalJointTransferType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InternalJointTransferType valueOf(String str) {
        return (InternalJointTransferType) Enum.valueOf(InternalJointTransferType.class, str);
    }

    public static InternalJointTransferType[] values() {
        return (InternalJointTransferType[]) $VALUES.clone();
    }
}
