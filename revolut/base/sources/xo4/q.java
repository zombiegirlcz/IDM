package xo4;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lxo4/q;", "", "ACTIVE", "INACTIVE", "LATE", "DEACTIVATING", "TERMINATED", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @lg.b("ACTIVE")
    public static final q ACTIVE;

    @lg.b("DEACTIVATING")
    public static final q DEACTIVATING;

    @lg.b("INACTIVE")
    public static final q INACTIVE;

    @lg.b("LATE")
    public static final q LATE;

    @lg.b("TERMINATED")
    public static final q TERMINATED;

    static {
        q qVar = new q("ACTIVE", 0);
        ACTIVE = qVar;
        q qVar2 = new q("INACTIVE", 1);
        INACTIVE = qVar2;
        q qVar3 = new q("LATE", 2);
        LATE = qVar3;
        q qVar4 = new q("DEACTIVATING", 3);
        DEACTIVATING = qVar4;
        q qVar5 = new q("TERMINATED", 4);
        TERMINATED = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
