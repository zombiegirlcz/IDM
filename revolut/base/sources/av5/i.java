package av5;

import com.revolut.feature.crypto_investments.api.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CURRENCY;
    public static final i TRANSACTION_TYPE;
    private final int resId;

    static {
        i iVar = new i("TRANSACTION_TYPE", 0, R$string.crypto_transaction_filters_filters_screen_transaction_types_subheader);
        TRANSACTION_TYPE = iVar;
        i iVar2 = new i("CURRENCY", 1, R$string.crypto_transaction_filters_filters_screen_currencies_subheader);
        CURRENCY = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public i(String str, int i, int i2) {
        this.resId = i2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int a() {
        return this.resId;
    }
}
