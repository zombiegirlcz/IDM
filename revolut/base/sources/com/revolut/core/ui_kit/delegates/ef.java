package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ef {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ef[] $VALUES;
    public static final ef ACTIONABLE;
    public static final ef DEFAULT;

    static {
        ef efVar = new ef("DEFAULT", 0);
        DEFAULT = efVar;
        ef efVar2 = new ef("ACTIONABLE", 1);
        ACTIONABLE = efVar2;
        ef[] efVarArr = {efVar, efVar2};
        $VALUES = efVarArr;
        $ENTRIES = vc.s.n(efVarArr);
    }

    public static ef valueOf(String str) {
        return (ef) Enum.valueOf(ef.class, str);
    }

    public static ef[] values() {
        return (ef[]) $VALUES.clone();
    }
}
