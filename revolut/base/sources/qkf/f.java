package qkf;

import aw0.p9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.feature.transactions.impl.R$string;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pkf.l1;
import tof.a3;
import tof.h0;
import tof.j0;
import tof.k0;
import tof.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.b f246994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj5.a f246995b;

    public f(sj5.b shortener, uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(shortener, "shortener");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f246994a = shortener;
        this.f246995b = blockchainUiMapper;
    }

    public static CellDetailsDelegate.Model a(String str, int i, AssetClause assetClause, MoneyClause moneyClause) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), assetClause, moneyClause, null, null, null, 0, null, false, false, null, null, 30704);
    }

    public static CellDetailsDelegate.Model b(a3 transaction, int i) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        l0 l0Var = transaction.Q1;
        if (l0Var == null) {
            return null;
        }
        AssetClause assetClauseA = a.a(l0Var.f272897c, p9.NEVER, null);
        h0 h0Var = l0Var.e;
        return a("ID_DEFI_AMOUNT", i, assetClauseA, h0Var != null ? a.b(h0Var) : null);
    }

    public static CellDetailsDelegate.Model e(h0 h0Var, h0 h0Var2, String str, int i) {
        if (h0Var == null) {
            return null;
        }
        return a(str, i, a.a(h0Var, p9.NEVER, null), h0Var2 != null ? a.b(h0Var2) : null);
    }

    public final CellDetailsDelegate.Model c(a3 transaction) {
        wk5.a aVar;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        l0 l0Var = transaction.Q1;
        if (l0Var == null || (aVar = l0Var.o) == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_DEFI_NETWORK", new t0((Clause) new TextLocalisedClause(R$string.transaction_details_cryptowithdrawal_network, null, null, 14), (Image) null, 0, false, 30), ((ik5.a) this.f246995b).b(aVar, true, null), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    public final CellDetailsActionDelegate.Model d(a3 transaction) {
        Pair pair;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        l0 l0Var = transaction.Q1;
        if (l0Var == null) {
            return null;
        }
        k0 k0Var = l0Var.f272901l;
        j0 j0Var = l0Var.k;
        if (k0Var != null) {
            pair = new Pair(k0Var.f272871a, k0Var.f272872b);
        } else {
            if (j0Var == null) {
                return null;
            }
            pair = new Pair(j0Var.f272839a, j0Var.f272840b);
        }
        String str = (String) pair.f186385a;
        String str2 = (String) pair.f186386b;
        return l1.a("ID_DEFI_TRANSACTION_HASH", R$string.transaction_details_cryptowithdrawal_transaction_hash, ((hk5.b) this.f246994a).a(str), new TransactionCryptoRemittanceAction.TransactionHashAction(str, new BlockchainExplorerTarget.DirectUrl(str2), pj5.b.DIALOG));
    }
}
