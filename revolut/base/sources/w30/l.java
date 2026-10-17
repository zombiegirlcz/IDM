package w30;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AGENT;

    @NotNull
    public static final k Companion;
    public static final l SYSTEM;
    public static final l UNKNOWN;
    public static final l USER;

    @NotNull
    private final String key;

    static {
        l lVar = new l("SYSTEM", 0, "auto");
        SYSTEM = lVar;
        l lVar2 = new l("AGENT", 1, "agent");
        AGENT = lVar2;
        l lVar3 = new l("USER", 2, "client");
        USER = lVar3;
        l lVar4 = new l("UNKNOWN", 3, "");
        UNKNOWN = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
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
