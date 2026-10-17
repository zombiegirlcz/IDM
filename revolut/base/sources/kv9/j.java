package kv9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EMOJI;
    public static final j GIF;
    public static final j KEY;
    public static final j PLAN_GIFTING;
    public static final j PLAN_REFERRAL;
    public static final j REACTIONS;
    public static final j REFERRAL;
    public static final j SALARY_REFERRAL;
    public static final j STICKER;
    public static final j TEXT;

    static {
        j jVar = new j("GIF", 0);
        GIF = jVar;
        j jVar2 = new j("STICKER", 1);
        STICKER = jVar2;
        j jVar3 = new j("PLAN_GIFTING", 2);
        PLAN_GIFTING = jVar3;
        j jVar4 = new j("PLAN_REFERRAL", 3);
        PLAN_REFERRAL = jVar4;
        j jVar5 = new j("REFERRAL", 4);
        REFERRAL = jVar5;
        j jVar6 = new j("EMOJI", 5);
        EMOJI = jVar6;
        j jVar7 = new j("REACTIONS", 6);
        REACTIONS = jVar7;
        j jVar8 = new j("KEY", 7);
        KEY = jVar8;
        j jVar9 = new j("TEXT", 8);
        TEXT = jVar9;
        j jVar10 = new j("SALARY_REFERRAL", 9);
        SALARY_REFERRAL = jVar10;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
