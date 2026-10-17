package xo4;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lxo4/r;", "", "PDF", "HTML", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @lg.b("HTML")
    public static final r HTML;

    @lg.b("PDF")
    public static final r PDF;

    static {
        r rVar = new r("PDF", 0);
        PDF = rVar;
        r rVar2 = new r("HTML", 1);
        HTML = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
