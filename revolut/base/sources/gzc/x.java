package gzc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x ACTION_REQUIRED;
    public static final x IN_REVIEW;
    public static final x SUBMITTED;
    public static final x UNKNOWN;
    public static final x VERIFIED;

    static {
        x xVar = new x("SUBMITTED", 0);
        SUBMITTED = xVar;
        x xVar2 = new x("IN_REVIEW", 1);
        IN_REVIEW = xVar2;
        x xVar3 = new x("VERIFIED", 2);
        VERIFIED = xVar3;
        x xVar4 = new x("ACTION_REQUIRED", 3);
        ACTION_REQUIRED = xVar4;
        x xVar5 = new x("UNKNOWN", 4);
        UNKNOWN = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
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
