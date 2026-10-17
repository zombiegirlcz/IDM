package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class cd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cd[] $VALUES;
    public static final cd CAPTION;
    public static final cd PRIMARY;

    static {
        cd cdVar = new cd("PRIMARY", 0);
        PRIMARY = cdVar;
        cd cdVar2 = new cd("CAPTION", 1);
        CAPTION = cdVar2;
        cd[] cdVarArr = {cdVar, cdVar2};
        $VALUES = cdVarArr;
        $ENTRIES = vc.s.n(cdVarArr);
    }

    public static cd valueOf(String str) {
        return (cd) Enum.valueOf(cd.class, str);
    }

    public static cd[] values() {
        return (cd[]) $VALUES.clone();
    }
}
