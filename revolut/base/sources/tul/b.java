package tul;

import ahe.m0;
import akg.n;
import android.net.wifi.WifiManager;
import aw0.p0;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.InternalDocSide;
import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.transactions.impl.data.network.CryptoExchangeTransactionsService;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardController;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import efm.d0;
import eye.d;
import ip0.mc0;
import ix0.d2;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kfm.o;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import rd0.e;
import rlm.j;
import skm.e0;
import smd.s;
import t33.r;
import tx0.g4;
import udj.g;
import up9.l;
import v0f.p;
import vge.e2;
import vge.t2;
import vge.v0;
import wli.f;
import wli.i;
import x8j.k;
import xge.b0;
import xge.g0;
import yc.h;
import yhf.v;
import zh9.u0;
import zhm.j0;
import zp0.c;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements o, f, c, y50.a, v0, wif.c, atk.f, d2, h, pyg.f, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f274637b;

    public static HashMap l() {
        HashMap map = new HashMap();
        map.put("id", j.c("ANY_ID"));
        map.put("created_at", j.c("2022-01-20T17:43:32+0000"));
        map.put("file_name", j.c("file_name.mp4"));
        map.put("file_type", j.c("file_type"));
        map.put("href", j.c("href"));
        map.put("download_href", j.c("download_href"));
        map.put("file_size", j.c("1024"));
        return map;
    }

    public static HashMap m(DocType docType, InternalDocSide internalDocSide) {
        HashMap mapL = l();
        mapL.put("applicant_id", j.c("applicant_id"));
        mapL.put("type", j.c(docType.getId()));
        mapL.put("side", j.c(internalDocSide != null ? internalDocSide.getId() : InternalDocSide.FRONT.getId()));
        return mapL;
    }

    @Override // ix0.d2
    public void D(boolean z) {
        xq0.c cVar = (xq0.c) this.f274637b;
        if (Intrinsics.f(cVar.f308028c, mc0.f165357a)) {
            if (z) {
                cVar.a();
            } else {
                cVar.f.removeCallbacks(cVar.f308029g);
                cVar.d = false;
            }
        }
    }

    @Override // vge.v0
    public n a(ProductId productId, Flow originFlow) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return nim.a.v(nim.a.v(u0.m(new m0(((t2) ((e2) this.f274637b)).n(), 21), originFlow), new d(productId, 2)), new vdl.a(this, 25));
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f274636a) {
            case 1:
                return ((r) this.f274637b).invoke(obj2);
            case 2:
                return ((g4) this.f274637b).invoke(obj2);
            case 10:
                return ((vx5.r) this.f274637b).invoke(obj2);
            default:
                return ((xy7.n) this.f274637b).invoke(obj2);
        }
    }

    @Override // wli.f
    public Object b(zli.b bVar, Continuation continuation) {
        return vc.o.n(bVar) ? new i(udj.h.f279236a) : (vc.o.l(bVar) && ((asi.d) this.f274637b).a() == asi.c.SCOPED) ? new i(g.f279235a) : wli.j.f298515a;
    }

    @Override // wif.c
    public d0 c(wif.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        d0<v> transactionDetails = ((CryptoExchangeTransactionsService) this.f274637b).getTransactionDetails(params.f297890a);
        wf6.o oVar = new wf6.o(10, new wgk.f(8));
        transactionDetails.getClass();
        ufm.i iVar = new ufm.i(transactionDetails, oVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // atk.f
    public TextDelegate d() {
        return (TextDelegate) this.f274637b;
    }

    public String e(int i) {
        Pair pair;
        double d = i;
        if (i < 1000) {
            Double dValueOf = Double.valueOf(d);
            m70.a.c(t0.f186434a);
            pair = new Pair(dValueOf, "");
        } else {
            pair = i < 1000000 ? new Pair(Double.valueOf(d / ((double) 1000)), "k") : new Pair(Double.valueOf(d / ((double) 1000000)), "M");
        }
        double dDoubleValue = ((Number) pair.f186385a).doubleValue();
        String str = (String) pair.f186386b;
        DecimalFormat decimalFormat = new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(((s80.b) ((qd0.b) this.f274637b)).a()));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return a0.d.r(decimalFormat.format(dDoubleValue), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable f(j8l.h r7, j8l.h r8, zd5.a r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tul.b.f(j8l.h, j8l.h, zd5.a, gim.c):java.io.Serializable");
    }

    public p0 g(boolean z, io3.d dVar, StakingAvailability stakingAvailability) {
        StakingProduct stakingProduct;
        if (!z) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_action_stake, null, null, 14);
        CircleImageDecorator circleImageDecoratorA = ((f8j.a) this.f274637b).a(R$drawable.uikit_icn_24_arrow_upgrade);
        String str = dVar != null ? dVar.f163145a : null;
        if (stakingAvailability == null || (stakingProduct = stakingAvailability.f88058a) == null) {
            throw new IllegalStateException("Product required if staking is enabled");
        }
        return new p0("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_STAKE", textLocalisedClause, circleImageDecoratorA, new x8j.j(str, stakingProduct, stakingAvailability.f88059b), 4);
    }

    public p0 h(boolean z, StakingAvailability stakingAvailability) {
        StakingPocket stakingPocket;
        if (!z) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_action_unstake, null, null, 14);
        CircleImageDecorator circleImageDecoratorA = ((f8j.a) this.f274637b).a(R$drawable.uikit_icn_24_arrow_downgrade);
        if (stakingAvailability == null || (stakingPocket = stakingAvailability.f88059b) == null) {
            throw new IllegalStateException("Pocket required if unstaking is enabled");
        }
        return new p0("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_UNSTAKE", textLocalisedClause, circleImageDecoratorA, new k(stakingPocket), 4);
    }

    @Override // y50.a
    public void h1(fx.d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        if (delegatesManager.c(VoucherSmallTileDelegate.class) == null) {
            delegatesManager.a(new VoucherSmallTileDelegate());
        }
        if (delegatesManager.c(ListSubheaderDelegate.class) == null) {
            delegatesManager.a(new ListSubheaderDelegate());
        }
        koi.k kVarC = delegatesManager.c(ChatTilesCollectionDelegate.class);
        if (kVarC == null) {
            kVarC = new ChatTilesCollectionDelegate();
            delegatesManager.a(kVarC);
        }
        ChatTilesCollectionDelegate chatTilesCollectionDelegate = (ChatTilesCollectionDelegate) kVarC;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new v06.i(e.b(chatTilesCollectionDelegate.f52058l.f121375b), new v8g.c(this), continuation, 19), 3);
        e0.C(coroutineScope, null, null, new v06.i(e.b(chatTilesCollectionDelegate.k.f121375b), new v8g.d(this), continuation, 20), 3);
    }

    public efm.r i(String portfolioId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i4b.f fVar = (i4b.f) this.f274637b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((w4l.f) fVar.f158330b).e(portfolioId, loadingStrategy);
    }

    public efm.b j(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        i4b.f fVar = (i4b.f) this.f274637b;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return ((w4l.f) fVar.f158330b).g(portfolioId, false);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String amount, boolean z) {
        switch (this.f274636a) {
            case 5:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                l lVar = (l) ((up9.c) ((CustomBillScreen) this.f274637b).Y.getValue());
                lVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                lVar.x2(new uif.d(lVar, amount, 12));
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                ((SharedCreateAlertScreen) this.f274637b).f86735a0.onNext(extractedValue);
                break;
        }
    }

    @Override // zhm.j0
    public Object keyOf(Object obj2) {
        return new WhoToTransferFilter.MobileWallet((String) obj2);
    }

    public n n(ProductSpaceIdentifier spaceIdentifier, pie.v subSpaceIdentifier, Flow originFlow) {
        String strA;
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        g0 g0Var = (g0) ((b0) this.f274637b);
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        if (subSpaceIdentifier == pie.v.FLAT_ROOT) {
            strA = spaceIdentifier.getF89742b();
        } else {
            g0.Companion.getClass();
            strA = xge.d0.a(spaceIdentifier, subSpaceIdentifier);
        }
        return nim.a.v(u0.m(originFlow, new p(g0Var.c(strA), 20)), new xd2.n(this, 22));
    }

    @Override // pyg.f
    public vkm.d r() {
        return e.b(((PortfolioInsightsDashboardController) this.f274637b).M.d);
    }

    @Override // zhm.j0
    public Iterator sourceIterator() {
        return ((ArrayList) this.f274637b).iterator();
    }

    @Override // yc.h
    /* JADX INFO: renamed from: zza */
    public void mo3809zza() throws XmlPullParserException {
        XmlPullParser xmlPullParser;
        yc.b bVar = (yc.b) this.f274637b;
        int i = 0;
        String attributeValue = null;
        String attributeValue2 = null;
        while (true) {
            xmlPullParser = bVar.f312400a;
            if (i >= xmlPullParser.getAttributeCount()) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue = xmlPullParser.getAttributeValue(i);
            }
            if ("errorCode".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue2 = xmlPullParser.getAttributeValue(i);
            }
            i++;
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
        }
        s sVar = bVar.f312401b;
        Integer num = (Integer) xc.a.f304088c.get(attributeValue2);
        if (num == null) {
            throw new IllegalArgumentException(attributeValue2.concat(" is unknown error."));
        }
        Map map = (Map) sVar.f264433b;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        map.put(attributeValue, num);
        while (xmlPullParser.next() != 3) {
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f274636a = i;
        this.f274637b = obj2;
    }

    public b(r function) {
        this.f274636a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274637b = function;
    }

    public b(g4 function) {
        this.f274636a = 2;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274637b = function;
    }

    public b(vx5.r function) {
        this.f274636a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274637b = function;
    }

    public b(xy7.n function) {
        this.f274636a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f274637b = function;
    }

    public b(lr.e repository) {
        this.f274636a = 23;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274637b = repository;
    }

    public b(svl.g tutorialScreenMapper) {
        this.f274636a = 0;
        Intrinsics.checkNotNullParameter(tutorialScreenMapper, "tutorialScreenMapper");
        this.f274637b = tutorialScreenMapper;
    }

    public b(aua.f ratingRepository) {
        this.f274636a = 24;
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        this.f274637b = ratingRepository;
    }

    public b(CryptoExchangeTransactionsService transactionsService) {
        this.f274636a = 12;
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        this.f274637b = transactionsService;
    }

    public b(n80.b buildInfo, WifiManager wifiManager) {
        this.f274636a = 13;
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        this.f274637b = wifiManager;
    }

    public b(v8g.h model) {
        this.f274636a = 6;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f274637b = model;
    }

    public b(i4b.f repository) {
        this.f274636a = 15;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274637b = repository;
    }

    public b(vrl.o monthlyInvestmentsInteractor) {
        this.f274636a = 19;
        Intrinsics.checkNotNullParameter(monthlyInvestmentsInteractor, "monthlyInvestmentsInteractor");
        this.f274637b = monthlyInvestmentsInteractor;
    }

    public b(l61.a userCompanyInteractor) {
        this.f274636a = 28;
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f274637b = userCompanyInteractor;
    }

    public b(qac.i trackingRepository) {
        this.f274636a = 11;
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        this.f274637b = trackingRepository;
    }

    public b(asi.d sessionInteractor) {
        this.f274636a = 3;
        Intrinsics.checkNotNullParameter(sessionInteractor, "sessionInteractor");
        this.f274637b = sessionInteractor;
    }

    public b(b0 repository) {
        this.f274636a = 17;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f274637b = repository;
    }

    public b(xvh.c autoInvestInteractor) {
        this.f274636a = 4;
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        this.f274637b = autoInvestInteractor;
    }

    public b(qd0.b languageProvider) {
        this.f274636a = 9;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f274637b = languageProvider;
    }

    public b(f8j.a commonActionsMapper) {
        this.f274636a = 16;
        Intrinsics.checkNotNullParameter(commonActionsMapper, "commonActionsMapper");
        this.f274637b = commonActionsMapper;
    }

    public b(e2 productAccountRepository) {
        this.f274636a = 8;
        Intrinsics.checkNotNullParameter(productAccountRepository, "productAccountRepository");
        this.f274637b = productAccountRepository;
    }

    public b(t1h.d mapper) {
        this.f274636a = 7;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f274637b = mapper;
    }

    public b(BondDetailsController bondDetailsController) {
        this.f274636a = 14;
        this.f274637b = bondDetailsController.m0;
    }
}
