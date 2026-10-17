package yem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n FROM_DEFAULT_COUNTRY;
    public static final n FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final n FROM_NUMBER_WITH_IDD;
    public static final n FROM_NUMBER_WITH_PLUS_SIGN;
    public static final n UNSPECIFIED;

    static {
        n nVar = new n("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        FROM_NUMBER_WITH_PLUS_SIGN = nVar;
        n nVar2 = new n("FROM_NUMBER_WITH_IDD", 1);
        FROM_NUMBER_WITH_IDD = nVar2;
        n nVar3 = new n("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        FROM_NUMBER_WITHOUT_PLUS_SIGN = nVar3;
        n nVar4 = new n("FROM_DEFAULT_COUNTRY", 3);
        FROM_DEFAULT_COUNTRY = nVar4;
        n nVar5 = new n("UNSPECIFIED", 4);
        UNSPECIFIED = nVar5;
        $VALUES = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
