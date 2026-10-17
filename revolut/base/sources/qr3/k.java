package qr3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqr3/k;", "", "SHOW", "SKIP", "REJECTED_UNDISCLOSED", "UNKNOWN", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @lg.b("REJECTED_UNDISCLOSED")
    public static final k REJECTED_UNDISCLOSED;

    @lg.b("SHOW")
    public static final k SHOW;

    @lg.b("SKIP")
    public static final k SKIP;

    @he0.b
    public static final k UNKNOWN;

    static {
        k kVar = new k("SHOW", 0);
        SHOW = kVar;
        k kVar2 = new k("SKIP", 1);
        SKIP = kVar2;
        k kVar3 = new k("REJECTED_UNDISCLOSED", 2);
        REJECTED_UNDISCLOSED = kVar3;
        k kVar4 = new k("UNKNOWN", 3);
        UNKNOWN = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
