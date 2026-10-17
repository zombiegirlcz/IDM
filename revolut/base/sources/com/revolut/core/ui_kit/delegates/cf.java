package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class cf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cf[] $VALUES;
    public static final cf DEFAULT;
    public static final cf SPACED;

    @NotNull
    private final aw0.e0 size;
    private final boolean spaced;

    static {
        cf cfVar = new cf("DEFAULT", 0, aw0.e0.DP_32, false);
        DEFAULT = cfVar;
        cf cfVar2 = new cf("SPACED", 1, aw0.e0.DP_24, true);
        SPACED = cfVar2;
        cf[] cfVarArr = {cfVar, cfVar2};
        $VALUES = cfVarArr;
        $ENTRIES = vc.s.n(cfVarArr);
    }

    public cf(String str, int i, aw0.e0 e0Var, boolean z) {
        this.size = e0Var;
        this.spaced = z;
    }

    public static cf valueOf(String str) {
        return (cf) Enum.valueOf(cf.class, str);
    }

    public static cf[] values() {
        return (cf[]) $VALUES.clone();
    }

    public final aw0.e0 a() {
        return this.size;
    }

    public final boolean b() {
        return this.spaced;
    }
}
