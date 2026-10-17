package tl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHECK_24;
    public static final d CHECK_SUCCESS_24;
    public static final d COINS_24;
    public static final d EXCLAMATION_MARK_24;
    public static final d FEES_24;
    public static final d INFO_24;
    public static final d INFO_OUTLINE_24;
    public static final d PENCIL_24;
    public static final d REVERTED_24;
    public static final d TIME_24;

    static {
        d dVar = new d("TIME_24", 0);
        TIME_24 = dVar;
        d dVar2 = new d("CHECK_SUCCESS_24", 1);
        CHECK_SUCCESS_24 = dVar2;
        d dVar3 = new d("CHECK_24", 2);
        CHECK_24 = dVar3;
        d dVar4 = new d("EXCLAMATION_MARK_24", 3);
        EXCLAMATION_MARK_24 = dVar4;
        d dVar5 = new d("FEES_24", 4);
        FEES_24 = dVar5;
        d dVar6 = new d("PENCIL_24", 5);
        PENCIL_24 = dVar6;
        d dVar7 = new d("INFO_24", 6);
        INFO_24 = dVar7;
        d dVar8 = new d("COINS_24", 7);
        COINS_24 = dVar8;
        d dVar9 = new d("INFO_OUTLINE_24", 8);
        INFO_OUTLINE_24 = dVar9;
        d dVar10 = new d("REVERTED_24", 9);
        REVERTED_24 = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
