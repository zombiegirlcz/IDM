package dy9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ldy9/c;", "", "USER", "BENEFICIARY", "CARD_OWNER", "COMPANY", "feature_payments_recipients_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("BENEFICIARY")
    public static final c BENEFICIARY;

    @lg.b("CARD_OWNER")
    public static final c CARD_OWNER;

    @lg.b("COMPANY")
    public static final c COMPANY;

    @lg.b("USER")
    public static final c USER;

    static {
        c cVar = new c("USER", 0);
        USER = cVar;
        c cVar2 = new c("BENEFICIARY", 1);
        BENEFICIARY = cVar2;
        c cVar3 = new c("CARD_OWNER", 2);
        CARD_OWNER = cVar3;
        c cVar4 = new c("COMPANY", 3);
        COMPANY = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
