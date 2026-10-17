package qem;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f APRIL;
    public static final f AUGUST;

    @NotNull
    public static final e Companion;
    public static final f DECEMBER;
    public static final f FEBRUARY;
    public static final f JANUARY;
    public static final f JULY;
    public static final f JUNE;
    public static final f MARCH;
    public static final f MAY;
    public static final f NOVEMBER;
    public static final f OCTOBER;
    public static final f SEPTEMBER;

    @NotNull
    private final String value;

    static {
        f fVar = new f("JANUARY", 0, "Jan");
        JANUARY = fVar;
        f fVar2 = new f("FEBRUARY", 1, "Feb");
        FEBRUARY = fVar2;
        f fVar3 = new f("MARCH", 2, "Mar");
        MARCH = fVar3;
        f fVar4 = new f("APRIL", 3, "Apr");
        APRIL = fVar4;
        f fVar5 = new f("MAY", 4, "May");
        MAY = fVar5;
        f fVar6 = new f("JUNE", 5, "Jun");
        JUNE = fVar6;
        f fVar7 = new f("JULY", 6, "Jul");
        JULY = fVar7;
        f fVar8 = new f("AUGUST", 7, "Aug");
        AUGUST = fVar8;
        f fVar9 = new f("SEPTEMBER", 8, "Sep");
        SEPTEMBER = fVar9;
        f fVar10 = new f("OCTOBER", 9, "Oct");
        OCTOBER = fVar10;
        f fVar11 = new f("NOVEMBER", 10, "Nov");
        NOVEMBER = fVar11;
        f fVar12 = new f("DECEMBER", 11, "Dec");
        DECEMBER = fVar12;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.value = str2;
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
