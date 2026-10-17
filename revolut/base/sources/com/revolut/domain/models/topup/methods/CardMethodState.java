package com.revolut.domain.models.topup.methods;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/topup/methods/CardMethodState;", "", "<init>", "(Ljava/lang/String;I)V", "EXPIRED", "ACTIVE", "BLOCKED", "AVAILABLE_OTHER_PROFILE", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardMethodState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardMethodState[] $VALUES;
    public static final CardMethodState EXPIRED = new CardMethodState("EXPIRED", 0);
    public static final CardMethodState ACTIVE = new CardMethodState("ACTIVE", 1);
    public static final CardMethodState BLOCKED = new CardMethodState("BLOCKED", 2);
    public static final CardMethodState AVAILABLE_OTHER_PROFILE = new CardMethodState("AVAILABLE_OTHER_PROFILE", 3);

    private static final /* synthetic */ CardMethodState[] $values() {
        return new CardMethodState[]{EXPIRED, ACTIVE, BLOCKED, AVAILABLE_OTHER_PROFILE};
    }

    static {
        CardMethodState[] cardMethodStateArr$values = $values();
        $VALUES = cardMethodStateArr$values;
        $ENTRIES = s.n(cardMethodStateArr$values);
    }

    private CardMethodState(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CardMethodState valueOf(String str) {
        return (CardMethodState) Enum.valueOf(CardMethodState.class, str);
    }

    public static CardMethodState[] values() {
        return (CardMethodState[]) $VALUES.clone();
    }
}
