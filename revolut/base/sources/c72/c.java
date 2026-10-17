package c72;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lc72/c;", "", "UNKNOWN", "ACTIVE", "USED", "EXPIRED", "CANCELLED", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("ACTIVE")
    public static final c ACTIVE;

    @lg.b("CANCELLED")
    public static final c CANCELLED;

    @lg.b("EXPIRED")
    public static final c EXPIRED;

    @lg.b("")
    public static final c UNKNOWN;

    @lg.b("USED")
    public static final c USED;

    static {
        c cVar = new c("UNKNOWN", 0);
        UNKNOWN = cVar;
        c cVar2 = new c("ACTIVE", 1);
        ACTIVE = cVar2;
        c cVar3 = new c("USED", 2);
        USED = cVar3;
        c cVar4 = new c("EXPIRED", 3);
        EXPIRED = cVar4;
        c cVar5 = new c("CANCELLED", 4);
        CANCELLED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
