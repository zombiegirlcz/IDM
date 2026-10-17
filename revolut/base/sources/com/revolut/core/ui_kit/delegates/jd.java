package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class jd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jd[] $VALUES;
    public static final jd BOTTOM;
    public static final jd CENTER;

    static {
        jd jdVar = new jd("BOTTOM", 0);
        BOTTOM = jdVar;
        jd jdVar2 = new jd("CENTER", 1);
        CENTER = jdVar2;
        jd[] jdVarArr = {jdVar, jdVar2};
        $VALUES = jdVarArr;
        $ENTRIES = vc.s.n(jdVarArr);
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) $VALUES.clone();
    }
}
