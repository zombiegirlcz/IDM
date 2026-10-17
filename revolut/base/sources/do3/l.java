package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l EXPIRED;
    public static final l IN_REVIEW;
    public static final l REJECTED;
    public static final l UNKNOWN;
    public static final l VERIFIED;
    public static final l WAITING_FOR_VERIFICATION;

    static {
        l lVar = new l("WAITING_FOR_VERIFICATION", 0);
        WAITING_FOR_VERIFICATION = lVar;
        l lVar2 = new l("IN_REVIEW", 1);
        IN_REVIEW = lVar2;
        l lVar3 = new l("VERIFIED", 2);
        VERIFIED = lVar3;
        l lVar4 = new l("REJECTED", 3);
        REJECTED = lVar4;
        l lVar5 = new l("EXPIRED", 4);
        EXPIRED = lVar5;
        l lVar6 = new l("UNKNOWN", 5);
        UNKNOWN = lVar6;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
