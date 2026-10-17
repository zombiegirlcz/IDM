package ug7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CLAIM;
    public static final c GO_TO_ACCOUNT;
    public static final c QUIT;
    public static final c REJECT;
    public static final c RELOAD;
    public static final c SHARE;

    static {
        c cVar = new c("CLAIM", 0);
        CLAIM = cVar;
        c cVar2 = new c("REJECT", 1);
        REJECT = cVar2;
        c cVar3 = new c("SHARE", 2);
        SHARE = cVar3;
        c cVar4 = new c("GO_TO_ACCOUNT", 3);
        GO_TO_ACCOUNT = cVar4;
        c cVar5 = new c("QUIT", 4);
        QUIT = cVar5;
        c cVar6 = new c("RELOAD", 5);
        RELOAD = cVar6;
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
