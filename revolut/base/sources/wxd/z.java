package wxd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z ACCOUNTS_FILTER;
    public static final z FORMAT;
    public static final z HIDE_BALANCES;
    public static final z LANGUAGE;
    public static final z SHOW_AMOUNTS_IN;

    @NotNull
    private final String value;

    static {
        z zVar = new z("ACCOUNTS_FILTER", 0, "ACCOUNTS_FILTER");
        ACCOUNTS_FILTER = zVar;
        z zVar2 = new z("FORMAT", 1, "FORMAT");
        FORMAT = zVar2;
        z zVar3 = new z("LANGUAGE", 2, "LANGUAGE");
        LANGUAGE = zVar3;
        z zVar4 = new z("SHOW_AMOUNTS_IN", 3, "SHOW_AMOUNTS_IN");
        SHOW_AMOUNTS_IN = zVar4;
        z zVar5 = new z("HIDE_BALANCES", 4, "HIDE_BALANCES");
        HIDE_BALANCES = zVar5;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public z(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
