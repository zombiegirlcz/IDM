package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l DATA_CACHE;
    public static final l ENCODE;
    public static final l FINISHED;
    public static final l INITIALIZE;
    public static final l RESOURCE_CACHE;
    public static final l SOURCE;

    static {
        l lVar = new l("INITIALIZE", 0);
        INITIALIZE = lVar;
        l lVar2 = new l("RESOURCE_CACHE", 1);
        RESOURCE_CACHE = lVar2;
        l lVar3 = new l("DATA_CACHE", 2);
        DATA_CACHE = lVar3;
        l lVar4 = new l("SOURCE", 3);
        SOURCE = lVar4;
        l lVar5 = new l("ENCODE", 4);
        ENCODE = lVar5;
        l lVar6 = new l("FINISHED", 5);
        FINISHED = lVar6;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
