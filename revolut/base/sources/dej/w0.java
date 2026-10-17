package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 LINKIFY_PHONE_NUMBER;
    public static final w0 REQUEST_PAC;
    public static final w0 TRACK_PORTABILITY;

    static {
        w0 w0Var = new w0("LINKIFY_PHONE_NUMBER", 0);
        LINKIFY_PHONE_NUMBER = w0Var;
        w0 w0Var2 = new w0("REQUEST_PAC", 1);
        REQUEST_PAC = w0Var2;
        w0 w0Var3 = new w0("TRACK_PORTABILITY", 2);
        TRACK_PORTABILITY = w0Var3;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
