package kt5;

import com.revolut.feature.crypto_investments.api.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BUY;
    public static final a CLOSE_POSITION;
    public static final a FEE;
    public static final a PAYMENTS;
    public static final a RECEIVE;
    public static final a REWARDS;
    public static final a SELL;
    public static final a SEND;
    public static final a SPARE_CHANGE;
    public static final a STAKE;
    public static final a UNSTAKE;
    private final int resId;

    static {
        a aVar = new a("BUY", 0, R$string.crypto_transaction_filters_type_buy);
        BUY = aVar;
        a aVar2 = new a("SELL", 1, R$string.crypto_transaction_filters_type_sell);
        SELL = aVar2;
        a aVar3 = new a("REWARDS", 2, R$string.crypto_transaction_filters_type_rewards);
        REWARDS = aVar3;
        a aVar4 = new a("STAKE", 3, R$string.crypto_transaction_filters_type_stake);
        STAKE = aVar4;
        a aVar5 = new a("UNSTAKE", 4, R$string.crypto_transaction_filters_type_unstake);
        UNSTAKE = aVar5;
        a aVar6 = new a("CLOSE_POSITION", 5, R$string.crypto_transaction_filters_type_close_position);
        CLOSE_POSITION = aVar6;
        a aVar7 = new a("FEE", 6, R$string.crypto_transaction_filters_type_fee);
        FEE = aVar7;
        a aVar8 = new a("SEND", 7, R$string.crypto_transaction_filters_type_send);
        SEND = aVar8;
        a aVar9 = new a("RECEIVE", 8, R$string.crypto_transaction_filters_type_receive);
        RECEIVE = aVar9;
        a aVar10 = new a("PAYMENTS", 9, R$string.crypto_transaction_filters_type_payments);
        PAYMENTS = aVar10;
        a aVar11 = new a("SPARE_CHANGE", 10, R$string.crypto_transaction_filters_type_spare_change);
        SPARE_CHANGE = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.resId = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int b() {
        return this.resId;
    }
}
