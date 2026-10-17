package z1k;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lz1k/d;", "", "TEXT", "NUMERIC", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @lg.b("NUMERIC")
    public static final d NUMERIC;

    @lg.b("TEXT")
    public static final d TEXT;

    static {
        d dVar = new d("TEXT", 0);
        TEXT = dVar;
        d dVar2 = new d("NUMERIC", 1);
        NUMERIC = dVar2;
        d[] dVarArr = {dVar, dVar2};
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
