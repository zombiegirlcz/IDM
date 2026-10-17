package n38;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t ACCEPTED;
    public static final t ACCOUNT_CREATED;
    public static final t CANCELLED;
    public static final t EXPIRED;
    public static final t PENDING;
    public static final t REJECTED;

    static {
        t tVar = new t("ACCEPTED", 0);
        ACCEPTED = tVar;
        t tVar2 = new t("PENDING", 1);
        PENDING = tVar2;
        t tVar3 = new t("REJECTED", 2);
        REJECTED = tVar3;
        t tVar4 = new t("EXPIRED", 3);
        EXPIRED = tVar4;
        t tVar5 = new t("ACCOUNT_CREATED", 4);
        ACCOUNT_CREATED = tVar5;
        t tVar6 = new t("CANCELLED", 5);
        CANCELLED = tVar6;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
