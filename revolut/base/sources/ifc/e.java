package ifc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lifc/e;", "", "CARD", "REVOLUT_WALLET", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @lg.b("CARD")
    public static final e CARD;

    @lg.b("REVO_WALLET")
    public static final e REVOLUT_WALLET;

    static {
        e eVar = new e("CARD", 0);
        CARD = eVar;
        e eVar2 = new e("REVOLUT_WALLET", 1);
        REVOLUT_WALLET = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
