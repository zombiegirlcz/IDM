package xbl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e MONTHLY;
    public static final e REALISED_PNL;

    @NotNull
    private final String stringRepresentation;

    static {
        e eVar = new e("MONTHLY", 0, "MONTHLY");
        MONTHLY = eVar;
        e eVar2 = new e("REALISED_PNL", 1, "REALISED_PNL");
        REALISED_PNL = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.stringRepresentation = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringRepresentation;
    }
}
