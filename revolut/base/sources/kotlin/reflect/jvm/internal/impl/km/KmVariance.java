package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class KmVariance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KmVariance[] $VALUES;
    public static final KmVariance IN;
    public static final KmVariance INVARIANT;
    public static final KmVariance OUT;

    static {
        KmVariance kmVariance = new KmVariance("INVARIANT", 0);
        INVARIANT = kmVariance;
        KmVariance kmVariance2 = new KmVariance("IN", 1);
        IN = kmVariance2;
        KmVariance kmVariance3 = new KmVariance("OUT", 2);
        OUT = kmVariance3;
        KmVariance[] kmVarianceArr = {kmVariance, kmVariance2, kmVariance3};
        $VALUES = kmVarianceArr;
        $ENTRIES = s.n(kmVarianceArr);
    }

    public static KmVariance valueOf(String str) {
        return (KmVariance) Enum.valueOf(KmVariance.class, str);
    }

    public static KmVariance[] values() {
        return (KmVariance[]) $VALUES.clone();
    }
}
