package yv2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g LOAD_PIN_STATUS;
    public static final g SHOW_NEW_PIN;
    public static final g SHOW_NEW_PIN_WITHOUT_ACTIVATION_INSTRUCTIONS;
    public static final g SHOW_PREVIOUS_OR_SINGLE_PIN;

    static {
        g gVar = new g("LOAD_PIN_STATUS", 0);
        LOAD_PIN_STATUS = gVar;
        g gVar2 = new g("SHOW_NEW_PIN", 1);
        SHOW_NEW_PIN = gVar2;
        g gVar3 = new g("SHOW_NEW_PIN_WITHOUT_ACTIVATION_INSTRUCTIONS", 2);
        SHOW_NEW_PIN_WITHOUT_ACTIVATION_INSTRUCTIONS = gVar3;
        g gVar4 = new g("SHOW_PREVIOUS_OR_SINGLE_PIN", 3);
        SHOW_PREVIOUS_OR_SINGLE_PIN = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
