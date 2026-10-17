package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class rh {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ rh[] $VALUES;
    public static final rh PRIMARY;
    public static final rh SECONDARY;

    static {
        rh rhVar = new rh("PRIMARY", 0);
        PRIMARY = rhVar;
        rh rhVar2 = new rh("SECONDARY", 1);
        SECONDARY = rhVar2;
        rh[] rhVarArr = {rhVar, rhVar2};
        $VALUES = rhVarArr;
        $ENTRIES = vc.s.n(rhVarArr);
    }

    public static rh valueOf(String str) {
        return (rh) Enum.valueOf(rh.class, str);
    }

    public static rh[] values() {
        return (rh[]) $VALUES.clone();
    }
}
