package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j DEFAULT;
    public static final j DELEGATING;
    public static final j DISABLED;
    public static final j PROPERTIES;

    static {
        j jVar = new j("DEFAULT", 0);
        DEFAULT = jVar;
        j jVar2 = new j("DELEGATING", 1);
        DELEGATING = jVar2;
        j jVar3 = new j("PROPERTIES", 2);
        PROPERTIES = jVar3;
        j jVar4 = new j("DISABLED", 3);
        DISABLED = jVar4;
        $VALUES = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
