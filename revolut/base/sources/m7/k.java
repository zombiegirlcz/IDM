package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k ADD;
    public static final k EXCLUDE_INTERSECTIONS;
    public static final k INTERSECT;
    public static final k MERGE;
    public static final k SUBTRACT;

    static {
        k kVar = new k("MERGE", 0);
        MERGE = kVar;
        k kVar2 = new k("ADD", 1);
        ADD = kVar2;
        k kVar3 = new k("SUBTRACT", 2);
        SUBTRACT = kVar3;
        k kVar4 = new k("INTERSECT", 3);
        INTERSECT = kVar4;
        k kVar5 = new k("EXCLUDE_INTERSECTIONS", 4);
        EXCLUDE_INTERSECTIONS = kVar5;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
