package jfb;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k NOT_ELIGIBLE;
    public static final k NO_DATA;
    public static final k UNAUTHORIZED;

    static {
        k kVar = new k("UNAUTHORIZED", 0);
        UNAUTHORIZED = kVar;
        k kVar2 = new k("NO_DATA", 1);
        NO_DATA = kVar2;
        k kVar3 = new k("NOT_ELIGIBLE", 2);
        NOT_ELIGIBLE = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
