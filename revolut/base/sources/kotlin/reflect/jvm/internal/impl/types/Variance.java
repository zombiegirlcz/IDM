package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Variance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Variance[] $VALUES;
    public static final Variance INVARIANT;
    public static final Variance IN_VARIANCE;
    public static final Variance OUT_VARIANCE;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @NotNull
    private final String label;
    private final int superpositionFactor;

    static {
        Variance variance = new Variance("INVARIANT", 0, true, 0, "", true);
        INVARIANT = variance;
        Variance variance2 = new Variance("IN_VARIANCE", 1, true, -1, "in", false);
        IN_VARIANCE = variance2;
        Variance variance3 = new Variance("OUT_VARIANCE", 2, false, 1, "out", true);
        OUT_VARIANCE = variance3;
        Variance[] varianceArr = {variance, variance2, variance3};
        $VALUES = varianceArr;
        $ENTRIES = s.n(varianceArr);
    }

    public Variance(String str, int i, boolean z, int i2, String str2, boolean z3) {
        this.label = str2;
        this.allowsInPosition = z;
        this.allowsOutPosition = z3;
        this.superpositionFactor = i2;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.label;
    }
}
