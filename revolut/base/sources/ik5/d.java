package ik5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wk5.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static TextLocalisedClause a(k addressType) {
        int i;
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        switch (c.f161899a[addressType.ordinal()]) {
            case 1:
                i = R$string.crypto_blockchain_UNSPECIFIED_name;
                break;
            case 2:
                i = R$string.crypto_address_type_BITCOIN_name;
                break;
            case 3:
                i = R$string.crypto_address_type_RIPPLE_name;
                break;
            case 4:
                i = R$string.crypto_address_type_EVM_name;
                break;
            case 5:
                i = R$string.crypto_address_type_SPL_name;
                break;
            case 6:
                i = R$string.crypto_address_type_TRON_name;
                break;
            case 7:
                i = R$string.crypto_address_type_HEDERA_name;
                break;
            case 8:
                i = R$string.crypto_address_type_CASH_name;
                break;
            case 9:
                i = R$string.crypto_address_type_LTC_name;
                break;
            case 10:
                i = R$string.crypto_address_type_DOGE_name;
                break;
            case 11:
                i = R$string.crypto_address_type_ADA_name;
                break;
            case 12:
                i = R$string.crypto_address_type_XLM_name;
                break;
            case 13:
                i = R$string.crypto_address_type_DOT_name;
                break;
            case 14:
                i = R$string.crypto_address_type_EOS_name;
                break;
            case 15:
                i = R$string.crypto_address_type_XTZ_name;
                break;
            case 16:
                i = R$string.crypto_address_type_DASH_name;
                break;
            case 17:
                i = R$string.crypto_address_type_ALGO_name;
                break;
            case 18:
                i = R$string.crypto_address_type_CELO_name;
                break;
            case 19:
                i = R$string.crypto_address_type_FTM_name;
                break;
            case 20:
                i = R$string.crypto_address_type_ATOM_name;
                break;
            case 21:
                i = R$string.crypto_address_type_KSM_name;
                break;
            case 22:
                i = R$string.crypto_address_type_KAVA_name;
                break;
            case 23:
                i = R$string.crypto_address_type_NEAR_name;
                break;
            case 24:
                i = R$string.crypto_address_type_TVM_name;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
