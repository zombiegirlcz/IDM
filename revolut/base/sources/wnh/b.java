package wnh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ONE_DAY;
    public static final b ONE_MONTH;
    public static final b ONE_WEEK;
    public static final b ONE_YEAR;

    static {
        b bVar = new b("ONE_DAY", 0);
        ONE_DAY = bVar;
        b bVar2 = new b("ONE_WEEK", 1);
        ONE_WEEK = bVar2;
        b bVar3 = new b("ONE_MONTH", 2);
        ONE_MONTH = bVar3;
        b bVar4 = new b("ONE_YEAR", 3);
        ONE_YEAR = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
