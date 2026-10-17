package roe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p NOTHING;
    public static final p SECONDARY_BUTTON;
    public static final p WIDGET;

    static {
        p pVar = new p("WIDGET", 0);
        WIDGET = pVar;
        p pVar2 = new p("SECONDARY_BUTTON", 1);
        SECONDARY_BUTTON = pVar2;
        p pVar3 = new p("NOTHING", 2);
        NOTHING = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
