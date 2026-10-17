package fu9;

import kotlin.enums.EnumEntries;
import mx0.b4;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE;
    public static final a REACTIONS_KEYBOARD;
    public static final a SEND_MESSAGE;
    public static final a SOFT_KEYBOARD;
    private final b4 inputAction;

    static {
        a aVar = new a("SOFT_KEYBOARD", 0, b4.SOFT_KEYBOARD);
        SOFT_KEYBOARD = aVar;
        a aVar2 = new a("REACTIONS_KEYBOARD", 1, b4.REACTIONS_KEYBOARD);
        REACTIONS_KEYBOARD = aVar2;
        a aVar3 = new a("SEND_MESSAGE", 2, b4.SEND_MESSAGE);
        SEND_MESSAGE = aVar3;
        a aVar4 = new a("NONE", 3, null);
        NONE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, b4 b4Var) {
        this.inputAction = b4Var;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final b4 a() {
        return this.inputAction;
    }
}
