package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class q1 {
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 HEADER;
    public static final q1 HEADER_COMMENT;
    public static final q1 HEADER_CRC;
    public static final q1 HEADER_EXTRA;
    public static final q1 HEADER_EXTRA_LEN;
    public static final q1 HEADER_NAME;
    public static final q1 INFLATER_NEEDS_INPUT;
    public static final q1 INFLATING;
    public static final q1 INITIALIZE_INFLATER;
    public static final q1 TRAILER;

    static {
        q1 q1Var = new q1("HEADER", 0);
        HEADER = q1Var;
        q1 q1Var2 = new q1("HEADER_EXTRA_LEN", 1);
        HEADER_EXTRA_LEN = q1Var2;
        q1 q1Var3 = new q1("HEADER_EXTRA", 2);
        HEADER_EXTRA = q1Var3;
        q1 q1Var4 = new q1("HEADER_NAME", 3);
        HEADER_NAME = q1Var4;
        q1 q1Var5 = new q1("HEADER_COMMENT", 4);
        HEADER_COMMENT = q1Var5;
        q1 q1Var6 = new q1("HEADER_CRC", 5);
        HEADER_CRC = q1Var6;
        q1 q1Var7 = new q1("INITIALIZE_INFLATER", 6);
        INITIALIZE_INFLATER = q1Var7;
        q1 q1Var8 = new q1("INFLATING", 7);
        INFLATING = q1Var8;
        q1 q1Var9 = new q1("INFLATER_NEEDS_INPUT", 8);
        INFLATER_NEEDS_INPUT = q1Var9;
        q1 q1Var10 = new q1("TRAILER", 9);
        TRAILER = q1Var10;
        $VALUES = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7, q1Var8, q1Var9, q1Var10};
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}
