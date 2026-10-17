package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v BUTT;
    public static final v ROUND;
    public static final v UNKNOWN;

    static {
        v vVar = new v("BUTT", 0);
        BUTT = vVar;
        v vVar2 = new v("ROUND", 1);
        ROUND = vVar2;
        v vVar3 = new v("UNKNOWN", 2);
        UNKNOWN = vVar3;
        $VALUES = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
