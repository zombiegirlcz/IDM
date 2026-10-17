package c69;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADJUST_LIMITS;
    public static final h CREATE;
    public static final h EDIT;

    static {
        h hVar = new h("CREATE", 0);
        CREATE = hVar;
        h hVar2 = new h("EDIT", 1);
        EDIT = hVar2;
        h hVar3 = new h("ADJUST_LIMITS", 2);
        ADJUST_LIMITS = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
