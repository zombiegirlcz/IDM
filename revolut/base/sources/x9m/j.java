package x9m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j A;
    public static final j B;
    public static final j G;
    public static final j P;
    public static final j Q;
    public static final j R;
    public static final j S;
    public static final j T;
    public static final j W;
    public static final j X;
    public static final j Y;
    public static final j Z;

    static {
        j jVar = new j("X", 0);
        X = jVar;
        j jVar2 = new j("Y", 1);
        Y = jVar2;
        j jVar3 = new j("Z", 2);
        Z = jVar3;
        j jVar4 = new j("W", 3);
        W = jVar4;
        j jVar5 = new j("R", 4);
        R = jVar5;
        j jVar6 = new j("G", 5);
        G = jVar6;
        j jVar7 = new j("B", 6);
        B = jVar7;
        j jVar8 = new j("A", 7);
        A = jVar8;
        j jVar9 = new j("S", 8);
        S = jVar9;
        j jVar10 = new j("T", 9);
        T = jVar10;
        j jVar11 = new j("P", 10);
        P = jVar11;
        j jVar12 = new j("Q", 11);
        Q = jVar12;
        $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
