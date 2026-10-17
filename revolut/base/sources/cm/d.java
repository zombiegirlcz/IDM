package cm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d Auto;
    public static final d Off;
    public static final d On;

    static {
        d dVar = new d("On", 0);
        On = dVar;
        d dVar2 = new d("Off", 1);
        Off = dVar2;
        d dVar3 = new d("Auto", 2);
        Auto = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
