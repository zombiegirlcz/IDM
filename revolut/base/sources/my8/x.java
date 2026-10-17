package my8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x MY_NUMBER;
    public static final x PROOF_OF_IDENTITY;
    public static final x PROOF_OF_RESIDENCE;

    static {
        x xVar = new x("PROOF_OF_IDENTITY", 0);
        PROOF_OF_IDENTITY = xVar;
        x xVar2 = new x("PROOF_OF_RESIDENCE", 1);
        PROOF_OF_RESIDENCE = xVar2;
        x xVar3 = new x("MY_NUMBER", 2);
        MY_NUMBER = xVar3;
        x[] xVarArr = {xVar, xVar2, xVar3};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
