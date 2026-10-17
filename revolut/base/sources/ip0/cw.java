package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class cw {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cw[] $VALUES;
    public static final cw AMEX;
    public static final cw APPLE_PAY;
    public static final cw CONTACTLESS;
    public static final cw GOOGLE_PAY;
    public static final cw MASTERCARD;
    public static final cw REVOLUT_PAY;
    public static final cw VISA;

    static {
        cw cwVar = new cw("REVOLUT_PAY", 0);
        REVOLUT_PAY = cwVar;
        cw cwVar2 = new cw("VISA", 1);
        VISA = cwVar2;
        cw cwVar3 = new cw("MASTERCARD", 2);
        MASTERCARD = cwVar3;
        cw cwVar4 = new cw("AMEX", 3);
        AMEX = cwVar4;
        cw cwVar5 = new cw("APPLE_PAY", 4);
        APPLE_PAY = cwVar5;
        cw cwVar6 = new cw("GOOGLE_PAY", 5);
        GOOGLE_PAY = cwVar6;
        cw cwVar7 = new cw("CONTACTLESS", 6);
        CONTACTLESS = cwVar7;
        cw[] cwVarArr = {cwVar, cwVar2, cwVar3, cwVar4, cwVar5, cwVar6, cwVar7};
        $VALUES = cwVarArr;
        $ENTRIES = vc.s.n(cwVarArr);
    }

    public static cw valueOf(String str) {
        return (cw) Enum.valueOf(cw.class, str);
    }

    public static cw[] values() {
        return (cw[]) $VALUES.clone();
    }
}
