package nbm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e ERROR;
    public static final e SLOW_ERROR;
    public static final e SLOW_SUCCESS;
    public static final e SUCCESS;

    static {
        e eVar = new e("SUCCESS", 0);
        SUCCESS = eVar;
        e eVar2 = new e("ERROR", 1);
        ERROR = eVar2;
        e eVar3 = new e("SLOW_SUCCESS", 2);
        SLOW_SUCCESS = eVar3;
        e eVar4 = new e("SLOW_ERROR", 3);
        SLOW_ERROR = eVar4;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
