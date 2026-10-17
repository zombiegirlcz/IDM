package g1m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j HTTP;
    public static final j HTTPS;

    static {
        j jVar = new j("HTTP", 0);
        HTTP = jVar;
        j jVar2 = new j("HTTPS", 1);
        HTTPS = jVar2;
        $VALUES = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
