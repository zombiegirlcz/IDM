package vuf;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvuf/f;", "", "ACTIVATED", "TO_BE_ACTIVATED", "EXPIRED", "NOT_PURCHASED", "PENDING", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @lg.b("ACTIVATED")
    public static final f ACTIVATED;

    @lg.b("EXPIRED")
    public static final f EXPIRED;

    @lg.b("NOT_PURCHASED")
    public static final f NOT_PURCHASED;

    @lg.b("PENDING")
    public static final f PENDING;

    @lg.b("TO_BE_ACTIVATED")
    public static final f TO_BE_ACTIVATED;

    static {
        f fVar = new f("ACTIVATED", 0);
        ACTIVATED = fVar;
        f fVar2 = new f("TO_BE_ACTIVATED", 1);
        TO_BE_ACTIVATED = fVar2;
        f fVar3 = new f("EXPIRED", 2);
        EXPIRED = fVar3;
        f fVar4 = new f("NOT_PURCHASED", 3);
        NOT_PURCHASED = fVar4;
        f fVar5 = new f("PENDING", 4);
        PENDING = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
