package ar9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lar9/x;", "", "MARK_AS_PAID", "TRANSFER", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @lg.b("MARK_AS_PAID")
    public static final x MARK_AS_PAID;

    @lg.b("TRANSFER")
    public static final x TRANSFER;

    static {
        x xVar = new x("MARK_AS_PAID", 0);
        MARK_AS_PAID = xVar;
        x xVar2 = new x("TRANSFER", 1);
        TRANSFER = xVar2;
        x[] xVarArr = {xVar, xVar2};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
