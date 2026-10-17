package hyc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c APPROVED;
    public static final c REJECTED;
    public static final c UNDER_REVIEW;
    public static final c UPDATE_REQUESTED;
    public static final c UPDATE_REQUIRED;
    public static final c UPLOADED;

    static {
        c cVar = new c("UPDATE_REQUESTED", 0);
        UPDATE_REQUESTED = cVar;
        c cVar2 = new c("UPDATE_REQUIRED", 1);
        UPDATE_REQUIRED = cVar2;
        c cVar3 = new c("UNDER_REVIEW", 2);
        UNDER_REVIEW = cVar3;
        c cVar4 = new c("UPLOADED", 3);
        UPLOADED = cVar4;
        c cVar5 = new c("REJECTED", 4);
        REJECTED = cVar5;
        c cVar6 = new c("APPROVED", 5);
        APPROVED = cVar6;
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
