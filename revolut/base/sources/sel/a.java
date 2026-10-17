package sel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DAILY;
    public static final a MONTHLY;
    public static final a WEEKLY;

    @NotNull
    private final String rawValue;

    static {
        a aVar = new a("DAILY", 0, "DAILY");
        DAILY = aVar;
        a aVar2 = new a("WEEKLY", 1, "WEEKLY");
        WEEKLY = aVar2;
        a aVar3 = new a("MONTHLY", 2, "MONTHLY");
        MONTHLY = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.rawValue;
    }
}
