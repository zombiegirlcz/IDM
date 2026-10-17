package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r CONNECTING;
    public static final r IDLE;
    public static final r READY;
    public static final r SHUTDOWN;
    public static final r TRANSIENT_FAILURE;

    static {
        r rVar = new r("CONNECTING", 0);
        CONNECTING = rVar;
        r rVar2 = new r("READY", 1);
        READY = rVar2;
        r rVar3 = new r("TRANSIENT_FAILURE", 2);
        TRANSIENT_FAILURE = rVar3;
        r rVar4 = new r("IDLE", 3);
        IDLE = rVar4;
        r rVar5 = new r("SHUTDOWN", 4);
        SHUTDOWN = rVar5;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4, rVar5};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
