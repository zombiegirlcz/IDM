package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NONE;
    public static final c TOPUP_ONLY;
    public static final c TOPUP_WITHDRAWAL;
    public static final c WITHDRAWAL_ONLY;

    static {
        c cVar = new c("TOPUP_WITHDRAWAL", 0);
        TOPUP_WITHDRAWAL = cVar;
        c cVar2 = new c("WITHDRAWAL_ONLY", 1);
        WITHDRAWAL_ONLY = cVar2;
        c cVar3 = new c("TOPUP_ONLY", 2);
        TOPUP_ONLY = cVar3;
        c cVar4 = new c("NONE", 3);
        NONE = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
