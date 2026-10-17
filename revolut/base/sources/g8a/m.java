package g8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CANCELLED_BY_RECIPIENT;
    public static final m CANCELLED_BY_SERVICE_PROVIDER;
    public static final m DECLINED;
    public static final m ENDED;
    public static final m EXPIRED;
    public static final m FAILED;

    static {
        m mVar = new m("DECLINED", 0);
        DECLINED = mVar;
        m mVar2 = new m("ENDED", 1);
        ENDED = mVar2;
        m mVar3 = new m("EXPIRED", 2);
        EXPIRED = mVar3;
        m mVar4 = new m("CANCELLED_BY_SERVICE_PROVIDER", 3);
        CANCELLED_BY_SERVICE_PROVIDER = mVar4;
        m mVar5 = new m("CANCELLED_BY_RECIPIENT", 4);
        CANCELLED_BY_RECIPIENT = mVar5;
        m mVar6 = new m("FAILED", 5);
        FAILED = mVar6;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
