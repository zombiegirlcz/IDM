package cqc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FUNDS_SENT_TO_WRONG_ACCOUNT;
    public static final c SALARY_NOT_RECEIVED;
    public static final c UNKNOWN;

    static {
        c cVar = new c("FUNDS_SENT_TO_WRONG_ACCOUNT", 0);
        FUNDS_SENT_TO_WRONG_ACCOUNT = cVar;
        c cVar2 = new c("SALARY_NOT_RECEIVED", 1);
        SALARY_NOT_RECEIVED = cVar2;
        c cVar3 = new c("UNKNOWN", 2);
        UNKNOWN = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
