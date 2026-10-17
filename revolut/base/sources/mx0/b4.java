package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b4[] $VALUES;
    public static final b4 ATTACH_FILE;
    public static final b4 REACTIONS_KEYBOARD;
    public static final b4 RECORD_AUDIO;
    public static final b4 SEND_MESSAGE;
    public static final b4 SOFT_KEYBOARD;

    static {
        b4 b4Var = new b4("ATTACH_FILE", 0);
        ATTACH_FILE = b4Var;
        b4 b4Var2 = new b4("REACTIONS_KEYBOARD", 1);
        REACTIONS_KEYBOARD = b4Var2;
        b4 b4Var3 = new b4("RECORD_AUDIO", 2);
        RECORD_AUDIO = b4Var3;
        b4 b4Var4 = new b4("SEND_MESSAGE", 3);
        SEND_MESSAGE = b4Var4;
        b4 b4Var5 = new b4("SOFT_KEYBOARD", 4);
        SOFT_KEYBOARD = b4Var5;
        b4[] b4VarArr = {b4Var, b4Var2, b4Var3, b4Var4, b4Var5};
        $VALUES = b4VarArr;
        $ENTRIES = vc.s.n(b4VarArr);
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) $VALUES.clone();
    }
}
