package cs9;

import kotlin.enums.EnumEntries;
import mx0.b4;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NONE;
    public static final b REACTIONS_KEYBOARD;
    public static final b SEND_MESSAGE;
    public static final b SOFT_KEYBOARD;
    private final b4 inputAction;

    static {
        b bVar = new b("SOFT_KEYBOARD", 0, b4.SOFT_KEYBOARD);
        SOFT_KEYBOARD = bVar;
        b bVar2 = new b("REACTIONS_KEYBOARD", 1, b4.REACTIONS_KEYBOARD);
        REACTIONS_KEYBOARD = bVar2;
        b bVar3 = new b("SEND_MESSAGE", 2, b4.SEND_MESSAGE);
        SEND_MESSAGE = bVar3;
        b bVar4 = new b("NONE", 3, null);
        NONE = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, b4 b4Var) {
        this.inputAction = b4Var;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final b4 a() {
        return this.inputAction;
    }
}
