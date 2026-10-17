package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ASFT;
    public static final i DONATIONS;
    public static final i ESIM;
    public static final i EXPERIENCES;
    public static final i FLIGHT;
    public static final i GIFT_CARD;
    public static final i LOUNGES;
    public static final i STAYS;
    public static final i UNKNOWN;

    static {
        i iVar = new i("FLIGHT", 0);
        FLIGHT = iVar;
        i iVar2 = new i("GIFT_CARD", 1);
        GIFT_CARD = iVar2;
        i iVar3 = new i("LOUNGES", 2);
        LOUNGES = iVar3;
        i iVar4 = new i("ASFT", 3);
        ASFT = iVar4;
        i iVar5 = new i("ESIM", 4);
        ESIM = iVar5;
        i iVar6 = new i("DONATIONS", 5);
        DONATIONS = iVar6;
        i iVar7 = new i("STAYS", 6);
        STAYS = iVar7;
        i iVar8 = new i("EXPERIENCES", 7);
        EXPERIENCES = iVar8;
        i iVar9 = new i("UNKNOWN", 8);
        UNKNOWN = iVar9;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
