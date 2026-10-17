package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s3[] $VALUES;
    public static final s3 HEADER_SCROLLING;
    public static final s3 MESSAGE_SCROLLING;
    public static final s3 UNKNOWN;

    static {
        s3 s3Var = new s3("UNKNOWN", 0);
        UNKNOWN = s3Var;
        s3 s3Var2 = new s3("MESSAGE_SCROLLING", 1);
        MESSAGE_SCROLLING = s3Var2;
        s3 s3Var3 = new s3("HEADER_SCROLLING", 2);
        HEADER_SCROLLING = s3Var3;
        s3[] s3VarArr = {s3Var, s3Var2, s3Var3};
        $VALUES = s3VarArr;
        $ENTRIES = vc.s.n(s3VarArr);
    }

    public static s3 valueOf(String str) {
        return (s3) Enum.valueOf(s3.class, str);
    }

    public static s3[] values() {
        return (s3[]) $VALUES.clone();
    }
}
