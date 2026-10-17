package lha;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o MANAGER;
    public static final o MEMBER;

    static {
        o oVar = new o("MANAGER", 0);
        MANAGER = oVar;
        o oVar2 = new o("MEMBER", 1);
        MEMBER = oVar2;
        o[] oVarArr = {oVar, oVar2};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
