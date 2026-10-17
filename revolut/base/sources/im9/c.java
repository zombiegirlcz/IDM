package im9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNTS;
    public static final c CARDS;
    public static final c NONE;
    public static final c REVOLUT;

    static {
        c cVar = new c("NONE", 0);
        NONE = cVar;
        c cVar2 = new c("REVOLUT", 1);
        REVOLUT = cVar2;
        c cVar3 = new c("ACCOUNTS", 2);
        ACCOUNTS = cVar3;
        c cVar4 = new c("CARDS", 3);
        CARDS = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
