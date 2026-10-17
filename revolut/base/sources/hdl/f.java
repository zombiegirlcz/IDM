package hdl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lhdl/f;", "", "CREATED", "ACTIVE", "TRADED", "TERMINATED", "DECLINED", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @lg.b("ACTIVE")
    public static final f ACTIVE;

    @lg.b("CREATED")
    public static final f CREATED;

    @lg.b("DECLINED")
    public static final f DECLINED;

    @lg.b("TERMINATED")
    public static final f TERMINATED;

    @lg.b("TRADED")
    public static final f TRADED;

    static {
        f fVar = new f("CREATED", 0);
        CREATED = fVar;
        f fVar2 = new f("ACTIVE", 1);
        ACTIVE = fVar2;
        f fVar3 = new f("TRADED", 2);
        TRADED = fVar3;
        f fVar4 = new f("TERMINATED", 3);
        TERMINATED = fVar4;
        f fVar5 = new f("DECLINED", 4);
        DECLINED = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
