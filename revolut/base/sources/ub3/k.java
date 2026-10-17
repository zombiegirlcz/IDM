package ub3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BothAllowed;
    public static final k NoEuActions;
    public static final k OnlyDepositCash;
    public static final k OnlySelectLocation;

    static {
        k kVar = new k("NoEuActions", 0);
        NoEuActions = kVar;
        k kVar2 = new k("BothAllowed", 1);
        BothAllowed = kVar2;
        k kVar3 = new k("OnlyDepositCash", 2);
        OnlyDepositCash = kVar3;
        k kVar4 = new k("OnlySelectLocation", 3);
        OnlySelectLocation = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
