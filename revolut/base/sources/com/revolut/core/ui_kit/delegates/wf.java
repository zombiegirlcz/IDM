package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class wf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wf[] $VALUES;
    public static final wf BOLD;
    public static final wf REGULAR;

    static {
        wf wfVar = new wf("BOLD", 0);
        BOLD = wfVar;
        wf wfVar2 = new wf("REGULAR", 1);
        REGULAR = wfVar2;
        wf[] wfVarArr = {wfVar, wfVar2};
        $VALUES = wfVarArr;
        $ENTRIES = vc.s.n(wfVarArr);
    }

    public static wf valueOf(String str) {
        return (wf) Enum.valueOf(wf.class, str);
    }

    public static wf[] values() {
        return (wf[]) $VALUES.clone();
    }
}
