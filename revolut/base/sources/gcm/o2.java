package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class o2 {
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 DISCONNECTED;
    public static final o2 IDLE;
    public static final o2 IDLE_AND_PING_SENT;
    public static final o2 PING_DELAYED;
    public static final o2 PING_SCHEDULED;
    public static final o2 PING_SENT;

    static {
        o2 o2Var = new o2("IDLE", 0);
        IDLE = o2Var;
        o2 o2Var2 = new o2("PING_SCHEDULED", 1);
        PING_SCHEDULED = o2Var2;
        o2 o2Var3 = new o2("PING_DELAYED", 2);
        PING_DELAYED = o2Var3;
        o2 o2Var4 = new o2("PING_SENT", 3);
        PING_SENT = o2Var4;
        o2 o2Var5 = new o2("IDLE_AND_PING_SENT", 4);
        IDLE_AND_PING_SENT = o2Var5;
        o2 o2Var6 = new o2("DISCONNECTED", 5);
        DISCONNECTED = o2Var6;
        $VALUES = new o2[]{o2Var, o2Var2, o2Var3, o2Var4, o2Var5, o2Var6};
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }
}
