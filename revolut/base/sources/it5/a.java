package it5;

import com.revolut.feature.crypto_investments.api.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MAIN;
    public static final a PERPETUAL;
    public static final a SPOT_MARGIN;
    private final int resId;

    static {
        a aVar = new a("MAIN", 0, R$string.crypto_transaction_filters_account_types_main);
        MAIN = aVar;
        a aVar2 = new a("SPOT_MARGIN", 1, R$string.crypto_transaction_filters_account_types_spot_margin);
        SPOT_MARGIN = aVar2;
        a aVar3 = new a("PERPETUAL", 2, R$string.crypto_transaction_filters_account_types_futures);
        PERPETUAL = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.resId = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.resId;
    }
}
