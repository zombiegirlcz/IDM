package br4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AUTO_PAY;
    public static final h CANCEL_CREDIT_CARD;
    public static final h CREDIT_CARDS;
    public static final h CREDIT_CARD_LIMIT;

    @NotNull
    public static final g Companion;
    public static final h DISPLAY_AMOUNT;
    public static final h DOCUMENTS_RATES_INFO;
    public static final h DUE_DATE;
    public static final h GET_HELP;
    public static final h PLAN_BENEFITS;
    public static final h PROMOTIONAL_PERIOD;
    public static final h STATEMENTS;

    @NotNull
    private static final Map<String, h> actionById;

    @NotNull
    private final String value;

    static {
        h hVar = new h("PROMOTIONAL_PERIOD", 0, "promotional_period");
        PROMOTIONAL_PERIOD = hVar;
        h hVar2 = new h("PLAN_BENEFITS", 1, "PLAN_BENEFITS");
        PLAN_BENEFITS = hVar2;
        h hVar3 = new h("CREDIT_CARDS", 2, "CREDIT_CARDS");
        CREDIT_CARDS = hVar3;
        h hVar4 = new h("CREDIT_CARD_LIMIT", 3, "CREDIT_CARD_LIMIT");
        CREDIT_CARD_LIMIT = hVar4;
        h hVar5 = new h("STATEMENTS", 4, "STATEMENTS");
        STATEMENTS = hVar5;
        h hVar6 = new h("AUTO_PAY", 5, "AUTO_PAY");
        AUTO_PAY = hVar6;
        h hVar7 = new h("DUE_DATE", 6, "DUE_DATE");
        DUE_DATE = hVar7;
        h hVar8 = new h("DISPLAY_AMOUNT", 7, "DISPLAY_AMOUNT");
        DISPLAY_AMOUNT = hVar8;
        h hVar9 = new h("DOCUMENTS_RATES_INFO", 8, "DOCUMENTS_RATES_INFO");
        DOCUMENTS_RATES_INFO = hVar9;
        h hVar10 = new h("GET_HELP", 9, "GET_HELP");
        GET_HELP = hVar10;
        h hVar11 = new h("CANCEL_CREDIT_CARD", 10, "CANCEL_CREDIT_CARD");
        CANCEL_CREDIT_CARD = hVar11;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        $VALUES = hVarArr;
        him.a aVarN = vc.s.n(hVarArr);
        $ENTRIES = aVarN;
        Companion = new g();
        int iB = q0.b(zhm.w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((h) obj2).value, obj2);
        }
        actionById = linkedHashMap;
    }

    public h(String str, int i, String str2) {
        this.value = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
