package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y meet;
    public static final y slice;

    static {
        y yVar = new y("meet", 0);
        meet = yVar;
        y yVar2 = new y("slice", 1);
        slice = yVar2;
        $VALUES = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
