package ocl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Locl/b;", "", "ACTIVE", "INACTIVE", "PENDING_DEACTIVATION", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @lg.b("ACTIVE")
    public static final b ACTIVE;

    @lg.b("INACTIVE")
    public static final b INACTIVE;

    @lg.b("PENDING_DEACTIVATION")
    public static final b PENDING_DEACTIVATION;

    static {
        b bVar = new b("ACTIVE", 0);
        ACTIVE = bVar;
        b bVar2 = new b("INACTIVE", 1);
        INACTIVE = bVar2;
        b bVar3 = new b("PENDING_DEACTIVATION", 2);
        PENDING_DEACTIVATION = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
