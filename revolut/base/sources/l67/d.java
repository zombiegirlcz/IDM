package l67;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ll67/d;", "", "ACTIVE", "INACTIVE", "IN_PROGRESS", "feature_gambling_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @lg.b("ACTIVE")
    public static final d ACTIVE;

    @lg.b("INACTIVE")
    public static final d INACTIVE;

    @lg.b("PENDING_DEACTIVATION")
    public static final d IN_PROGRESS;

    static {
        d dVar = new d("ACTIVE", 0);
        ACTIVE = dVar;
        d dVar2 = new d("INACTIVE", 1);
        INACTIVE = dVar2;
        d dVar3 = new d("IN_PROGRESS", 2);
        IN_PROGRESS = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
