package e7c;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Le7c/a0;", "", "PAY_WITH_REVOLUT", "CARD", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;

    @lg.b("CARD")
    public static final a0 CARD;

    @lg.b("PAY_WITH_REVOLUT")
    public static final a0 PAY_WITH_REVOLUT;

    static {
        a0 a0Var = new a0("PAY_WITH_REVOLUT", 0);
        PAY_WITH_REVOLUT = a0Var;
        a0 a0Var2 = new a0("CARD", 1);
        CARD = a0Var2;
        a0[] a0VarArr = {a0Var, a0Var2};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
