package m7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final h PRICE_CHANGED;
    public static final h UNKNOWN;

    static {
        h hVar = new h("PRICE_CHANGED", 0);
        PRICE_CHANGED = hVar;
        h hVar2 = new h("UNKNOWN", 1);
        UNKNOWN = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
