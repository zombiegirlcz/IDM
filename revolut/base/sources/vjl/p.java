package vjl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BUSINESS;

    @NotNull
    public static final o Companion;
    public static final p PERSONAL;
    public static final p UNKNOWN;

    @NotNull
    private final String value;

    static {
        p pVar = new p("PERSONAL", 0, "PERSONAL");
        PERSONAL = pVar;
        p pVar2 = new p("BUSINESS", 1, "BUSINESS");
        BUSINESS = pVar2;
        p pVar3 = new p("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
        Companion = new o();
    }

    public p(String str, int i, String str2) {
        this.value = str2;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
