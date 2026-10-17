package zz1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALPHANUMERIC;
    public static final c DOCUMENT_ID;
    public static final c EMAIL;
    public static final c PHONE;
    public static final c TAX_NUMBER;

    static {
        c cVar = new c("ALPHANUMERIC", 0);
        ALPHANUMERIC = cVar;
        c cVar2 = new c("EMAIL", 1);
        EMAIL = cVar2;
        c cVar3 = new c("PHONE", 2);
        PHONE = cVar3;
        c cVar4 = new c("TAX_NUMBER", 3);
        TAX_NUMBER = cVar4;
        c cVar5 = new c("DOCUMENT_ID", 4);
        DOCUMENT_ID = cVar5;
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
