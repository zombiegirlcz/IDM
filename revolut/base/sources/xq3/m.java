package xq3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ALWAYS_ENABLED;
    public static final m FEATURE_TOGGLE;
    public static final m LEGACY_FEATURE;
    public static final m PRODUCT_CATALOGUE;

    static {
        m mVar = new m("LEGACY_FEATURE", 0);
        LEGACY_FEATURE = mVar;
        m mVar2 = new m("PRODUCT_CATALOGUE", 1);
        PRODUCT_CATALOGUE = mVar2;
        m mVar3 = new m("FEATURE_TOGGLE", 2);
        FEATURE_TOGGLE = mVar3;
        m mVar4 = new m("ALWAYS_ENABLED", 3);
        ALWAYS_ENABLED = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
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
