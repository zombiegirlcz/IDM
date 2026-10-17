package ik5;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.remittance.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements uj5.a {

    @NotNull
    public static final C0927a Companion = new C0927a();

    /* JADX INFO: renamed from: ik5.a$a, reason: collision with other inner class name */
    public static final class C0927a {
        private C0927a() {
        }
    }

    public final Clause b(wk5.a blockchain, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        if (z) {
            return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(c(blockchain), num, (Float) null, (Float) null, 28), new TextLocalisedClause(d(blockchain), null, num != null ? new Custom(num, false, null, false, null, 254) : null, 10)));
        }
        return new TextLocalisedClause(d(blockchain), null, null, 14);
    }

    public final int c(wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        switch (b.f161898a[blockchain.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_20_crypto_network_ethereum;
            case 2:
                return R$drawable.uikit_icn_20_crypto_network_polygon;
            case 3:
                return R$drawable.uikit_icn_20_crypto_network_optimism;
            case 4:
            case 5:
                return R$drawable.uikit_icn_20_crypto_network_bsc;
            case 6:
                return R$drawable.uikit_icn_20_crypto_network_avalanche;
            case 7:
                return R$drawable.uikit_icn_20_crypto_network_arbitrum;
            case 8:
                return R$drawable.uikit_icn_20_crypto_network_solana;
            case 9:
                return R$drawable.uikit_icn_20_crypto_network_fantom;
            case 10:
                return R$drawable.uikit_icn_20_crypto_network_bitcoin;
            case 11:
                return R$drawable.uikit_icn_20_crypto_network_tron;
            case 12:
                return R$drawable.uikit_icn_20_crypto_network_fallback;
            case 13:
                return R$drawable.uikit_icn_20_crypto_network_ripple;
            case 14:
                return R$drawable.uikit_icn_20_crypto_network_bitcoin_cash;
            case 15:
                return R$drawable.uikit_icn_20_crypto_network_litecoin;
            case 16:
                return R$drawable.uikit_icn_20_crypto_network_dogecoin;
            case 17:
                return R$drawable.uikit_icn_20_crypto_network_cardano;
            case 18:
                return R$drawable.uikit_icn_20_crypto_network_stellar;
            case 19:
                return R$drawable.uikit_icn_20_crypto_network_polkadot;
            case 20:
                return R$drawable.uikit_icn_20_crypto_network_eos;
            case 21:
                return R$drawable.uikit_icn_20_crypto_network_tezos;
            case 22:
                return R$drawable.uikit_icn_20_crypto_network_dash;
            case 23:
                return R$drawable.uikit_icn_20_crypto_network_algorand;
            case 24:
                return R$drawable.uikit_icn_20_crypto_network_celo;
            case 25:
                return R$drawable.uikit_icn_20_crypto_network_cosmos;
            case 26:
                return R$drawable.uikit_icn_20_crypto_network_kusama;
            case 27:
                return R$drawable.uikit_icn_20_crypto_network_etc;
            case 28:
                return R$drawable.uikit_icn_20_crypto_network_hedera;
            case 29:
                return R$drawable.uikit_icn_20_crypto_network_kava;
            case 30:
                return R$drawable.uikit_icn_20_crypto_network_near;
            case 31:
                return R$drawable.uikit_icn_20_crypto_network_ton;
            case 32:
                return R$drawable.uikit_icn_20_crypto_network_fallback;
            case 33:
                return R$drawable.uikit_icn_20_crypto_network_fallback;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int d(wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        switch (b.f161898a[blockchain.ordinal()]) {
            case 1:
                return R$string.crypto_blockchain_ETHEREUM_name;
            case 2:
                return R$string.crypto_blockchain_POLYGON_name;
            case 3:
                return R$string.crypto_blockchain_OPTIMISM_name;
            case 4:
            case 5:
                return R$string.crypto_blockchain_SMARTCHAIN_name;
            case 6:
                return R$string.crypto_blockchain_AVALANCHE_name;
            case 7:
                return R$string.crypto_blockchain_ARBITRUM_name;
            case 8:
                return R$string.crypto_blockchain_SOLANA_name;
            case 9:
                return R$string.crypto_blockchain_FANTOM_name;
            case 10:
                return R$string.crypto_blockchain_BITCOIN_name;
            case 11:
                return R$string.crypto_blockchain_TRON_name;
            case 12:
                return R$string.crypto_blockchain_UNSPECIFIED_name;
            case 13:
                return R$string.crypto_blockchain_RIPPLE_name;
            case 14:
                return R$string.crypto_blockchain_BITCOINCASH_name;
            case 15:
                return R$string.crypto_blockchain_LITECOIN_name;
            case 16:
                return R$string.crypto_blockchain_DOGECOIN_name;
            case 17:
                return R$string.crypto_blockchain_CARDANO_name;
            case 18:
                return R$string.crypto_blockchain_STELLAR_name;
            case 19:
                return R$string.crypto_blockchain_POLKADOT_name;
            case 20:
                return R$string.crypto_blockchain_EOS_name;
            case 21:
                return R$string.crypto_blockchain_TEZOS_name;
            case 22:
                return R$string.crypto_blockchain_DASH_name;
            case 23:
                return R$string.crypto_blockchain_ALGORAND_name;
            case 24:
                return R$string.crypto_blockchain_CELO_name;
            case 25:
                return R$string.crypto_blockchain_COSMOS_name;
            case 26:
                return R$string.crypto_blockchain_KUSAMA_name;
            case 27:
                return R$string.crypto_blockchain_ETHEREUMCLASSIC_name;
            case 28:
                return R$string.crypto_blockchain_HEDERAHASHGRAPH_name;
            case 29:
                return R$string.crypto_blockchain_KAVA_name;
            case 30:
                return R$string.crypto_blockchain_NEAR_name;
            case 31:
                return R$string.crypto_blockchain_TON_name;
            case 32:
                return R$string.crypto_blockchain_WORLDCHAIN_name;
            case 33:
                return R$string.crypto_blockchain_BASE_name;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
