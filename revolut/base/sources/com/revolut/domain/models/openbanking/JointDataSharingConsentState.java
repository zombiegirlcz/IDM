package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/openbanking/JointDataSharingConsentState;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "CURRENT_USER_REJECTED", "PEER_REJECTED", "BOTH_REJECTED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointDataSharingConsentState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JointDataSharingConsentState[] $VALUES;
    public static final JointDataSharingConsentState ACCEPTED = new JointDataSharingConsentState("ACCEPTED", 0);
    public static final JointDataSharingConsentState CURRENT_USER_REJECTED = new JointDataSharingConsentState("CURRENT_USER_REJECTED", 1);
    public static final JointDataSharingConsentState PEER_REJECTED = new JointDataSharingConsentState("PEER_REJECTED", 2);
    public static final JointDataSharingConsentState BOTH_REJECTED = new JointDataSharingConsentState("BOTH_REJECTED", 3);

    private static final /* synthetic */ JointDataSharingConsentState[] $values() {
        return new JointDataSharingConsentState[]{ACCEPTED, CURRENT_USER_REJECTED, PEER_REJECTED, BOTH_REJECTED};
    }

    static {
        JointDataSharingConsentState[] jointDataSharingConsentStateArr$values = $values();
        $VALUES = jointDataSharingConsentStateArr$values;
        $ENTRIES = s.n(jointDataSharingConsentStateArr$values);
    }

    private JointDataSharingConsentState(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static JointDataSharingConsentState valueOf(String str) {
        return (JointDataSharingConsentState) Enum.valueOf(JointDataSharingConsentState.class, str);
    }

    public static JointDataSharingConsentState[] values() {
        return (JointDataSharingConsentState[]) $VALUES.clone();
    }
}
