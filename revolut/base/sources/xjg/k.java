package xjg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALWAYS;
    public static final k PREMIUM;

    static {
        k kVar = new k("ALWAYS", 0);
        ALWAYS = kVar;
        k kVar2 = new k("PREMIUM", 1);
        PREMIUM = kVar2;
        k[] kVarArr = {kVar, kVar2};
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
