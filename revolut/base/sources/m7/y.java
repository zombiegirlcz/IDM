package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y INDIVIDUALLY;
    public static final y SIMULTANEOUSLY;

    static {
        y yVar = new y("SIMULTANEOUSLY", 0);
        SIMULTANEOUSLY = yVar;
        y yVar2 = new y("INDIVIDUALLY", 1);
        INDIVIDUALLY = yVar2;
        $VALUES = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
