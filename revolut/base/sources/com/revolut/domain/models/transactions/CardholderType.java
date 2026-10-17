package com.revolut.domain.models.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/transactions/CardholderType;", "", "<init>", "(Ljava/lang/String;I)V", "PERSONAL", "JUNIOR", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardholderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardholderType[] $VALUES;
    public static final CardholderType PERSONAL = new CardholderType("PERSONAL", 0);
    public static final CardholderType JUNIOR = new CardholderType("JUNIOR", 1);

    private static final /* synthetic */ CardholderType[] $values() {
        return new CardholderType[]{PERSONAL, JUNIOR};
    }

    static {
        CardholderType[] cardholderTypeArr$values = $values();
        $VALUES = cardholderTypeArr$values;
        $ENTRIES = s.n(cardholderTypeArr$values);
    }

    private CardholderType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CardholderType valueOf(String str) {
        return (CardholderType) Enum.valueOf(CardholderType.class, str);
    }

    public static CardholderType[] values() {
        return (CardholderType[]) $VALUES.clone();
    }
}
