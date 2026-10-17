package fr2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALWAYS_BLUE;
    public static final k FAILED_RED;
    public static final k PROGRESS_BLUE_COMPLETED_GREEN;
    public static final k WARNING_ORANGE;

    static {
        k kVar = new k("ALWAYS_BLUE", 0);
        ALWAYS_BLUE = kVar;
        k kVar2 = new k("PROGRESS_BLUE_COMPLETED_GREEN", 1);
        PROGRESS_BLUE_COMPLETED_GREEN = kVar2;
        k kVar3 = new k("WARNING_ORANGE", 2);
        WARNING_ORANGE = kVar3;
        k kVar4 = new k("FAILED_RED", 3);
        FAILED_RED = kVar4;
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
