package o8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FIVE_YEARS;
    public static final c ONE_DAY;
    public static final c ONE_MONTH;
    public static final c ONE_WEEK;
    public static final c ONE_YEAR;

    @NotNull
    private final String value;

    static {
        c cVar = new c("ONE_DAY", 0, "ONE_DAY");
        ONE_DAY = cVar;
        c cVar2 = new c("ONE_MONTH", 1, "ONE_MONTH");
        ONE_MONTH = cVar2;
        c cVar3 = new c("ONE_WEEK", 2, "ONE_WEEK");
        ONE_WEEK = cVar3;
        c cVar4 = new c("ONE_YEAR", 3, "ONE_YEAR");
        ONE_YEAR = cVar4;
        c cVar5 = new c("FIVE_YEARS", 4, "FIVE_YEARS");
        FIVE_YEARS = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
