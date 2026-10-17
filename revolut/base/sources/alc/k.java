package alc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k COMPLETED;
    public static final k FAILED;
    public static final k NONE;
    public static final k PENDING;

    static {
        k kVar = new k("NONE", 0);
        NONE = kVar;
        k kVar2 = new k("PENDING", 1);
        PENDING = kVar2;
        k kVar3 = new k("COMPLETED", 2);
        COMPLETED = kVar3;
        k kVar4 = new k("FAILED", 3);
        FAILED = kVar4;
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
