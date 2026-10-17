package ggc;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    @NotNull
    private final String code;
    private final int dayNumber;

    static {
        e eVar = new e("MONDAY", 0, "mon", 1);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1, "tue", 2);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2, "wed", 3);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3, "thu", 4);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4, "fri", 5);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5, "sat", 6);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6, "sun", 7);
        SUNDAY = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
        Companion = new d();
    }

    public e(String str, int i, String str2, int i2) {
        this.code = str2;
        this.dayNumber = i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int a() {
        return this.dayNumber;
    }

    public final int b() {
        return this.dayNumber;
    }

    public final String getCode() {
        return this.code;
    }
}
