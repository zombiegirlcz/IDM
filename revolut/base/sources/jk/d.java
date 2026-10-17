package jk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d IDLE;
    public static final d STOPPED;
    public static final d SYNCING;

    static {
        d dVar = new d("IDLE", 0);
        IDLE = dVar;
        d dVar2 = new d("SYNCING", 1);
        SYNCING = dVar2;
        d dVar3 = new d("STOPPED", 2);
        STOPPED = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
