package g2e;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.javax.inject.Provider;
import com.revolut.core.network.retrofit.RawUrlRequestService;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import ip0.jl0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;
import tof.a3;
import yhm.m;
import zu8.o0;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements e54.e, oii.a, gkd.b, h5b.f, kfm.o, el.b, xph.a, igm.o, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140031b;

    public t(h2i.b function) {
        this.f140030a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f140031b = function;
    }

    public static ArrayList i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            koi.j jVar = (koi.j) it8.next();
            qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
            Object f53832y = pVar != null ? pVar.getF51917h() : null;
            kp3.b bVar = f53832y instanceof kp3.b ? (kp3.b) f53832y : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static kp3.b j(LocalDate selectedDate, List newPages) {
        Intrinsics.checkNotNullParameter(newPages, "newPages");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        List list = newPages;
        kp3.b bVar = (kp3.b) nkm.y.r(nkm.y.z(zhm.d0.Q(list), new a15.l(11, selectedDate)));
        return bVar == null ? (kp3.b) nkm.y.w(nkm.y.z(zhm.d0.Q(list), new hp3.r(2))) : bVar;
    }

    @Override // gkd.b
    public String a() {
        return ((fkd.j) ((fkd.r) this.f140031b).f135790b.e.get(0)).f135769b;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        kl.a0 viewState = (kl.a0) obj2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        ((kl.e0) this.f140031b).f185175q.setValue(viewState);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f140030a) {
            case 13:
                return ((h2i.b) this.f140031b).invoke(obj2);
            case 23:
                return ((j2i.c) this.f140031b).invoke(obj2);
            case 24:
                return ((j2i.c) this.f140031b).invoke(obj2);
            case 25:
                return ((Class) this.f140031b).cast(obj2);
            default:
                return ((kotlin.jvm.internal.h0) this.f140031b).invoke(obj2);
        }
    }

    @Override // xph.a
    public joh.y b(ViewController viewController, EditScreenerScreenContract$Input editScreenerScreenContract$Input) {
        editScreenerScreenContract$Input.getClass();
        return new joh.y((joh.w) this.f140031b, editScreenerScreenContract$Input);
    }

    @Override // oii.a
    public void c() {
        ((gie.e) this.f140031b).f3(gie.b.FINISHED);
    }

    @Override // gkd.b
    public String d() {
        Object next;
        fkd.r rVar = (fkd.r) this.f140031b;
        Iterator it8 = rVar.f135790b.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((fkd.j) next).f135770c == fkd.k.SECONDARY) {
                break;
            }
        }
        fkd.j jVar = (fkd.j) next;
        if (jVar == null) {
            jVar = (fkd.j) rVar.f135790b.e.get(1);
        }
        return jVar.f135769b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0129, code lost:
    
        r9 = (dx4.l) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
    
        if ((r9 instanceof dx4.d) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
    
        r9 = (dx4.d) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0132, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        if (r9 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0135, code lost:
    
        r6 = r9.f120573a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
    
        if ((r6 instanceof dx4.y) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r1 = (dx4.y) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0140, code lost:
    
        if (r1 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        return new e54.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        return e54.c.f122741a;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e54.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r6, long r7, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2e.t.e(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // h5b.f
    public VaultsProgressDelegate f() {
        return (VaultsProgressDelegate) this.f140031b;
    }

    @Override // oii.a
    public void g() {
        ((gie.e) this.f140031b).f3(gie.b.FINISHED);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        OnfidoNavigation onfidoNavigation = (OnfidoNavigation) ((Provider) this.f140031b).get();
        Intrinsics.checkNotNullParameter(onfidoNavigation, "onfidoNavigation");
        Navigator navigator = onfidoNavigation.getNavigator();
        n14.e.g(navigator);
        return navigator;
    }

    @Override // gkd.b
    public String h() throws Throwable {
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("content deeplink is not supported by SlotDefaultTodoTileDeeplinkExtractor");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA == null) {
                return null;
            }
            hx7.e.n(thA);
            return null;
        }
    }

    public Object k(a3 a3Var, gim.c cVar) {
        n02.b bVar;
        tof.k kVar = a3Var.T0;
        if (kVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        tof.l lVar = kVar.f272868a;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        switch (xjf.a.f306516a[lVar.ordinal()]) {
            case 1:
                bVar = n02.b.AANI;
                break;
            case 2:
                bVar = n02.b.BIZUM;
                break;
            case 3:
                bVar = n02.b.BLIK;
                break;
            case 4:
                bVar = n02.b.BREB;
                break;
            case 5:
                bVar = n02.b.QVIK;
                break;
            case 6:
                bVar = n02.b.IRIS;
                break;
            case 7:
                bVar = n02.b.MBWAY;
                break;
            case 8:
                bVar = n02.b.PIX;
                break;
            case 9:
                bVar = n02.b.SPIN;
                break;
            case 10:
                bVar = n02.b.WERO;
                break;
            case 11:
            case 12:
                bVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (bVar == null) {
            return null;
        }
        lx1.d dVar = (lx1.d) this.f140031b;
        String str = kVar.f272869b;
        ky1.a aVarB = ((fy1.o) dVar).f138869b.b(bVar);
        Object objC = aVarB != null ? aVarB.c(str, cVar) : null;
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : (ApmContact) objC;
    }

    public ufm.i l(String url2, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        RawUrlRequestService rawUrlRequestService = (RawUrlRequestService) this.f140031b;
        Intrinsics.checkNotNullParameter(url2, "url");
        efm.d0<Response<ResponseBody>> authUrlResponse = z ? rawUrlRequestService.getAuthUrlResponse(url2) : rawUrlRequestService.getUrlResponse(url2);
        ihd.c cVar = new ihd.c(3, new ijj.p(2));
        authUrlResponse.getClass();
        ufm.i iVar = new ufm.i(authUrlResponse, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public String m(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        t70.b bVar = (t70.b) this.f140031b;
        String strA = bVar.a(currency);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        String strJ = cp5.d.J(currency);
        return strJ == null ? strA == null ? "" : strA : strA == null ? strJ : j6.a.r(strA, " (", strJ, ")");
    }

    public akg.n n(List subscriptions, hfj.a currentDeviceStrategy) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(currentDeviceStrategy, "currentDeviceStrategy");
        return nim.a.v(rd0.e.b(((kdh.b) this.f140031b).j0(false, false)), new h8b.b(this, subscriptions, currentDeviceStrategy));
    }

    public jl0 o(BigDecimal expectedReturn, htk.d comparingToIndex) {
        Pair pair;
        Intrinsics.checkNotNullParameter(expectedReturn, "expectedReturn");
        Intrinsics.checkNotNullParameter(comparingToIndex, "comparingToIndex");
        int i = htk.e.f155451a[comparingToIndex.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_withdraw), Integer.valueOf(R$string.wealth_details_section_suggestion_expected_return_bellow));
        } else if (i == 2) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_topup), Integer.valueOf(R$string.wealth_details_section_suggestion_expected_return_moderately_above));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_topup), Integer.valueOf(R$string.wealth_details_section_suggestion_expected_return_above));
        }
        return htk.l.a(((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue(), "suggestions_widget_item_expected_return", zhm.u.c(ytk.c.b((ytk.c) this.f140031b, expectedReturn, null, ytk.d.ONE, 2)));
    }

    public dj0.d p(String amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        u80.p pVar = u80.p.f278066a;
        return new dj0.d(u80.p.a(amount, currency.f306286a, (qd0.b) this.f140031b, null), currency);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(xi0.b r15, wi0.b r16, com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType r17, u2j.d r18, u2j.b r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2e.t.q(xi0.b, wi0.b, com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType, u2j.d, u2j.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r1 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (skm.k0.b(r12, r3) == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bf -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.io.File r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2e.t.r(java.io.File, gim.c):java.lang.Object");
    }

    public t(j2i.c function) {
        this.f140030a = 23;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f140031b = function;
    }

    public t(j2i.c function, byte b4) {
        this.f140030a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f140031b = function;
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f140030a = i;
        this.f140031b = obj2;
    }

    public t(kotlin.jvm.internal.h0 function) {
        this.f140030a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f140031b = function;
    }

    public t(h87.c controllerModelExtension) {
        this.f140030a = 8;
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f140031b = controllerModelExtension;
    }

    public t(RawUrlRequestService rawUrlRequestService) {
        this.f140030a = 15;
        Intrinsics.checkNotNullParameter(rawUrlRequestService, "rawUrlRequestService");
        this.f140031b = rawUrlRequestService;
    }

    public t(fkd.r tile) {
        this.f140030a = 4;
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f140031b = tile;
    }

    public t(kya.b referralsTroubleshooterRepository) {
        this.f140030a = 6;
        Intrinsics.checkNotNullParameter(referralsTroubleshooterRepository, "referralsTroubleshooterRepository");
        this.f140031b = referralsTroubleshooterRepository;
    }

    public t(t70.b currenciesLocalizationContext) {
        this.f140030a = 26;
        Intrinsics.checkNotNullParameter(currenciesLocalizationContext, "currenciesLocalizationContext");
        this.f140031b = currenciesLocalizationContext;
    }

    public t(edd.d repository) {
        this.f140030a = 20;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f140031b = repository;
    }

    public t(lx1.d apmContactsInteractor) {
        this.f140030a = 29;
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        this.f140031b = apmContactsInteractor;
    }

    public t(qd0.b languageProvider) {
        this.f140030a = 18;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f140031b = languageProvider;
    }

    public t(vdf.d assetFormatter) {
        this.f140030a = 5;
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        this.f140031b = assetFormatter;
    }

    public t(w39.b locationInteractor) {
        this.f140030a = 0;
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f140031b = locationInteractor;
    }

    public t(o0 revPointsOptInPlacementsExtension) {
        this.f140030a = 19;
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsExtension, "revPointsOptInPlacementsExtension");
        this.f140031b = revPointsOptInPlacementsExtension;
    }

    public t(htk.l itemMapper, ytk.c percentageClauseMapper) {
        this.f140030a = 12;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f140031b = percentageClauseMapper;
    }

    public t(g84.e creditCardOfferFlowInteractor) {
        this.f140030a = 1;
        Intrinsics.checkNotNullParameter(creditCardOfferFlowInteractor, "creditCardOfferFlowInteractor");
        this.f140031b = creditCardOfferFlowInteractor;
    }

    public t(kdh.b deviceManagementInteractor) {
        this.f140030a = 9;
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        this.f140031b = deviceManagementInteractor;
    }

    public t(o71.a repository, n4j.c beneficiaryCreationUtils) {
        this.f140030a = 14;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        this.f140031b = repository;
    }

    public t(lp9.b repository, l80.e dateProvider) {
        this.f140030a = 17;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f140031b = repository;
    }

    public t(r10.w shortcutManagerProxy) {
        this.f140030a = 21;
        Intrinsics.checkNotNullParameter(shortcutManagerProxy, "shortcutManagerProxy");
        this.f140031b = shortcutManagerProxy;
    }

    public t(r10.d availableToOnboardAccountsMapper, hjh.d headerMapper) {
        this.f140030a = 10;
        Intrinsics.checkNotNullParameter(availableToOnboardAccountsMapper, "availableToOnboardAccountsMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f140031b = availableToOnboardAccountsMapper;
    }

    public t(je0.d jsonObjectMapper) {
        this.f140030a = 2;
        Intrinsics.checkNotNullParameter(jsonObjectMapper, "jsonObjectMapper");
        this.f140031b = jsonObjectMapper;
    }

    public t(CfdCashBalanceController cfdCashBalanceController) {
        this.f140030a = 7;
        this.f140031b = cfdCashBalanceController.T;
    }
}
