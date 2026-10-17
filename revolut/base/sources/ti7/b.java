package ti7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVATED;
    public static final b CANCELLED;
    public static final b CREATED;
    public static final b UNKNOWN;
    public static final b VERIFIED;

    static {
        b bVar = new b("CREATED", 0);
        CREATED = bVar;
        b bVar2 = new b("ACTIVATED", 1);
        ACTIVATED = bVar2;
        b bVar3 = new b("CANCELLED", 2);
        CANCELLED = bVar3;
        b bVar4 = new b("VERIFIED", 3);
        VERIFIED = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
