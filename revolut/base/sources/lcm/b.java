package lcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b ASYNC;
    public static final b BLOCKING;
    public static final b FUTURE;

    static {
        b bVar = new b("BLOCKING", 0);
        BLOCKING = bVar;
        b bVar2 = new b("FUTURE", 1);
        FUTURE = bVar2;
        b bVar3 = new b("ASYNC", 2);
        ASYNC = bVar3;
        $VALUES = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
