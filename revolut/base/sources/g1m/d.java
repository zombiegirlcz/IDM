package g1m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d GET;
    public static final d POST;

    static {
        d dVar = new d("GET", 0);
        GET = dVar;
        d dVar2 = new d("POST", 1);
        POST = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
