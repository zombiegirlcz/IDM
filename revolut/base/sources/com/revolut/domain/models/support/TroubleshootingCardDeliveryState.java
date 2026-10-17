package com.revolut.domain.models.support;

import d71.n;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/support/TroubleshootingCardDeliveryState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "DELIVERED", "UNTRACKED_ON_WAY", "UNTRACKED_SHOULD_DELIVERED", "BEING_POSTED", "TRACKED_ON_WAY", "TRACKED_SHOULD_DELIVERED", "toDeliveryMethod", "", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshootingCardDeliveryState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TroubleshootingCardDeliveryState[] $VALUES;
    public static final TroubleshootingCardDeliveryState UNKNOWN = new TroubleshootingCardDeliveryState("UNKNOWN", 0);
    public static final TroubleshootingCardDeliveryState DELIVERED = new TroubleshootingCardDeliveryState("DELIVERED", 1);
    public static final TroubleshootingCardDeliveryState UNTRACKED_ON_WAY = new TroubleshootingCardDeliveryState("UNTRACKED_ON_WAY", 2);
    public static final TroubleshootingCardDeliveryState UNTRACKED_SHOULD_DELIVERED = new TroubleshootingCardDeliveryState("UNTRACKED_SHOULD_DELIVERED", 3);
    public static final TroubleshootingCardDeliveryState BEING_POSTED = new TroubleshootingCardDeliveryState("BEING_POSTED", 4);
    public static final TroubleshootingCardDeliveryState TRACKED_ON_WAY = new TroubleshootingCardDeliveryState("TRACKED_ON_WAY", 5);
    public static final TroubleshootingCardDeliveryState TRACKED_SHOULD_DELIVERED = new TroubleshootingCardDeliveryState("TRACKED_SHOULD_DELIVERED", 6);

    private static final /* synthetic */ TroubleshootingCardDeliveryState[] $values() {
        return new TroubleshootingCardDeliveryState[]{UNKNOWN, DELIVERED, UNTRACKED_ON_WAY, UNTRACKED_SHOULD_DELIVERED, BEING_POSTED, TRACKED_ON_WAY, TRACKED_SHOULD_DELIVERED};
    }

    static {
        TroubleshootingCardDeliveryState[] troubleshootingCardDeliveryStateArr$values = $values();
        $VALUES = troubleshootingCardDeliveryStateArr$values;
        $ENTRIES = s.n(troubleshootingCardDeliveryStateArr$values);
    }

    private TroubleshootingCardDeliveryState(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TroubleshootingCardDeliveryState valueOf(String str) {
        return (TroubleshootingCardDeliveryState) Enum.valueOf(TroubleshootingCardDeliveryState.class, str);
    }

    public static TroubleshootingCardDeliveryState[] values() {
        return (TroubleshootingCardDeliveryState[]) $VALUES.clone();
    }

    @NotNull
    public final String toDeliveryMethod() {
        int i = n.f111773a[ordinal()];
        return (i == 1 || i == 2 || i == 3) ? "TRACKED" : "STANDARD";
    }
}
