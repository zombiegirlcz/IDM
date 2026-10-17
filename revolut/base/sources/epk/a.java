package epk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DAY;
    public static final a FIFTEEN_MINUTES;
    public static final a FIVE_MINUTES;
    public static final a FOUR_DAYS;
    public static final a FOUR_HOURS;
    public static final a FOUR_WEEKS;
    public static final a HOUR;
    public static final a NINETY_MINUTES;
    public static final a THIRTY_MINUTES;
    public static final a TWO_DAYS;
    public static final a WEEK;

    @NotNull
    private final String value;

    static {
        a aVar = new a("FIVE_MINUTES", 0, "5m");
        FIVE_MINUTES = aVar;
        a aVar2 = new a("FIFTEEN_MINUTES", 1, "15m");
        FIFTEEN_MINUTES = aVar2;
        a aVar3 = new a("THIRTY_MINUTES", 2, "30m");
        THIRTY_MINUTES = aVar3;
        a aVar4 = new a("HOUR", 3, "1h");
        HOUR = aVar4;
        a aVar5 = new a("NINETY_MINUTES", 4, "90m");
        NINETY_MINUTES = aVar5;
        a aVar6 = new a("FOUR_HOURS", 5, "4h");
        FOUR_HOURS = aVar6;
        a aVar7 = new a("DAY", 6, "1d");
        DAY = aVar7;
        a aVar8 = new a("TWO_DAYS", 7, "2d");
        TWO_DAYS = aVar8;
        a aVar9 = new a("FOUR_DAYS", 8, "4d");
        FOUR_DAYS = aVar9;
        a aVar10 = new a("WEEK", 9, "1w");
        WEEK = aVar10;
        a aVar11 = new a("FOUR_WEEKS", 10, "4w");
        FOUR_WEEKS = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
