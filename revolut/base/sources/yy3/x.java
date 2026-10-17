package yy3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x CANCELLED;
    public static final x EXPIRED;
    public static final x FAILED;
    public static final x SIGNED;
    public static final x STARTED;

    static {
        x xVar = new x("STARTED", 0);
        STARTED = xVar;
        x xVar2 = new x("SIGNED", 1);
        SIGNED = xVar2;
        x xVar3 = new x("EXPIRED", 2);
        EXPIRED = xVar3;
        x xVar4 = new x("FAILED", 3);
        FAILED = xVar4;
        x xVar5 = new x("CANCELLED", 4);
        CANCELLED = xVar5;
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
