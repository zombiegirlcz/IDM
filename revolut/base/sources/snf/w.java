package snf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;

    @NotNull
    public static final v Companion;
    public static final w HIDDEN;
    public static final w VISIBLE;

    static {
        w wVar = new w("VISIBLE", 0);
        VISIBLE = wVar;
        w wVar2 = new w("HIDDEN", 1);
        HIDDEN = wVar2;
        w[] wVarArr = {wVar, wVar2};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
        Companion = new v();
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
