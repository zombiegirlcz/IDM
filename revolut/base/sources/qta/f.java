package qta;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ALL;

    @NotNull
    public static final e Companion;
    public static final f DAY;
    public static final f FIVE_YEARS;
    public static final f MONTH;
    public static final f SIX_MONTH;
    public static final f THREE_MONTH;
    public static final f WEEK;
    public static final f YEAR;

    static {
        f fVar = new f("DAY", 0);
        DAY = fVar;
        f fVar2 = new f("WEEK", 1);
        WEEK = fVar2;
        f fVar3 = new f("MONTH", 2);
        MONTH = fVar3;
        f fVar4 = new f("THREE_MONTH", 3);
        THREE_MONTH = fVar4;
        f fVar5 = new f("SIX_MONTH", 4);
        SIX_MONTH = fVar5;
        f fVar6 = new f("YEAR", 5);
        YEAR = fVar6;
        f fVar7 = new f("FIVE_YEARS", 6);
        FIVE_YEARS = fVar7;
        f fVar8 = new f("ALL", 7);
        ALL = fVar8;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
