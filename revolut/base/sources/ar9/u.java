package ar9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lar9/u;", "", "ACTIVE", "PENDING", "UNKNOWN", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @lg.b("ACTIVE")
    public static final u ACTIVE;

    @lg.b("PENDING")
    public static final u PENDING;

    @lg.b("UNKNOWN")
    public static final u UNKNOWN;

    static {
        u uVar = new u("ACTIVE", 0);
        ACTIVE = uVar;
        u uVar2 = new u("PENDING", 1);
        PENDING = uVar2;
        u uVar3 = new u("UNKNOWN", 2);
        UNKNOWN = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
