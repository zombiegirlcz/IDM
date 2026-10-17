package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x none;
    public static final x xMaxYMax;
    public static final x xMaxYMid;
    public static final x xMaxYMin;
    public static final x xMidYMax;
    public static final x xMidYMid;
    public static final x xMidYMin;
    public static final x xMinYMax;
    public static final x xMinYMid;
    public static final x xMinYMin;

    static {
        x xVar = new x("none", 0);
        none = xVar;
        x xVar2 = new x("xMinYMin", 1);
        xMinYMin = xVar2;
        x xVar3 = new x("xMidYMin", 2);
        xMidYMin = xVar3;
        x xVar4 = new x("xMaxYMin", 3);
        xMaxYMin = xVar4;
        x xVar5 = new x("xMinYMid", 4);
        xMinYMid = xVar5;
        x xVar6 = new x("xMidYMid", 5);
        xMidYMid = xVar6;
        x xVar7 = new x("xMaxYMid", 6);
        xMaxYMid = xVar7;
        x xVar8 = new x("xMinYMax", 7);
        xMinYMax = xVar8;
        x xVar9 = new x("xMidYMax", 8);
        xMidYMax = xVar9;
        x xVar10 = new x("xMaxYMax", 9);
        xMaxYMax = xVar10;
        $VALUES = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
