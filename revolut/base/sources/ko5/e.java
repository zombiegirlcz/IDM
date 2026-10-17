package ko5;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTIVE;

    @NotNull
    public static final d Companion;
    public static final e FAILED_SCREENING;
    public static final e SCREENING;
    public static final e UNKNOWN;

    static {
        e eVar = new e("ACTIVE", 0);
        ACTIVE = eVar;
        e eVar2 = new e("FAILED_SCREENING", 1);
        FAILED_SCREENING = eVar2;
        e eVar3 = new e("SCREENING", 2);
        SCREENING = eVar3;
        e eVar4 = new e("UNKNOWN", 3);
        UNKNOWN = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
