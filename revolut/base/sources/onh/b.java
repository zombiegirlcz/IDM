package onh;

import al4.q;
import android.content.Context;
import aw0.o9;
import b8d.d0;
import com.onfido.workflow.internal.ui.LoadingScreen;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import efm.r;
import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.yt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kfm.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kp0.w0;
import mfm.f;
import n2h.g;
import njf.h;
import p9.f0;
import p9.g0;
import pl.j;
import q75.k;
import qp5.x;
import qv0.i;
import sa9.d;
import sa9.e;
import tof.a3;
import tof.e3;
import tof.x6;
import tof.z6;
import tx0.m0;
import zc.m;
import zhm.u;
import zhm.w;
import zp0.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements g, f0, igm.g, c, o, d, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f226950b;

    public b(d0 function) {
        this.f226949a = 19;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f226950b = function;
    }

    public static boolean a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        z6 z6Var = transaction.H;
        if (z6Var == null || !w0.o(z6Var)) {
            x6 x6Var = transaction.I;
            e3 e3Var = x6Var.d;
            if ((e3Var != null ? e3Var.f272726a : null) == null && x6Var.e == null) {
                return false;
            }
        }
        return true;
    }

    public static CompositeClause f(String code) {
        int i;
        Intrinsics.checkNotNullParameter(code, "code");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < code.length(); i2++) {
            Integer numB = kotlin.text.a.b(code.charAt(i2));
            if (numB != null) {
                arrayList.add(numB);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            switch (((Number) it8.next()).intValue()) {
                case 0:
                    i = R$string.vision_capture_active_liveness_password_zero;
                    break;
                case 1:
                    i = R$string.vision_capture_active_liveness_password_one;
                    break;
                case 2:
                    i = R$string.vision_capture_active_liveness_password_two;
                    break;
                case 3:
                    i = R$string.vision_capture_active_liveness_password_three;
                    break;
                case 4:
                    i = R$string.vision_capture_active_liveness_password_four;
                    break;
                case 5:
                    i = R$string.vision_capture_active_liveness_password_five;
                    break;
                case 6:
                    i = R$string.vision_capture_active_liveness_password_six;
                    break;
                case 7:
                    i = R$string.vision_capture_active_liveness_password_seven;
                    break;
                case 8:
                    i = R$string.vision_capture_active_liveness_password_eight;
                    break;
                case 9:
                    i = R$string.vision_capture_active_liveness_password_nine;
                    break;
                default:
                    throw new IllegalStateException("Only digits can be used for code");
            }
            arrayList2.add(new TextLocalisedClause(i, null, null, 14));
        }
        m70.a.t(t0.f186434a);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2);
    }

    @Override // n2h.g
    public r C0() {
        EtfDetailsFlowController etfDetailsFlowController = (EtfDetailsFlowController) this.f226950b;
        KProperty[] kPropertyArr = EtfDetailsFlowController.R;
        return etfDetailsFlowController.d3().f218661b.d();
    }

    @Override // n2h.g
    public r G0() {
        EtfDetailsFlowController etfDetailsFlowController = (EtfDetailsFlowController) this.f226950b;
        KProperty[] kPropertyArr = EtfDetailsFlowController.R;
        return etfDetailsFlowController.d3().f218661b.c();
    }

    @Override // igm.g
    public void accept(Object obj2) {
        switch (this.f226949a) {
            case 5:
                Disposable it8 = (Disposable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((j) this.f226950b).f237232a.navigateTo(LoadingScreen.f50189a);
                break;
            case 21:
                ((l) this.f226950b).onNext(obj2);
                break;
            default:
                sfm.d dVar = (sfm.d) this.f226950b;
                dVar.getClass();
                lfm.d.d(dVar, (ifm.c) obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f226949a) {
            case 12:
                return ((x) this.f226950b).invoke(obj2);
            case 18:
                return ((x) this.f226950b).invoke(obj2);
            case 19:
                return ((d0) this.f226950b).invoke(obj2);
            case 24:
                return ((h) this.f226950b).invoke(obj2);
            default:
                Object objApply = ((o) this.f226950b).apply(obj2);
                f.b(objApply, "The mapper returned a null Iterable");
                return new j01.b((Iterable) objApply, 6);
        }
    }

    @Override // sa9.d
    public List b() {
        e eVar = (e) this.f226950b;
        i[] elements = {eVar.a(), new ListCellDelegate.Model("CREDIT_CONSENTS", new j8(new ResourceImage(R$drawable.uikit_icn_24_credit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.credit_lead_disclosure_credit_consents_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.credit_lead_disclosure_credit_consents_content, u.c(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.credit_lead_disclosure_credit_report_authorization_link, null, new Click(30, (Integer) null, (Object) null, "credit_report_link_id", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4064), eVar.b(), eVar.c()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return listL;
    }

    @Override // sa9.d
    public List c(boolean z) {
        return u.c(((e) this.f226950b).d(z));
    }

    @Override // sa9.d
    public List d() {
        return u.c(((e) this.f226950b).e());
    }

    @Override // p9.f0
    public Object e(p9.f fVar) {
        return ((g0) this.f226950b).d.o0(fVar);
    }

    public aim.e g(List destinations, dj0.d unallocatedMoney, boolean z, List rates, uib.c cVar) {
        TextLocalisedClause textLocalisedClause;
        pqd.b bVar;
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(unallocatedMoney, "unallocatedMoney");
        Intrinsics.checkNotNullParameter(rates, "rates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : destinations) {
            IncomeSorterDestinationInfo incomeSorterDestinationInfo = ((IncomeSorterHomeContract$DestinationValue) obj2).f87825a;
            if ((incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer)) {
                bVar = pqd.b.SPENDING;
            } else if ((incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) || (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment)) {
                bVar = pqd.b.INVEST;
            } else if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Savings) {
                bVar = pqd.b.SAVINGS;
            } else {
                if (!(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Crypto)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = pqd.b.CRYPTO;
            }
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        List listP0 = zhm.d0.P0(zhm.t0.C(linkedHashMap), new pqd.d());
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = listP0.iterator();
        while (true) {
            m0 m0Var = null;
            if (!it8.hasNext()) {
                m0 m0Var2 = unallocatedMoney.f(dj0.d.e) ? new m0(null, unallocatedMoney.f115082a, R$attr.uikit_colorGreyTone8) : null;
                aim.e eVarB = u.b();
                eVarB.addAll(arrayList2);
                n14.e.b(eVarB, m0Var2);
                return u.a(eVarB);
            }
            Pair pair = (Pair) it8.next();
            pqd.b bVar2 = (pqd.b) pair.f186385a;
            List list = (List) pair.f186386b;
            xi0.b bVar3 = unallocatedMoney.f115083b;
            j9l.a aVar = (j9l.a) this.f226950b;
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((IncomeSorterHomeContract$DestinationValue) it9.next()).f87826b);
            }
            dj0.d dVarA = aVar.a(bVar3, arrayList3, rates);
            long j2 = dVarA != null ? dVarA.f115082a : 0L;
            if (j2 > 0) {
                int i = pqd.c.f238727a[bVar2.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_header_spending, null, null, 14);
                } else if (i == 2) {
                    textLocalisedClause = new TextLocalisedClause(cVar != null ? oc.c.r(cVar) : com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_header_savings, null, null, 14);
                } else if (i == 3) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_header_invest, null, null, 14);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_header_crypto, null, null, 14);
                }
                m0Var = new m0(z ? textLocalisedClause : null, j2, bVar2.a());
            }
            if (m0Var != null) {
                arrayList2.add(m0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String newAmount, boolean z) {
        switch (this.f226949a) {
            case 10:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(newAmount, "formattedValue");
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) ((k) ((LoanPartialRepaymentController) this.f226950b).O.getValue());
                aVar.getClass();
                Intrinsics.checkNotNullParameter(newAmount, "newAmount");
                aVar.H2(aVar.f70503y, new q2g.h(aVar, newAmount, 5));
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(newAmount, "formattedValue");
                r9a.k kVarE3 = ((PixAuthorisationTransactionLimitScreen) this.f226950b).e3();
                kVarE3.getClass();
                Intrinsics.checkNotNullParameter(newAmount, "amountString");
                kVarE3.H2(kVarE3.f252556r, new r4k.x(kVarE3, newAmount, 10));
                break;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f226949a = i;
        this.f226950b = obj2;
    }

    public b(h function) {
        this.f226949a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f226950b = function;
    }

    public b(x function) {
        this.f226949a = 12;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f226950b = function;
    }

    public b(x function, byte b4) {
        this.f226949a = 18;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f226950b = function;
    }

    public b(Context context) {
        this.f226949a = 14;
        uqi.b bVar = new uqi.b(context, (byte) 0);
        m mVarB = m.b(new kge.d(bVar, m.b(rc.j.f253156b), new dfm.c(bVar, rc.j.f253157c, 13)));
        this.f226950b = m.b(new kdh.b(mVarB, m.b(new p56.a(mVarB, 14)), 24));
    }

    public b(mfa.b statusInteractor) {
        this.f226949a = 4;
        Intrinsics.checkNotNullParameter(statusInteractor, "statusInteractor");
        this.f226950b = statusInteractor;
    }

    public b(e usCreditTermsProvider) {
        this.f226949a = 20;
        Intrinsics.checkNotNullParameter(usCreditTermsProvider, "usCreditTermsProvider");
        this.f226950b = usCreditTermsProvider;
    }

    public b(BackendFlowSnapshotsCompressor compressor) {
        this.f226949a = 11;
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.f226950b = compressor;
    }

    public b(of9.k commonProvider) {
        this.f226949a = 15;
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        this.f226950b = commonProvider;
    }

    public b(sic.d perkIconImageMapper, sic.e perkLabelMapper) {
        this.f226949a = 22;
        Intrinsics.checkNotNullParameter(perkIconImageMapper, "perkIconImageMapper");
        Intrinsics.checkNotNullParameter(perkLabelMapper, "perkLabelMapper");
        this.f226950b = perkLabelMapper;
    }

    public b(jul.o virtualContactSearchInteractor) {
        this.f226949a = 8;
        Intrinsics.checkNotNullParameter(virtualContactSearchInteractor, "virtualContactSearchInteractor");
        this.f226950b = virtualContactSearchInteractor;
    }

    public b(rlk.b reasonListBuilder) {
        this.f226949a = 16;
        Intrinsics.checkNotNullParameter(reasonListBuilder, "reasonListBuilder");
        this.f226950b = reasonListBuilder;
    }

    public b(z0h.d dataProvider) {
        this.f226949a = 9;
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        this.f226950b = dataProvider;
    }

    public b(otc.b securityHubType) {
        this.f226949a = 7;
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        this.f226950b = securityHubType;
    }

    public b(g9h.e topMoversDestinationProvider) {
        this.f226949a = 0;
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.f226950b = topMoversDestinationProvider;
    }

    public b(wt5.a cryptoInvestmentsCalculations) {
        this.f226949a = 2;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
        this.f226950b = cryptoInvestmentsCalculations;
    }

    public b(ybl.l tradingConfigInteractor) {
        this.f226949a = 17;
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f226950b = tradingConfigInteractor;
    }

    public b(ynf.f transferUserDescriptionMapper) {
        this.f226949a = 27;
        Intrinsics.checkNotNullParameter(transferUserDescriptionMapper, "transferUserDescriptionMapper");
        this.f226950b = transferUserDescriptionMapper;
    }

    public b(q creditCardProductInteractor) {
        this.f226949a = 28;
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f226950b = creditCardProductInteractor;
    }

    public b(f01.a uiKitResources) {
        this.f226949a = 29;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f226950b = uiKitResources;
    }

    public b(j9l.a moneyCalculator) {
        this.f226949a = 6;
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f226950b = moneyCalculator;
    }
}
