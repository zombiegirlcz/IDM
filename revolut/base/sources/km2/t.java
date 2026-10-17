package km2;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t DARK;
    public static final t LIGHT;
    public static final t LIGHT_DARK;
    public static final t NONE;

    @NotNull
    private final String darkSuffix;

    @NotNull
    private final String lightSuffix;

    static {
        t tVar = new t("NONE", 0, "", "");
        NONE = tVar;
        t tVar2 = new t("DARK", 1, "", "_dark");
        DARK = tVar2;
        t tVar3 = new t("LIGHT", 2, "_light", "");
        LIGHT = tVar3;
        t tVar4 = new t("LIGHT_DARK", 3, "_light", "_dark");
        LIGHT_DARK = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public t(String str, int i, String str2, String str3) {
        this.lightSuffix = str2;
        this.darkSuffix = str3;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public final String a() {
        return this.darkSuffix;
    }

    public final String b() {
        return this.lightSuffix;
    }
}
