package ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ATTEMPT_MIGRATION;
    public static final c NOT_GENERATED;
    public static final c REGISTERED;
    public static final c REGISTER_ERROR;
    public static final c UNREGISTERED;

    static {
        c cVar = new c("ATTEMPT_MIGRATION", 0);
        ATTEMPT_MIGRATION = cVar;
        c cVar2 = new c("NOT_GENERATED", 1);
        NOT_GENERATED = cVar2;
        c cVar3 = new c("UNREGISTERED", 2);
        UNREGISTERED = cVar3;
        c cVar4 = new c("REGISTERED", 3);
        REGISTERED = cVar4;
        c cVar5 = new c("REGISTER_ERROR", 4);
        REGISTER_ERROR = cVar5;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
