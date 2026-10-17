package ij;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INTERRUPTIBLE;
    public static final c NON_INTERRUPTIBLE;

    static {
        c cVar = new c("INTERRUPTIBLE", 0);
        INTERRUPTIBLE = cVar;
        c cVar2 = new c("NON_INTERRUPTIBLE", 1);
        NON_INTERRUPTIBLE = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
