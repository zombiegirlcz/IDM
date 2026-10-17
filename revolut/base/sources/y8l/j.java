package y8l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ly8l/j;", "", "REVOLUT", "APM", "BANK_BENEFICIARY", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @lg.b("APM")
    public static final j APM;

    @lg.b("BANK_BENEFICIARY")
    public static final j BANK_BENEFICIARY;

    @lg.b("USER")
    public static final j REVOLUT;

    static {
        j jVar = new j("REVOLUT", 0);
        REVOLUT = jVar;
        j jVar2 = new j("APM", 1);
        APM = jVar2;
        j jVar3 = new j("BANK_BENEFICIARY", 2);
        BANK_BENEFICIARY = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
