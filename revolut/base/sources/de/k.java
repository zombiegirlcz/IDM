package de;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k IDLE;
    public static final k QUEUED;
    public static final k QUEUING;
    public static final k RUNNING;

    static {
        k kVar = new k("IDLE", 0);
        IDLE = kVar;
        k kVar2 = new k("QUEUING", 1);
        QUEUING = kVar2;
        k kVar3 = new k("QUEUED", 2);
        QUEUED = kVar3;
        k kVar4 = new k("RUNNING", 3);
        RUNNING = kVar4;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
