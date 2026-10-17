package lzi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FRIDAY;
    public static final f MONDAY;
    public static final f SATURDAY;
    public static final f SUNDAY;
    public static final f THURSDAY;
    public static final f TUESDAY;
    public static final f WEDNESDAY;
    private final int dayOfWeek;

    static {
        f fVar = new f("MONDAY", 0, 1);
        MONDAY = fVar;
        f fVar2 = new f("TUESDAY", 1, 2);
        TUESDAY = fVar2;
        f fVar3 = new f("WEDNESDAY", 2, 3);
        WEDNESDAY = fVar3;
        f fVar4 = new f("THURSDAY", 3, 4);
        THURSDAY = fVar4;
        f fVar5 = new f("FRIDAY", 4, 5);
        FRIDAY = fVar5;
        f fVar6 = new f("SATURDAY", 5, 6);
        SATURDAY = fVar6;
        f fVar7 = new f("SUNDAY", 6, 7);
        SUNDAY = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public f(String str, int i, int i2) {
        this.dayOfWeek = i2;
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

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }
}
