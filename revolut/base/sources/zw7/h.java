package zw7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CROSS;

    @NotNull
    public static final g Companion;
    public static final h MIXED;
    public static final h PEDIGREE;
    public static final h UNKNOWN;

    @NotNull
    private final String value;

    static {
        h hVar = new h("PEDIGREE", 0, "PEDIGREE");
        PEDIGREE = hVar;
        h hVar2 = new h("CROSS", 1, "CROSS");
        CROSS = hVar2;
        h hVar3 = new h("MIXED", 2, "MIXED");
        MIXED = hVar3;
        h hVar4 = new h("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.value = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
