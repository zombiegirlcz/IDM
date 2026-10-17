package gw5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CARDS;
    public static final a REWARDS;
    public static final a ROWS;
    public static final a SELECTABLE_ROWS;

    static {
        a aVar = new a("CARDS", 0);
        CARDS = aVar;
        a aVar2 = new a("ROWS", 1);
        ROWS = aVar2;
        a aVar3 = new a("REWARDS", 2);
        REWARDS = aVar3;
        a aVar4 = new a("SELECTABLE_ROWS", 3);
        SELECTABLE_ROWS = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
