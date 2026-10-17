package a2l;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DANGER;
    public static final w ENVIRONMENT_GREEN;
    public static final w FOREGROUND;
    public static final w STANDARD;
    public static final w SUCCESS;
    public static final w UNKNOWN;
    public static final w WARNING;

    @NotNull
    private final String rawValue;

    static {
        w wVar = new w("DANGER", 0, "danger");
        DANGER = wVar;
        w wVar2 = new w("ENVIRONMENT_GREEN", 1, "environmentGreen");
        ENVIRONMENT_GREEN = wVar2;
        w wVar3 = new w("FOREGROUND", 2, "foreground");
        FOREGROUND = wVar3;
        w wVar4 = new w("STANDARD", 3, "standard");
        STANDARD = wVar4;
        w wVar5 = new w("SUCCESS", 4, "success");
        SUCCESS = wVar5;
        w wVar6 = new w("WARNING", 5, "warning");
        WARNING = wVar6;
        w wVar7 = new w("UNKNOWN", 6, "unknown");
        UNKNOWN = wVar7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public w(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final String b() {
        return this.rawValue;
    }
}
