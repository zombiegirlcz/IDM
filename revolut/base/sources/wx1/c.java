package wx1;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lwx1/c;", "", "ACTIVE", "DELETED", "NOT_REGISTERED", "feature_apm_core_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("ACTIVE")
    public static final c ACTIVE;

    @lg.b("DELETED")
    public static final c DELETED;

    @lg.b("NOT_REGISTERED")
    public static final c NOT_REGISTERED;

    static {
        c cVar = new c("ACTIVE", 0);
        ACTIVE = cVar;
        c cVar2 = new c("DELETED", 1);
        DELETED = cVar2;
        c cVar3 = new c("NOT_REGISTERED", 2);
        NOT_REGISTERED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
