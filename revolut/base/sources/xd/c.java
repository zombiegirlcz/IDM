package xd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEFAULT_APP_CHECK_TOKEN;
    public static final c UNKNOWN_APP_CHECK_TOKEN;

    static {
        c cVar = new c("DEFAULT_APP_CHECK_TOKEN", 0);
        DEFAULT_APP_CHECK_TOKEN = cVar;
        c cVar2 = new c("UNKNOWN_APP_CHECK_TOKEN", 1);
        UNKNOWN_APP_CHECK_TOKEN = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
