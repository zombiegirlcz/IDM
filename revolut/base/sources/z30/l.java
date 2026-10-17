package z30;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final k Companion;
    public static final l MANDATORY;
    public static final l NONE;
    public static final l OPTIONAL;
    private final String key;

    static {
        l lVar = new l("MANDATORY", 0, "Mandatory");
        MANDATORY = lVar;
        l lVar2 = new l("OPTIONAL", 1, "Optional");
        OPTIONAL = lVar2;
        l lVar3 = new l("NONE", 2, "None");
        NONE = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
