package d8e;

import android.animation.TimeInterpolator;
import android.os.Parcelable;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlow;
import com.revolut.feature.crypto.exchange.fees.impl.ui.learnmore.CryptoExchangeFeesLearnMoreBottomSheet;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.list.UploadDocumentsListScreen;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlow;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlow;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetScreen;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import d9.e1;
import dfj.k0;
import dk9.q;
import dmc.v;
import dnc.j;
import dnc.x;
import ds4.o;
import dy0.h0;
import dy0.i0;
import dy0.l0;
import dy0.r;
import e0l.l;
import grl.k9;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import ned.m;
import oi9.k;
import ql7.l1;
import te0.s;
import tf5.i;
import vkm.j2;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112221b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f112220a = i;
        this.f112221b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TimeInterpolator decelerateInterpolator;
        TimeInterpolator decelerateInterpolator2;
        AnalyticsProduct q5;
        int i = this.f112220a;
        boolean z = true;
        int i2 = 14;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = 0;
        Object obj2 = this.f112221b;
        switch (i) {
            case 0:
                return (c) ((r6e.d) ((BillsEditFlow) obj2).P.getValue()).f251723h.get();
            case 1:
                return ((k0) obj2).f114014b.b();
            case 2:
                int i5 = CryptoExchangeFeesLearnMoreBottomSheet.U;
                return (dg5.a) ((i) ((CryptoExchangeFeesLearnMoreBottomSheet) obj2).R.getValue()).f270250b.get();
            case 3:
                return (dgd.d) ((m) ((SharedFavouritesInitScreen) obj2).O.getValue()).f214483c.get();
            case 4:
                int i6 = WidgetSelectorScreen.T;
                return (dhd.d) ((vgd.h) ((WidgetSelectorScreen) obj2).R.getValue()).f288862b.get();
            case 5:
                eh0.c supportedScript = ((di0.i) obj2).f114870b;
                Intrinsics.checkNotNullParameter(supportedScript, "supportedScript");
                int i21 = di0.d.f114863a[supportedScript.ordinal()];
                if (i21 == 1) {
                    rh.f fVarG = g4i.a.g(th.a.f271227c);
                    Intrinsics.checkNotNullExpressionValue(fVarG, "getClient(...)");
                    return fVarG;
                }
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rh.f fVarG2 = g4i.a.g(pu7.a.z());
                Intrinsics.checkNotNullExpressionValue(fVarG2, "getClient(...)");
                return fVarG2;
            case 6:
                KProperty[] kPropertyArr = PayLaterPlanDetailsScreen.j0;
                return (q) ((k) ((PayLaterPlanDetailsScreen) obj2).g0.getValue()).f225534l.get();
            case 7:
                return ((BaseFlow) obj2).L.getAll();
            case 8:
                Disposable disposable = (Disposable) ((AtomicReference) obj2).getAndSet(jgm.c.INSTANCE);
                if (disposable != null) {
                    disposable.dispose();
                }
                return Unit.f186387a;
            case 9:
                KProperty[] kPropertyArr2 = PortfolioAllocationsDetailsScreen.g0;
                v vVar = (v) ((PortfolioAllocationsDetailsScreen) obj2).f85148b0.getValue();
                switch (vVar.f116073a) {
                    case 0:
                        return (j) vVar.f116086t.get();
                    default:
                        return (j) vVar.f116086t.get();
                }
            case 10:
                List<AssetSubclassAllocation.Cash> listP0 = d0.P0((List) ((x) obj2).f116284a.f85155h.getValue(), new dnc.v());
                ArrayList arrayList = new ArrayList(w.t(listP0, 10));
                for (AssetSubclassAllocation.Cash cash : listP0) {
                    xi0.b bVar = cash.f95683b;
                    CurrencyClause currencyClause = new CurrencyClause(bVar, null, null, 6);
                    String str = bVar.f306286a;
                    arrayList.add(new RowDelegate.Model(j6.a.q("row.", str), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) (objArr2 == true ? 1 : 0), (TextLocalisedClause) (objArr == true ? 1 : 0), i2), null, null, false, null, false, 62), currencyClause, null, 0, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new PercentageClause(e1.Z(cash.f95682a), (PercentageClause.Format) null, (Style) null, 6), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
                }
                return arrayList;
            case 11:
                KProperty[] kPropertyArr3 = PopularFirstBuyScreen.f0;
                return (doh.f) ((joh.c) ((PopularFirstBuyScreen) obj2).f96134a0.getValue()).f.get();
            case 12:
                KProperty[] kPropertyArr4 = CancellationDetailsScreen.f75647a0;
                return (dq7.f) ((ql7.h) ((CancellationDetailsScreen) obj2).X.getValue()).f247315c.get();
            case 13:
                KProperty[] kPropertyArr5 = UploadDocumentsListScreen.c0;
                return (dr7.h) ((l1) ((UploadDocumentsListScreen) obj2).X.getValue()).f247378c.get();
            case 14:
                return (dr8.a) ((oq8.e) ((JuniorTransferFlow) obj2).P.getValue()).e.get();
            case 15:
                ((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) obj2).C2(new o());
                return Unit.f186387a;
            case 16:
                dv1.f fVar = (dv1.f) obj2;
                return zhm.v.k(new Pair("^3\\d{9}$", dv1.a.f), new Pair("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", dv1.b.f), new Pair("^@[a-zA-Z0-9]{5,20}$", new dv1.c(1, 0, dv1.f.class, fVar, "alphanumeric", "alphanumeric(Ljava/lang/String;)Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$ExternalId;")), new Pair("^00\\d{8}$", new dv1.d(1, 0, dv1.f.class, fVar, "merchantCode", "merchantCode(Ljava/lang/String;)Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$ExternalId;")), new Pair("^[a-zA-Z0-9]{1,18}$", new dv1.e(1, 0, dv1.f.class, fVar, "documentId", "documentId(Ljava/lang/String;)Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$ExternalId;")));
            case 17:
                oki.h.D2(((com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b) obj2).f69650r);
                return Unit.f186387a;
            case 18:
                return Boolean.valueOf(((jte.d) ((dv5.q) obj2).f118058c).c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c));
            case 19:
                return r0.t(((ew3.a) obj2).f130070a);
            case 20:
                KProperty[] kPropertyArr6 = CryptoCommodityBuyCollectionConfirmationScreen.f71545b0;
                return (dx5.g) ((mw5.i) ((CryptoCommodityBuyCollectionConfirmationScreen) obj2).X.getValue()).e.get();
            case 21:
                return new dxe.d(new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.a(((CheckoutBottomSheetScreen) obj2).Q));
            case 22:
                jji.x xVar = (jji.x) obj2;
                i0 i0Var = ((dy0.h) xVar.f174995c).f120989y;
                i0 i0Var2 = xVar.f174994b.f121014c;
                h0 h0Var = i0Var.f120994b;
                long jA = h0Var != null ? h0Var.a(r.SHOWN) : -1L;
                h0 h0Var2 = i0Var2.f120994b;
                long jA2 = h0Var2 != null ? h0Var2.a(r.HIDDEN) : -1L;
                h0 h0Var3 = i0Var.f120994b;
                if (h0Var3 == null || (decelerateInterpolator = h0Var3.b(r.SHOWN)) == null) {
                    decelerateInterpolator = new DecelerateInterpolator();
                }
                TimeInterpolator timeInterpolator = decelerateInterpolator;
                h0 h0Var4 = i0Var2.f120994b;
                if (h0Var4 == null || (decelerateInterpolator2 = h0Var4.b(r.HIDDEN)) == null) {
                    decelerateInterpolator2 = new DecelerateInterpolator();
                }
                h0 h0Var5 = new h0(jA, jA2, timeInterpolator, decelerateInterpolator2);
                l0 l0Var = i0Var.f120993a;
                boolean z3 = i0Var.f120995c || i0Var2.f120995c;
                if (!i0Var.d && !i0Var2.d) {
                    z = false;
                }
                return new i0(l0Var, h0Var5, z3, z);
            case 23:
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) obj2;
                y yVar = cVar.f90966w;
                cVar.H2(yVar, new dz7.k(7));
                if (((dze.c) ((j2) yVar.f22677a).getValue()).f121326c || ((dze.c) ((j2) yVar.f22677a).getValue()).d) {
                    cVar.f90965t.setValue(dze.k.RESUME);
                }
                return Unit.f186387a;
            case 24:
                return (e03.a) ((tz2.o) ((RevolutCardSettingsFlow) obj2).P.getValue()).d.get();
            case 25:
                int i22 = NationalIdentifierDocumentFragment.j0;
                FragmentActivity activity = ((NationalIdentifierDocumentFragment) obj2).getActivity();
                no.m mVar = activity instanceof no.m ? (no.m) activity : null;
                if (mVar != null && (q5 = mVar.getN()) != null) {
                    return q5;
                }
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            case 26:
                l lVar = (l) obj2;
                xzk.g gVar = lVar.f121734h;
                efm.r rVarA = gVar.a();
                efm.r map = ((xzk.i) gVar.f310043a).w0().c(s.f270018a).map(new xy7.j(9, new xx9.f(23)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                efm.r rVarS = mo3.a.s(o70.a.f(pd.b.r(mo3.a.n(nim.a.w(u1.d(rVarA, map), new xzk.f(gVar, i3))), new e0l.g(lVar, 4))), lVar.f121736l);
                Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
                return hx7.a.K(rVarS, lVar.k, false, true, null, 24).ignoreElements();
            case 27:
                com.revolut.feature.semi_independent_onboarding.impl.ui.details.b bVar2 = (com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) obj2;
                bVar2.f85991q.getClass();
                yji.l.a1(bVar2, bVar2.X1(new mii.k("SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 28:
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) obj2).J.f194072c = false;
                return Unit.f186387a;
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) obj2;
                bVar3.H2(bVar3.f67049t, new e4k.f(13));
                return Unit.f186387a;
        }
    }
}
