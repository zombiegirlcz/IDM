package zc8;

import aii.r;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c APPROVED;
    public static final c REJECTED;
    public static final c SKIPPED;

    static {
        c cVar = new c("APPROVED", 0);
        APPROVED = cVar;
        c cVar2 = new c("REJECTED", 1);
        REJECTED = cVar2;
        c cVar3 = new c("SKIPPED", 2);
        SKIPPED = cVar3;
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
