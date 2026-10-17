package dlk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CHAT_CLOSE;
    public static final t DOWNGRADE_FEES_AND_TERMS;
    public static final t DOWNGRADE_LEGIBILITY;
    public static final t DOWNGRADE_REASONS_RESULT;
    public static final t NO_OFFERS;
    public static final t OFFER_REJECTED;

    static {
        t tVar = new t("NO_OFFERS", 0);
        NO_OFFERS = tVar;
        t tVar2 = new t("DOWNGRADE_FEES_AND_TERMS", 1);
        DOWNGRADE_FEES_AND_TERMS = tVar2;
        t tVar3 = new t("DOWNGRADE_REASONS_RESULT", 2);
        DOWNGRADE_REASONS_RESULT = tVar3;
        t tVar4 = new t("DOWNGRADE_LEGIBILITY", 3);
        DOWNGRADE_LEGIBILITY = tVar4;
        t tVar5 = new t("CHAT_CLOSE", 4);
        CHAT_CLOSE = tVar5;
        t tVar6 = new t("OFFER_REJECTED", 5);
        OFFER_REJECTED = tVar6;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
