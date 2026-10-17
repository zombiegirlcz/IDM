package gkm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n IN_IN_OUT_POSITION;
    public static final n NO_CONFLICT;
    public static final n OUT_IN_IN_POSITION;

    static {
        n nVar = new n("NO_CONFLICT", 0);
        NO_CONFLICT = nVar;
        n nVar2 = new n("IN_IN_OUT_POSITION", 1);
        IN_IN_OUT_POSITION = nVar2;
        n nVar3 = new n("OUT_IN_IN_POSITION", 2);
        OUT_IN_IN_POSITION = nVar3;
        $VALUES = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
