package ifk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CANCEL;
    public static final e CONTINUE;
    public static final e DEEPLINK;

    static {
        e eVar = new e("DEEPLINK", 0);
        DEEPLINK = eVar;
        e eVar2 = new e("CONTINUE", 1);
        CONTINUE = eVar2;
        e eVar3 = new e("CANCEL", 2);
        CANCEL = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
