package zy5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k STORY_ADD_MONEY;
    public static final k STORY_APM_BIZUM;
    public static final k STORY_APM_BLIK;
    public static final k STORY_APM_BREB;
    public static final k STORY_APM_WERO;
    public static final k STORY_DETAILS;
    public static final k STORY_MOVE_MONEY;
    public static final k STORY_MULTIBANCO_WAY;
    public static final k STORY_PAYID;
    public static final k STORY_PIX;
    public static final k STORY_UPI;

    static {
        k kVar = new k("STORY_ADD_MONEY", 0);
        STORY_ADD_MONEY = kVar;
        k kVar2 = new k("STORY_MOVE_MONEY", 1);
        STORY_MOVE_MONEY = kVar2;
        k kVar3 = new k("STORY_DETAILS", 2);
        STORY_DETAILS = kVar3;
        k kVar4 = new k("STORY_APM_BIZUM", 3);
        STORY_APM_BIZUM = kVar4;
        k kVar5 = new k("STORY_APM_BLIK", 4);
        STORY_APM_BLIK = kVar5;
        k kVar6 = new k("STORY_APM_BREB", 5);
        STORY_APM_BREB = kVar6;
        k kVar7 = new k("STORY_APM_WERO", 6);
        STORY_APM_WERO = kVar7;
        k kVar8 = new k("STORY_PAYID", 7);
        STORY_PAYID = kVar8;
        k kVar9 = new k("STORY_MULTIBANCO_WAY", 8);
        STORY_MULTIBANCO_WAY = kVar9;
        k kVar10 = new k("STORY_PIX", 9);
        STORY_PIX = kVar10;
        k kVar11 = new k("STORY_UPI", 10);
        STORY_UPI = kVar11;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
