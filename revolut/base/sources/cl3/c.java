package cl3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FREQUENT;
    public static final c NOT_REVOLUT;
    public static final c ON_REVOLUT;
    public static final c RECENT;

    static {
        c cVar = new c("FREQUENT", 0);
        FREQUENT = cVar;
        c cVar2 = new c("RECENT", 1);
        RECENT = cVar2;
        c cVar3 = new c("ON_REVOLUT", 2);
        ON_REVOLUT = cVar3;
        c cVar4 = new c("NOT_REVOLUT", 3);
        NOT_REVOLUT = cVar4;
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
