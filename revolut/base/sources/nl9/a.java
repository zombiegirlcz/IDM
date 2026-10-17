package nl9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONSENT_SIGNING_ABANDONED;
    public static final a PRODUCT_FEATURE_NOT_AVAILABLE;

    static {
        a aVar = new a("PRODUCT_FEATURE_NOT_AVAILABLE", 0);
        PRODUCT_FEATURE_NOT_AVAILABLE = aVar;
        a aVar2 = new a("CONSENT_SIGNING_ABANDONED", 1);
        CONSENT_SIGNING_ABANDONED = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
