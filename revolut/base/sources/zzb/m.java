package zzb;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m BRANDS;
    public static final m CATEGORIES;

    static {
        m mVar = new m("CATEGORIES", 0);
        CATEGORIES = mVar;
        m mVar2 = new m("BRANDS", 1);
        BRANDS = mVar2;
        m[] mVarArr = {mVar, mVar2};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
