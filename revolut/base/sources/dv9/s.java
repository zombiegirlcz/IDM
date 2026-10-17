package dv9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s EMOJI;
    public static final s GIF;
    public static final s GIPHY_GIF_ID;
    public static final s KEY;
    public static final s PLAN_GIFTING;
    public static final s PLAN_REFERRAL;
    public static final s REFERRAL;
    public static final s SALARY_REFERRAL;
    public static final s STICKER;
    public static final s TEXT;

    static {
        s sVar = new s("GIF", 0);
        GIF = sVar;
        s sVar2 = new s("STICKER", 1);
        STICKER = sVar2;
        s sVar3 = new s("GIPHY_GIF_ID", 2);
        GIPHY_GIF_ID = sVar3;
        s sVar4 = new s("REFERRAL", 3);
        REFERRAL = sVar4;
        s sVar5 = new s("EMOJI", 4);
        EMOJI = sVar5;
        s sVar6 = new s("TEXT", 5);
        TEXT = sVar6;
        s sVar7 = new s("KEY", 6);
        KEY = sVar7;
        s sVar8 = new s("PLAN_GIFTING", 7);
        PLAN_GIFTING = sVar8;
        s sVar9 = new s("PLAN_REFERRAL", 8);
        PLAN_REFERRAL = sVar9;
        s sVar10 = new s("SALARY_REFERRAL", 9);
        SALARY_REFERRAL = sVar10;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
