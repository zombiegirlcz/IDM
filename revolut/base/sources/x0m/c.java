package x0m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c COMPLETE;
    public static final c IN_PROGRESS;
    public static final c NONE;

    static {
        c cVar = new c("NONE", 0);
        NONE = cVar;
        c cVar2 = new c("IN_PROGRESS", 1);
        IN_PROGRESS = cVar2;
        c cVar3 = new c("COMPLETE", 2);
        COMPLETE = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
