package ote;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INVEST;
    public static final c JOINT;
    public static final c MAIN;
    public static final c PRO;
    public static final c SAVINGS;

    static {
        c cVar = new c("SAVINGS", 0);
        SAVINGS = cVar;
        c cVar2 = new c("JOINT", 1);
        JOINT = cVar2;
        c cVar3 = new c("PRO", 2);
        PRO = cVar3;
        c cVar4 = new c("MAIN", 3);
        MAIN = cVar4;
        c cVar5 = new c("INVEST", 4);
        INVEST = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
