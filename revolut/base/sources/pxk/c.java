package pxk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NOT_FOUND;
    public static final c SPOUSE_CONSENTED;
    public static final c SPOUSE_DECLINED;
    public static final c SPOUSE_MATCH_FAILED;
    public static final c WAITING_FOR_CONSENT;

    static {
        c cVar = new c("NOT_FOUND", 0);
        NOT_FOUND = cVar;
        c cVar2 = new c("WAITING_FOR_CONSENT", 1);
        WAITING_FOR_CONSENT = cVar2;
        c cVar3 = new c("SPOUSE_CONSENTED", 2);
        SPOUSE_CONSENTED = cVar3;
        c cVar4 = new c("SPOUSE_DECLINED", 3);
        SPOUSE_DECLINED = cVar4;
        c cVar5 = new c("SPOUSE_MATCH_FAILED", 4);
        SPOUSE_MATCH_FAILED = cVar5;
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
