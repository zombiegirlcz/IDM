package mid;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b FRIDAY;
    public static final b MONDAY;
    public static final b SATURDAY;
    public static final b SUNDAY;
    public static final b THURSDAY;
    public static final b TUESDAY;
    public static final b WEDNESDAY;

    @NotNull
    private final String code;
    private final int dayNumber;

    static {
        b bVar = new b("MONDAY", 0, "mon", 1);
        MONDAY = bVar;
        b bVar2 = new b("TUESDAY", 1, "tue", 2);
        TUESDAY = bVar2;
        b bVar3 = new b("WEDNESDAY", 2, "wed", 3);
        WEDNESDAY = bVar3;
        b bVar4 = new b("THURSDAY", 3, "thu", 4);
        THURSDAY = bVar4;
        b bVar5 = new b("FRIDAY", 4, "fri", 5);
        FRIDAY = bVar5;
        b bVar6 = new b("SATURDAY", 5, "sat", 6);
        SATURDAY = bVar6;
        b bVar7 = new b("SUNDAY", 6, "sun", 7);
        SUNDAY = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2, int i2) {
        this.code = str2;
        this.dayNumber = i2;
    }

    public static EnumEntries c() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
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
