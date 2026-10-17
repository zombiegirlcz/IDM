package epk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALL;
    public static final b DAY;
    public static final b FIVE_YEARS;
    public static final b MONTH;
    public static final b SIX_MONTHS;
    public static final b THREE_MONTHS;
    public static final b WEEK;
    public static final b YEAR;

    @NotNull
    private final String value;

    static {
        b bVar = new b("DAY", 0, "1d");
        DAY = bVar;
        b bVar2 = new b("WEEK", 1, "1w");
        WEEK = bVar2;
        b bVar3 = new b("MONTH", 2, "1mo");
        MONTH = bVar3;
        b bVar4 = new b("THREE_MONTHS", 3, "3mo");
        THREE_MONTHS = bVar4;
        b bVar5 = new b("SIX_MONTHS", 4, "6mo");
        SIX_MONTHS = bVar5;
        b bVar6 = new b("YEAR", 5, "1y");
        YEAR = bVar6;
        b bVar7 = new b("FIVE_YEARS", 6, "5y");
        FIVE_YEARS = bVar7;
        b bVar8 = new b("ALL", 7, "max");
        ALL = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
