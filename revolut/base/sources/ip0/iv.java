package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class iv {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ iv[] $VALUES;
    public static final iv HALF_OF_WIDTH;
    public static final iv MATCH_PARENT;
    private final float floatValue;

    static {
        iv ivVar = new iv(0.5f, 0, "HALF_OF_WIDTH");
        HALF_OF_WIDTH = ivVar;
        iv ivVar2 = new iv(1.0f, 1, "MATCH_PARENT");
        MATCH_PARENT = ivVar2;
        iv[] ivVarArr = {ivVar, ivVar2};
        $VALUES = ivVarArr;
        $ENTRIES = vc.s.n(ivVarArr);
    }

    public iv(float f, int i, String str) {
        this.floatValue = f;
    }

    public static iv valueOf(String str) {
        return (iv) Enum.valueOf(iv.class, str);
    }

    public static iv[] values() {
        return (iv[]) $VALUES.clone();
    }

    public final float a() {
        return this.floatValue;
    }
}
