package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 EXTERNAL;
    public static final f2 INTERNAL;
    private final int darawbleRes;

    static {
        f2 f2Var = new f2("INTERNAL", 0, R$drawable.uikit_icn_24_chevron_right);
        INTERNAL = f2Var;
        f2 f2Var2 = new f2("EXTERNAL", 1, R$drawable.uikit_icn_24_link_external);
        EXTERNAL = f2Var2;
        f2[] f2VarArr = {f2Var, f2Var2};
        $VALUES = f2VarArr;
        $ENTRIES = vc.s.n(f2VarArr);
    }

    public f2(String str, int i, int i2) {
        this.darawbleRes = i2;
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }

    public final int a() {
        return this.darawbleRes;
    }
}
