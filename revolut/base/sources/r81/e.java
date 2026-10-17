package r81;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DISABLED;
    public static final e ENABLED;

    @NotNull
    private final String value;

    static {
        e eVar = new e("ENABLED", 0, "VARIANT");
        ENABLED = eVar;
        e eVar2 = new e("DISABLED", 1, "");
        DISABLED = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.value = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // r81.c
    public final String getValue() {
        return this.value;
    }
}
