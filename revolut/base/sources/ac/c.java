package ac;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c FATAL_ERROR;
    public static final c INVALID_PAYLOAD;
    public static final c OK;
    public static final c TRANSIENT_ERROR;

    static {
        c cVar = new c("OK", 0);
        OK = cVar;
        c cVar2 = new c("TRANSIENT_ERROR", 1);
        TRANSIENT_ERROR = cVar2;
        c cVar3 = new c("FATAL_ERROR", 2);
        FATAL_ERROR = cVar3;
        c cVar4 = new c("INVALID_PAYLOAD", 3);
        INVALID_PAYLOAD = cVar4;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
