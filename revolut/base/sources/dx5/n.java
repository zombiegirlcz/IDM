package dx5;

import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreenContract$InputData;
import dcf.v0;
import ds4.y;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends jki.g implements g {

    @NotNull
    public static final i Companion = new i();
    public final String A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CryptoCommodityBuyCollectionConfirmationScreenContract$InputData f120882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.g f120883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vw5.a f120884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xw5.d f120885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f120886t;
    public final sh5.d u;
    public final wsg.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final rp0.d f120887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rea.m f120888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final be5.e f120889y;
    public final e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jki.p stateMapper, CryptoCommodityBuyCollectionConfirmationScreenContract$InputData inputData, x8h.g collectionsInteractor, vw5.a dialogMapper, xw5.d sharedDialogDisplayer, com.revolut.domain.interactors.transactions.a transactionsInteractor, sh5.d cryptoFcaDisclaimerWidget, wsg.n walletInteractor, rp0.d alertDialogDisplayer, rea.m pocketDetailsInteractor, be5.e cryptoConvertFooterDisclaimerDelegate) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(sharedDialogDisplayer, "sharedDialogDisplayer");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(alertDialogDisplayer, "alertDialogDisplayer");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerDelegate, "cryptoConvertFooterDisclaimerDelegate");
        this.f120882p = inputData;
        this.f120883q = collectionsInteractor;
        this.f120884r = dialogMapper;
        this.f120885s = sharedDialogDisplayer;
        this.f120886t = transactionsInteractor;
        this.u = cryptoFcaDisclaimerWidget;
        this.v = walletInteractor;
        this.f120887w = alertDialogDisplayer;
        this.f120888x = pocketDetailsInteractor;
        this.f120889y = cryptoConvertFooterDisclaimerDelegate;
        CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData = inputData.f71547a;
        this.z = new e(cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.f71519b, cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.f71520c, new Data(null, null, true, 3, null), cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.d, null, null);
        this.A = j6.a.p("toString(...)");
    }

    @Override // yji.l
    public final void T1(long j2) {
        xi0.b bVar;
        Continuation continuation = null;
        n2(new y(this, null, 4), new whi.b(6));
        CryptoCommodityBuyCollectionConfirmationScreenContract$InputData cryptoCommodityBuyCollectionConfirmationScreenContract$InputData = this.f120882p;
        CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData = cryptoCommodityBuyCollectionConfirmationScreenContract$InputData.f71547a;
        CryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData2 = cryptoCommodityBuyCollectionConfirmationScreenContract$InputData.f71547a;
        List list = cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData.d;
        if ((list != null && (bVar = (xi0.b) d0.d0(list)) != null) || (bVar = (xi0.b) d0.d0(cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData2.f71520c.f95265a)) != null) {
            n2(new dlk.k(this, bVar, null, 28), new whi.b(6));
        }
        yji.l.b1(this, q.B(new k(this, null), new dmj.k(rd0.e.b(this.f120887w.f256060c), 13)), null, new v0(this, continuation, 23), 3);
        yji.l.b1(this, rd0.e.b(this.f120883q.b(cryptoCommodityBuyCollectionFlowContract$CollectionQuoteNavigationData2.f71518a, xzg.o.CRYPTO)), null, new dob.c(this, continuation, 23), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
