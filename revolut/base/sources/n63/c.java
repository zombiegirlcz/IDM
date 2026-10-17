package n63;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNTS;
    public static final c CRYPTO;
    public static final c INVEST;
    public static final c JOINT;
    public static final c PRO;
    public static final c YOUTH;

    static {
        c cVar = new c("ACCOUNTS", 0);
        ACCOUNTS = cVar;
        c cVar2 = new c("CRYPTO", 1);
        CRYPTO = cVar2;
        c cVar3 = new c("JOINT", 2);
        JOINT = cVar3;
        c cVar4 = new c("PRO", 3);
        PRO = cVar4;
        c cVar5 = new c("YOUTH", 4);
        YOUTH = cVar5;
        c cVar6 = new c("INVEST", 5);
        INVEST = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
