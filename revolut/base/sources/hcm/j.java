package hcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j PLAINTEXT;
    public static final j TLS;

    static {
        j jVar = new j("TLS", 0);
        TLS = jVar;
        j jVar2 = new j("PLAINTEXT", 1);
        PLAINTEXT = jVar2;
        $VALUES = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
