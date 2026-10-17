package u8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i CLEARED;
    public static final i COMPLETE;
    public static final i FAILED;
    public static final i PENDING;
    public static final i RUNNING;
    public static final i WAITING_FOR_SIZE;

    static {
        i iVar = new i("PENDING", 0);
        PENDING = iVar;
        i iVar2 = new i("RUNNING", 1);
        RUNNING = iVar2;
        i iVar3 = new i("WAITING_FOR_SIZE", 2);
        WAITING_FOR_SIZE = iVar3;
        i iVar4 = new i("COMPLETE", 3);
        COMPLETE = iVar4;
        i iVar5 = new i("FAILED", 4);
        FAILED = iVar5;
        i iVar6 = new i("CLEARED", 5);
        CLEARED = iVar6;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
