package wbj;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.s7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f296238b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.b f296239a;

    static {
        List listK = v.k(new s7("CryptoDepositReturnDetails_SentTo_Loading", 0, 0, 0, 0, false, null, 126), new s7("CryptoDepositReturnDetails_TransactionHash_Loading", 0, 0, 0, 0, false, null, 126), new s7("CryptoDepositReturnDetails_RecipientGets_Loading", 0, 0, 0, 0, false, null, 126), new s7("CryptoDepositReturnDetails_Fees_Loading", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        f296238b = listK;
    }

    public h(sj5.b cryptoRemittanceValuesShortener) {
        Intrinsics.checkNotNullParameter(cryptoRemittanceValuesShortener, "cryptoRemittanceValuesShortener");
        this.f296239a = cryptoRemittanceValuesShortener;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), (List) iii.c.f(domainState.f296234a, new w6h.f(27), new w6b.a(20), new vjh.c(this, 19)), new lw0.a(new TextLocalisedClause(R$string.transaction_details_cryptodeposit_return_details_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.transaction_details_cryptodeposit_return_details_unsupported_asset_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CryptoDepositReturnDetails_LearnMore_ClickId", false), 10))), null, null, false, 28));
    }
}
