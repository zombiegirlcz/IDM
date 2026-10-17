package ol;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EXTERNAL;
    public static final g INTERNAL;

    @NotNull
    private final String value;

    static {
        g gVar = new g("INTERNAL", 0, "default");
        INTERNAL = gVar;
        g gVar2 = new g("EXTERNAL", 1, "custom");
        EXTERNAL = gVar2;
        g[] gVarArr = {gVar, gVar2};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public g(String str, int i, String str2) {
        this.value = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
