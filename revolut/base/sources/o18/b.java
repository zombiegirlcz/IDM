package o18;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EARNING_CALL;
    public static final b EXTERNAL_SUGGESTION;
    public static final b FUNDAMENTAL_METRIC_CHANGE;
    public static final b PRICE_MOVEMENT;
    public static final b PRICE_TARGET_CHANGE;
    public static final b REVOLUT_RECOMMENDATION;
    public static final b UNKNOWN;

    static {
        b bVar = new b("PRICE_MOVEMENT", 0);
        PRICE_MOVEMENT = bVar;
        b bVar2 = new b("REVOLUT_RECOMMENDATION", 1);
        REVOLUT_RECOMMENDATION = bVar2;
        b bVar3 = new b("EXTERNAL_SUGGESTION", 2);
        EXTERNAL_SUGGESTION = bVar3;
        b bVar4 = new b("FUNDAMENTAL_METRIC_CHANGE", 3);
        FUNDAMENTAL_METRIC_CHANGE = bVar4;
        b bVar5 = new b("PRICE_TARGET_CHANGE", 4);
        PRICE_TARGET_CHANGE = bVar5;
        b bVar6 = new b("EARNING_CALL", 5);
        EARNING_CALL = bVar6;
        b bVar7 = new b("UNKNOWN", 6);
        UNKNOWN = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
