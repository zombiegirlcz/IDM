package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDRESS;
    public static final c NAME;
    public static final c REGISTRATION_NUMBER;
    public static final c SURNAME;
    public static final c UNKNOWN;

    static {
        c cVar = new c("NAME", 0);
        NAME = cVar;
        c cVar2 = new c("SURNAME", 1);
        SURNAME = cVar2;
        c cVar3 = new c("ADDRESS", 2);
        ADDRESS = cVar3;
        c cVar4 = new c("REGISTRATION_NUMBER", 3);
        REGISTRATION_NUMBER = cVar4;
        c cVar5 = new c("UNKNOWN", 4);
        UNKNOWN = cVar5;
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
