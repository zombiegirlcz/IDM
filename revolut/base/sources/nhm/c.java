package nhm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c PUT;
    public static final c REMOVE;

    static {
        c cVar = new c("PUT", 0);
        PUT = cVar;
        c cVar2 = new c("REMOVE", 1);
        REMOVE = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
