package lbm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a ABOVE_THRESHOLDS;
    public static final a BELOW_MINIMUM_CALLS_THRESHOLD;
    public static final a BELOW_THRESHOLDS;
    public static final a FAILURE_RATE_ABOVE_THRESHOLDS;
    public static final a SLOW_CALL_RATE_ABOVE_THRESHOLDS;

    static {
        a aVar = new a("BELOW_THRESHOLDS", 0);
        BELOW_THRESHOLDS = aVar;
        a aVar2 = new a("FAILURE_RATE_ABOVE_THRESHOLDS", 1);
        FAILURE_RATE_ABOVE_THRESHOLDS = aVar2;
        a aVar3 = new a("SLOW_CALL_RATE_ABOVE_THRESHOLDS", 2);
        SLOW_CALL_RATE_ABOVE_THRESHOLDS = aVar3;
        a aVar4 = new a("ABOVE_THRESHOLDS", 3);
        ABOVE_THRESHOLDS = aVar4;
        a aVar5 = new a("BELOW_MINIMUM_CALLS_THRESHOLD", 4);
        BELOW_MINIMUM_CALLS_THRESHOLD = aVar5;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
