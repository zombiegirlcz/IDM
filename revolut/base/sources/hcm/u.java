package hcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u INBOUND;
    public static final u OUTBOUND;

    static {
        u uVar = new u("INBOUND", 0);
        INBOUND = uVar;
        u uVar2 = new u("OUTBOUND", 1);
        OUTBOUND = uVar2;
        $VALUES = new u[]{uVar, uVar2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
