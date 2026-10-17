package f4h;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.workflow.WorkflowConfig;
import com.revolut.biometric_verification.api.models.BiometricVerificationValidityConfig;
import com.revolut.biometric_verification.api.models.CheckA;
import com.revolut.biometric_verification.api.models.CheckB;
import com.revolut.biometric_verification.api.models.CheckC;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.rd;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.ui.repayamount.PayLaterRepayAmountScreen;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.wealth.mutual_funds.impl.ui.mutual_fund_details.MutualFundDetailsScreen;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.wealth.resources.R$string;
import cs0.a;
import efm.r;
import g4k.p;
import hx7.e;
import i2i.d0;
import igm.i;
import il.f;
import il.l;
import ip0.jl0;
import ish.h;
import ish.z;
import ix0.m0;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jo0.i;
import jq9.t;
import jq9.v;
import jq9.w;
import jq9.y;
import kfm.o;
import kk9.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n2h.g;
import q2h.k;
import skm.e0;
import skm.p0;
import vkm.q;
import yhm.m;
import zhm.u;
import zm3.j;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements g, k, gkd.b, o, g5b.d, el.b, jz0.c, igm.o, igm.b, zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f132229b;

    public a(h2i.b function) {
        this.f132228a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132229b = function;
    }

    public static String m(t recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof y) {
            zm3.a aVar = ((y) recipient).f177526a;
            j jVar = aVar instanceof j ? (j) aVar : null;
            if (jVar != null) {
                return jVar.f;
            }
        } else {
            if (recipient instanceof v) {
                return ((v) recipient).f177523a.f132329a;
            }
            if (recipient instanceof w) {
                return ((w) recipient).f177524a.f81495a.f81490a;
            }
        }
        return null;
    }

    @Override // n2h.g
    public r C0() {
        MutualFundDetailsScreen mutualFundDetailsScreen = (MutualFundDetailsScreen) this.f132229b;
        KProperty[] kPropertyArr = MutualFundDetailsScreen.f95717b0;
        return mutualFundDetailsScreen.d3().d.d();
    }

    @Override // n2h.g
    public r G0() {
        MutualFundDetailsScreen mutualFundDetailsScreen = (MutualFundDetailsScreen) this.f132229b;
        KProperty[] kPropertyArr = MutualFundDetailsScreen.f95717b0;
        return mutualFundDetailsScreen.d3().d.c();
    }

    @Override // gkd.b
    public String a() {
        return null;
    }

    @Override // igm.b
    public void accept(Object obj2, Object obj3) {
        ((Map) obj2).put(((igm.o) this.f132229b).apply(obj3), obj3);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f132228a) {
            case 8:
                return ((h2i.b) this.f132229b).invoke(obj2);
            case 20:
                return ((d0) this.f132229b).invoke(obj2);
            case 24:
                return ((j2i.c) this.f132229b).invoke(obj2);
            default:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 4) {
                    return ((i) this.f132229b).apply(objArr[0], objArr[1], objArr[2], objArr[3]);
                }
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    @Override // jz0.c
    public void b() {
        UiKitMediaView view = ((rd) this.f132229b).f54665j;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleX(0.9f);
        view.setScaleY(0.9f);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        RevolutShimmerDrawable revolutShimmerDrawable = new RevolutShimmerDrawable();
        a.c cVar = new a.c();
        cVar.f108423a.e = -1;
        a.c cVar2 = (a.c) cVar.c(BitmapDescriptorFactory.HUE_RED);
        cVar2.k(cs0.b.MASKED);
        cVar2.f108423a.f108420r = true;
        a.c cVar3 = (a.c) cVar2.i(50.0f);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar3.f108423a.d = kli.a.s(R$attr.uikit_colorGrey20_30, context);
        a.c cVar4 = (a.c) cVar3.f(2750L);
        cVar4.f108423a.f108417n = 1;
        revolutShimmerDrawable.a(cVar4.a());
        view.setForeground(revolutShimmerDrawable);
        revolutShimmerDrawable.b();
        view.animate().scaleX(1.0f).scaleY(1.0f).withLayer().setDuration(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new d0.c(view, revolutShimmerDrawable, 27)).start();
        view.animate().alpha(1.0f).setDuration(2500L).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // q2h.k
    public RowDelegate c() {
        return (RowDelegate) this.f132229b;
    }

    @Override // gkd.b
    public String d() {
        return null;
    }

    @Override // jz0.c
    public void e() {
    }

    @Override // g5b.d
    public CellDetailsActionDelegate f() {
        return (CellDetailsActionDelegate) this.f132229b;
    }

    public vw.g g() {
        BiometricVerificationValidityConfig biometricVerificationValidityConfig = ((ly.c) this.f132229b).i.d;
        if (biometricVerificationValidityConfig != null) {
            return new vw.g(biometricVerificationValidityConfig.f50412a, biometricVerificationValidityConfig.f50413b, biometricVerificationValidityConfig.f50414c);
        }
        return null;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        OnfidoConfig onfidoConfig = (OnfidoConfig) ((f) this.f132229b).get();
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        FlowConfig workflowConfig = onfidoConfig.getWorkflowConfig();
        Intrinsics.i(workflowConfig, "null cannot be cast to non-null type com.onfido.workflow.WorkflowConfig");
        return (WorkflowConfig) workflowConfig;
    }

    @Override // gkd.b
    public String h() {
        return ((fkd.f) this.f132229b).f135761b.f135759b;
    }

    public z i(csh.k dependenciesApi) {
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        h hVar = new h(dependenciesApi.e(), new r10.f(dependenciesApi.c()));
        hsh.d repositoryProvider = (hsh.d) this.f132229b;
        Intrinsics.checkNotNullParameter(repositoryProvider, "repositoryProvider");
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        r10.d dVar = new r10.d();
        dVar.f250818a = repositoryProvider;
        dVar.f250819b = dependenciesApi;
        return new z(hVar, dVar);
    }

    public vw.d j() {
        CheckC checkC = ((ly.c) this.f132229b).i.f50393c;
        if (checkC != null) {
            return new vw.d(checkC.f50420a, checkC.f50421b, checkC.f50422c, checkC.d, checkC.e);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String newAmount, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(newAmount, "formattedValue");
        n nVar = (n) ((kk9.j) ((PayLaterRepayAmountScreen) this.f132229b).c0.getValue());
        nVar.getClass();
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        nVar.x2(new k7c.n(newAmount, 10));
    }

    public jl0 l(BigDecimal pricePercentageChange, htk.b priceChange) {
        Pair pair;
        Intrinsics.checkNotNullParameter(pricePercentageChange, "pricePercentageChange");
        Intrinsics.checkNotNullParameter(priceChange, "priceChange");
        int i = htk.c.f155450a[priceChange.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_wealth), Integer.valueOf(R$string.wealth_details_section_suggestion_analysts_expect_price_rise));
        } else if (i == 2) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_wealth_down), Integer.valueOf(R$string.wealth_details_section_suggestion_analysts_expect_price_fall));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_status_active), Integer.valueOf(R$string.wealth_details_section_suggestion_analysts_expect_price_increase));
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        ytk.c cVar = (ytk.c) this.f132229b;
        BigDecimal bigDecimalAbs = pricePercentageChange.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return htk.l.a(iIntValue, iIntValue2, "suggestions_widget_item_expected_price_change", u.c(ytk.c.b(cVar, bigDecimalAbs, null, ytk.d.ONE, 2)));
    }

    public wkm.l n(BankTransferData transferData, f5j.a beneficiary, List additionalInputsConfig, Set extraConfigs) {
        TransferFlowType.Default flowType = TransferFlowType.Default.f92257b;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(additionalInputsConfig, "additionalInputsConfig");
        Intrinsics.checkNotNullParameter(extraConfigs, "extraConfigs");
        p pVar = (p) this.f132229b;
        pVar.getClass();
        TransferFlowType.Default flowType2 = TransferFlowType.Default.f92257b;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType2, "flowType");
        Intrinsics.checkNotNullParameter(additionalInputsConfig, "additionalInputsConfig");
        Intrinsics.checkNotNullParameter(extraConfigs, "extraConfigs");
        return q.Q(ta6.a.h(pVar.a(transferData, beneficiary), pVar.b(transferData, beneficiary, flowType2), pVar.f140577m.a(transferData.d), new g4k.n(4, null)), new g4k.g(null, pVar, transferData, additionalInputsConfig, beneficiary, extraConfigs, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof h6i.x0
            if (r3 == 0) goto L19
            r3 = r2
            h6i.x0 r3 = (h6i.x0) r3
            int r4 = r3.f149737w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f149737w = r4
            goto L1e
        L19:
            h6i.x0 r3 = new h6i.x0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f149737w
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            yhm.o.b(r2)
            goto L81
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r2)
            java.lang.Object r2 = r0.f132229b
            r8 = r2
            k61.a r8 = (k61.a) r8
            xi0.b r9 = hx7.e.k(r1)
            long r10 = r1.f97403c
            gk3.i r2 = gk3.i.WALLET_TRANSFER
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r1.d
            com.revolut.feature_move_money.api.model.AccountSource r5 = r5.d
            prf.a r15 = q6i.a.a(r5)
            com.revolut.feature_move_money.api.model.AccountWrapper r1 = r1.e
            com.revolut.feature_move_money.api.model.AccountSource r1 = r1.d
            prf.a r16 = q6i.a.a(r1)
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r10)
            r17 = 24
            r10 = 0
            r12 = 0
            r13 = 0
            r11 = r2
            efm.r r1 = k61.a.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            h43.q r2 = new h43.q
            r5 = 6
            r2.<init>(r5)
            efm.r r1 = m70.a.g(r1, r7, r2, r6)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.f149737w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L81
            return r4
        L81:
            krf.f r2 = (krf.f) r2
            if (r2 == 0) goto Lb9
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.util.ArrayList r1 = r2.f188864a
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L9b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r1.next()
            krf.c r4 = (krf.c) r4
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r4 = v8i.b.a(r4)
            r3.add(r4)
            goto L9b
        Laf:
            boolean r1 = r2.f188865b
            java.lang.String r2 = r2.f188866c
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig r4 = new com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig
            r4.<init>(r2, r3, r1)
            return r4
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f4h.a.o(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, gim.c):java.lang.Object");
    }

    public void p() throws Throwable {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            jo0.i.f176844b = q();
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean q() {
        ((m0) this.f132229b).getClass();
        String str = m0.f169262c;
        String str2 = m0.f169261b;
        if (str2 == null) {
            return false;
        }
        switch (str2.hashCode()) {
            case -1675632421:
                if (!str2.equals("Xiaomi") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -2132107540:
                        return str.equals("2201116PG");
                    case -2132107447:
                        return str.equals("2201116SG");
                    case -2132106455:
                        return str.equals("2201117TG");
                    case -2132106437:
                        return str.equals("2201117TY");
                    case -2072917132:
                        return str.equals("220333QAG");
                    case -2072916711:
                        return str.equals("220333QNY");
                    case -1992758437:
                        return str.equals("2310FPCA4G");
                    case -1962813219:
                        return str.equals("2409BRN2CA");
                    case -1962813195:
                        return str.equals("2409BRN2CY");
                    case -1670994835:
                        return str.equals("22011119UY");
                    case -1546863963:
                        return str.equals("Redmi 8");
                    case -1532915008:
                        return str.equals("23117RA68G");
                    case -1244549857:
                        return str.equals("22111317G");
                    case -731297408:
                        return str.equals("23124RA7EO");
                    case -730909606:
                        return str.equals("23124RN87G");
                    case -588153547:
                        return str.equals("23129RA5FL");
                    case -588142578:
                        return str.equals("23129RAA4G");
                    case -587766903:
                        return str.equals("23129RN51X");
                    case -273221483:
                        return str.equals("2312DRAABG");
                    case -217751013:
                        return str.equals("2312FPCA6G");
                    case -201721477:
                        return str.equals("220733SG");
                    case 73660447:
                        return str.equals("22111317PG");
                    case 160154102:
                        return str.equals("23053RN02A");
                    case 160154126:
                        return str.equals("23053RN02Y");
                    case 279010192:
                        return str.equals("21061119DG");
                    case 581110176:
                        return str.equals("M2004J19C");
                    case 582751196:
                        return str.equals("M2006C3LG");
                    case 582751227:
                        return str.equals("M2006C3MG");
                    case 805913840:
                        return str.equals("M2003J15SC");
                    case 885418428:
                        return str.equals("M2006C3LVG");
                    case 885419141:
                        return str.equals("M2006C3MNG");
                    case 925981508:
                        return str.equals("24116RACCG");
                    case 954986005:
                        return str.equals("24117RN76E");
                    case 1133803952:
                        return str.equals("22126RN91Y");
                    case 1255552637:
                        return str.equals("M1908C3JGG");
                    case 1607533934:
                        return str.equals("M2010J19SY");
                    case 1674281653:
                        return str.equals("24040RN64Y");
                    case 1734981131:
                        return str.equals("23021RAA2Y");
                    case 1734981702:
                        return str.equals("23021RAAEG");
                    case 1846301339:
                        return str.equals("23106RN0DA");
                    case 1903559169:
                        return str.equals("23108RN04Y");
                    case 1935760518:
                        return str.equals("23028RN4DG");
                    case 2021057187:
                        return str.equals("23076RN8DY");
                    default:
                        return false;
                }
            case -1631735723:
                if (!str2.equals("INFINIX") || str == null) {
                    return false;
                }
                int iHashCode = str.hashCode();
                return iHashCode != -1236182928 ? iHashCode != 791407119 ? iHashCode == 791409240 && str.equals("Infinix X678B") : str.equals("Infinix X6525") : str.equals("Infinix X6528B");
            case -934971466:
                if (!str2.equals("realme") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case 2048141306:
                        return str.equals("RMX3231");
                    case 2048143353:
                        return str.equals("RMX3472");
                    case 2048144127:
                        return str.equals("RMX3511");
                    case 2048144158:
                        return str.equals("RMX3521");
                    case 2048145149:
                        return str.equals("RMX3630");
                    case 2048146048:
                        return str.equals("RMX3710");
                    case 2048146203:
                        return str.equals("RMX3760");
                    case 2048147071:
                        return str.equals("RMX3830");
                    case 2048147075:
                        return str.equals("RMX3834");
                    case 2048147257:
                        return str.equals("RMX3890");
                    case 2048148041:
                        return str.equals("RMX3939");
                    default:
                        return false;
                }
            case -151542385:
                if (!str2.equals("motorola") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -1960390936:
                        return str.equals("moto g(30)");
                    case -1728134715:
                        return str.equals("moto g 5G - 2024");
                    case -1512393721:
                        return str.equals("motorola edge 30 neo");
                    case -632482952:
                        return str.equals("moto g31(w)");
                    case -632403283:
                        return str.equals("moto g34 5G");
                    case -630586032:
                        return str.equals("moto g53 5G");
                    case -629692302:
                        return str.equals("moto g62 5G");
                    case -627845260:
                        return str.equals("moto g82 5G");
                    case -627785678:
                        return str.equals("moto g84 5G");
                    case -627755887:
                        return str.equals("moto g85 5G");
                    case -478872629:
                        return str.equals("moto g04s");
                    case -153996732:
                        return str.equals("moto e13");
                    case -153996731:
                        return str.equals("moto e14");
                    case -153996704:
                        return str.equals("moto e20");
                    case -153996702:
                        return str.equals("moto e22");
                    case -153994840:
                        return str.equals("moto g04");
                    case -153994810:
                        return str.equals("moto g13");
                    case -153994809:
                        return str.equals("moto g14");
                    case -153994780:
                        return str.equals("moto g22");
                    case -153994779:
                        return str.equals("moto g23");
                    case -153994778:
                        return str.equals("moto g24");
                    case -153994749:
                        return str.equals("moto g32");
                    case -153994718:
                        return str.equals("moto g42");
                    case -153994687:
                        return str.equals("moto g52");
                    case -153994625:
                        return str.equals("moto g72");
                    case 408310347:
                        return str.equals("moto g24 power");
                    case 1719121411:
                        return str.equals("moto g play - 2024");
                    default:
                        return false;
                }
            case 82877:
                if (!str2.equals("TCL") || str == null) {
                    return false;
                }
                int iHashCode2 = str.hashCode();
                return iHashCode2 != 79175556 ? iHashCode2 != 79202657 ? iHashCode2 == 79233130 && str.equals("T610K") : str.equals("T509K") : str.equals("T433D");
            case 2432928:
                if (!str2.equals("OPPO") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -1938691782:
                        return str.equals("PEHM00");
                    case 75411208:
                        return str.equals("OPG02");
                    case 1691545251:
                        return str.equals("CPH1823");
                    case 1691546156:
                        return str.equals("CPH1909");
                    case 1691546179:
                        return str.equals("CPH1911");
                    case 1691546209:
                        return str.equals("CPH1920");
                    case 1691546212:
                        return str.equals("CPH1923");
                    case 1691546342:
                        return str.equals("CPH1969");
                    case 1691546404:
                        return str.equals("CPH1989");
                    case 1691567290:
                        return str.equals("CPH2001");
                    case 1691567325:
                        return str.equals("CPH2015");
                    case 1691567352:
                        return str.equals("CPH2021");
                    case 1691567482:
                        return str.equals("CPH2067");
                    case 1691567540:
                        return str.equals("CPH2083");
                    case 1691567573:
                        return str.equals("CPH2095");
                    case 1691567577:
                        return str.equals("CPH2099");
                    case 1691568319:
                        return str.equals("CPH2127");
                    case 1691568348:
                        return str.equals("CPH2135");
                    case 1691568476:
                        return str.equals("CPH2179");
                    case 1691568503:
                        return str.equals("CPH2185");
                    case 1691568536:
                        return str.equals("CPH2197");
                    case 1691569251:
                        return str.equals("CPH2219");
                    case 1691569313:
                        return str.equals("CPH2239");
                    case 1691569400:
                        return str.equals("CPH2263");
                    case 1691569406:
                        return str.equals("CPH2269");
                    case 1691569429:
                        return str.equals("CPH2271");
                    case 1691569431:
                        return str.equals("CPH2273");
                    case 1691570181:
                        return str.equals("CPH2309");
                    case 1691570239:
                        return str.equals("CPH2325");
                    case 1691570268:
                        return str.equals("CPH2333");
                    case 1691570299:
                        return str.equals("CPH2343");
                    case 1691570305:
                        return str.equals("CPH2349");
                    case 1691570330:
                        return str.equals("CPH2353");
                    case 1691570361:
                        return str.equals("CPH2363");
                    case 1691570363:
                        return str.equals("CPH2365");
                    case 1691570394:
                        return str.equals("CPH2375");
                    case 1691570425:
                        return str.equals("CPH2385");
                    case 1691570427:
                        return str.equals("CPH2387");
                    case 1691571293:
                        return str.equals("CPH2455");
                    case 1691571295:
                        return str.equals("CPH2457");
                    case 1691571320:
                        return str.equals("CPH2461");
                    case 1691571351:
                        return str.equals("CPH2471");
                    case 1691571353:
                        return str.equals("CPH2473");
                    case 1691571357:
                        return str.equals("CPH2477");
                    case 1691571382:
                        return str.equals("CPH2481");
                    case 1691571384:
                        return str.equals("CPH2483");
                    case 1691572099:
                        return str.equals("CPH2505");
                    case 1691572159:
                        return str.equals("CPH2523");
                    case 1691572163:
                        return str.equals("CPH2527");
                    case 1691572165:
                        return str.equals("CPH2529");
                    case 1691572285:
                        return str.equals("CPH2565");
                    case 1691572318:
                        return str.equals("CPH2577");
                    case 1691572320:
                        return str.equals("CPH2579");
                    case 1691572374:
                        return str.equals("CPH2591");
                    case 1691573149:
                        return str.equals("CPH2631");
                    case 1691573155:
                        return str.equals("CPH2637");
                    case 1691573157:
                        return str.equals("CPH2639");
                    case 1691573180:
                        return str.equals("CPH2641");
                    case 1691573246:
                        return str.equals("CPH2665");
                    case 1691573250:
                        return str.equals("CPH2669");
                    case 1691573304:
                        return str.equals("CPH2681");
                    case 1691573306:
                        return str.equals("CPH2683");
                    case 1691573310:
                        return str.equals("CPH2687");
                    case 1691574048:
                        return str.equals("CPH2711");
                    case 1908550451:
                        return str.equals("A201OP");
                    case 1909473972:
                        return str.equals("A301OP");
                    default:
                        return false;
                }
            case 2582855:
                if (str2.equals("Sony")) {
                    return Intrinsics.f(str, "XQ-CC54") || Intrinsics.f(str, "XQ-DC54");
                }
                return false;
            case 3620012:
                if (!str2.equals("vivo") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case 68955277:
                        return str.equals("I2127");
                    case 80960990:
                        return str.equals("V2109");
                    case 80961012:
                        return str.equals("V2110");
                    case 80961013:
                        return str.equals("V2111");
                    case 80961020:
                        return str.equals("V2118");
                    case 80961043:
                        return str.equals("V2120");
                    case 80961106:
                        return str.equals("V2141");
                    case 80961946:
                        return str.equals("V2204");
                    case 80962070:
                        return str.equals("V2244");
                    case 80962073:
                        return str.equals("V2247");
                    case 80962967:
                        return str.equals("V2322");
                    case 80962972:
                        return str.equals("V2327");
                    case 80963002:
                        return str.equals("V2336");
                    case 80963003:
                        return str.equals("V2337");
                    case 80963029:
                        return str.equals("V2342");
                    case 80963031:
                        return str.equals("V2344");
                    case 80963899:
                        return str.equals("V2414");
                    case 80963901:
                        return str.equals("V2416");
                    case 80963902:
                        return str.equals("V2417");
                    case 80963903:
                        return str.equals("V2418");
                    case 80963904:
                        return str.equals("V2419");
                    case 340386177:
                        return str.equals("vivo 1938");
                    default:
                        return false;
                }
            case 19035940:
                if (!str2.equals("HMD Global") || str == null) {
                    return false;
                }
                int iHashCode3 = str.hashCode();
                return iHashCode3 != 206199300 ? iHashCode3 != 1195585611 ? iHashCode3 == 2097866454 && str.equals("Nokia XR20") : str.equals("Nokia G42 5G") : str.equals("Nokia C32");
            case 68924490:
                if (!str2.equals("HONOR") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -1013812297:
                        return str.equals("JDY-LX1");
                    case -937479590:
                        return str.equals("ELN-W09");
                    case -671451777:
                        return str.equals("TFY-LX1");
                    case -186993309:
                        return str.equals("ALT-NX1");
                    case 990228273:
                        return str.equals("LLY-LX1");
                    case 1314118373:
                        return str.equals("VNE-LX1");
                    case 1579700442:
                        return str.equals("CLK-LX1");
                    case 1599094383:
                        return str.equals("CMA-LX1");
                    case 1723834744:
                        return str.equals("RBN-NX1");
                    case 1759787037:
                        return str.equals("CRT-LX1");
                    case 1933800964:
                        return str.equals("WDY-LX1");
                    case 1991653912:
                        return str.equals("RKY-LX1");
                    case 2039678926:
                        return str.equals("RMO-NX1");
                    default:
                        return false;
                }
            case 343319808:
                if (!str2.equals("OnePlus") || str == null) {
                    return false;
                }
                int iHashCode4 = str.hashCode();
                return iHashCode4 != 1691571142 ? iHashCode4 != 1691571324 ? iHashCode4 == 1691573118 && str.equals("CPH2621") : str.equals("CPH2465") : str.equals("CPH2409");
            case 1864941562:
                if (!str2.equals("samsung") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -407503166:
                        return str.equals("SM-A025G");
                    case -407502299:
                        return str.equals("SM-A032F");
                    case -407502143:
                        return str.equals("SM-A037G");
                    case -407501338:
                        return str.equals("SM-A042F");
                    case -407501245:
                        return str.equals("SM-A045F");
                    case -407500284:
                        return str.equals("SM-A055F");
                    case -407500222:
                        return str.equals("SM-A057F");
                    case -407500221:
                        return str.equals("SM-A057G");
                    case -407499323:
                        return str.equals("SM-A065F");
                    case -407473376:
                        return str.equals("SM-A125F");
                    case -407472353:
                        return str.equals("SM-A137F");
                    case -407471454:
                        return str.equals("SM-A145F");
                    case -407471444:
                        return str.equals("SM-A145P");
                    case -407471442:
                        return str.equals("SM-A145R");
                    case -407470493:
                        return str.equals("SM-A155F");
                    case -407470486:
                        return str.equals("SM-A155M");
                    case -407470466:
                        return str.equals("SM-A156B");
                    case -407470463:
                        return str.equals("SM-A156E");
                    case -407470447:
                        return str.equals("SM-A156U");
                    case -407469532:
                        return str.equals("SM-A165F");
                    case -407469505:
                        return str.equals("SM-A166B");
                    case -407469491:
                        return str.equals("SM-A166P");
                    case -407443585:
                        return str.equals("SM-A225F");
                    case -407442624:
                        return str.equals("SM-A235F");
                    case -407442597:
                        return str.equals("SM-A236B");
                    case -407441663:
                        return str.equals("SM-A245F");
                    case -407440675:
                        return str.equals("SM-A256B");
                    case -407440672:
                        return str.equals("SM-A256E");
                    case -407414754:
                        return str.equals("SM-A315G");
                    case -407413794:
                        return str.equals("SM-A325F");
                    case -407412806:
                        return str.equals("SM-A336B");
                    case -407412803:
                        return str.equals("SM-A336E");
                    case -407384964:
                        return str.equals("SM-A415F");
                    case -407354367:
                        return str.equals("SM-A520F");
                    case -407353224:
                        return str.equals("SM-A536B");
                    case -407353221:
                        return str.equals("SM-A536E");
                    case -401813086:
                        return str.equals("SM-G525F");
                    case -401810176:
                        return str.equals("SM-G556B");
                    case -396388214:
                        return str.equals("SM-M156B");
                    case -396330554:
                        return str.equals("SM-M336B");
                    case 257780528:
                        return str.equals("SM-A600FN");
                    case 258853004:
                        return str.equals("SM-A750FN");
                    case 515442887:
                        return str.equals("SM-J600FN");
                    case 598684554:
                        return str.equals("SM-M346B1");
                    default:
                        return false;
                }
            case 2141820391:
                if (!str2.equals("HUAWEI") || str == null) {
                    return false;
                }
                switch (str.hashCode()) {
                    case -1740294449:
                        return str.equals("NEN-LX1");
                    case -1348392670:
                        return str.equals("SNE-LX1");
                    case -1171077816:
                        return str.equals("STK-L21");
                    case -1171076638:
                        return str.equals("STK-LX1");
                    case -794937820:
                        return str.equals("JLN-LX1");
                    case -727520787:
                        return str.equals("JNY-LX1");
                    case -594534941:
                        return str.equals("JSN-L21");
                    case -15221495:
                        return str.equals("ART-L29");
                    case 326545549:
                        return str.equals("POT-LX1");
                    case 337627802:
                        return str.equals("PPA-LX2");
                    case 743913937:
                        return str.equals("BNE-LX1");
                    case 916218643:
                        return str.equals("MAO-LX9N");
                    case 1002105835:
                        return str.equals("MAR-LX1A");
                    case 1002105836:
                        return str.equals("MAR-LX1B");
                    case 1002105847:
                        return str.equals("MAR-LX1M");
                    case 1030054458:
                        return str.equals("EVE-LX9N");
                    case 1532977492:
                        return str.equals("POT-LX1A");
                    case 1545465319:
                        return str.equals("MGA-LX9N");
                    case 1815197305:
                        return str.equals("CTR-L81");
                    case 1815198297:
                        return str.equals("CTR-LX1");
                    case 2030112919:
                        return str.equals("MRD-LX1");
                    default:
                        return false;
                }
            default:
                return false;
        }
    }

    public vw.c r() {
        CheckB checkB = ((ly.c) this.f132229b).i.f50392b;
        if (checkB != null) {
            return new vw.c(checkB.f50417a, checkB.f50418b, checkB.f50419c, checkB.d);
        }
        return null;
    }

    public Object s(String str, eb8.j jVar, gim.i iVar) throws Throwable {
        gb8.b bVar = (gb8.b) this.f132229b;
        bVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new g23.q(bVar, str, jVar, null, 15), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public aim.e t(String firstName, String lastName, String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        aim.e eVarB = u.b();
        if (kotlin.text.d0.W(firstName)) {
            eVarB.add(hsa.f.f155017a);
        }
        if (kotlin.text.d0.W(lastName)) {
            eVarB.add(hsa.g.f155018a);
        }
        if (email.length() > 0 && !((zzl.c) ((zzl.b) this.f132229b)).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", email)) {
            eVarB.add(hsa.h.f155019a);
        }
        return u.a(eVarB);
    }

    public vw.b u() {
        CheckA checkA = ((ly.c) this.f132229b).i.f50391a;
        if (checkA == null) {
            return null;
        }
        return new vw.b(checkA.f50416b, checkA.f50415a);
    }

    public a(d0 function) {
        this.f132228a = 20;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132229b = function;
    }

    public a(j2i.c function) {
        this.f132228a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f132229b = function;
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f132228a = i;
        this.f132229b = obj2;
    }

    public a(fkd.f tile) {
        this.f132228a = 5;
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f132229b = tile;
    }

    public a(d mapper) {
        this.f132228a = 0;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f132229b = mapper;
    }

    public a(p delegate) {
        this.f132228a = 3;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f132229b = delegate;
    }

    public a(i5d.c repository) {
        this.f132228a = 25;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f132229b = repository;
    }

    public a(i.a writableUiKitBugPlugins) {
        this.f132228a = 23;
        Intrinsics.checkNotNullParameter(writableUiKitBugPlugins, "writableUiKitBugPlugins");
        this.f132229b = m0.f169260a;
    }

    public a(oid.e shopsCategoriesRepository) {
        this.f132228a = 22;
        Intrinsics.checkNotNullParameter(shopsCategoriesRepository, "shopsCategoriesRepository");
        this.f132229b = shopsCategoriesRepository;
    }

    public a(zzl.b regexMatcher) {
        this.f132228a = 19;
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f132229b = regexMatcher;
    }

    public a(lld.p slotChecklistControllerProvider, mp.p slotChecklistExternalEventHandler) {
        this.f132228a = 10;
        Intrinsics.checkNotNullParameter(slotChecklistControllerProvider, "slotChecklistControllerProvider");
        Intrinsics.checkNotNullParameter(slotChecklistExternalEventHandler, "slotChecklistExternalEventHandler");
        this.f132229b = slotChecklistExternalEventHandler;
    }

    public a(ooc.b bioWidgetProvider) {
        this.f132228a = 11;
        Intrinsics.checkNotNullParameter(bioWidgetProvider, "bioWidgetProvider");
        this.f132229b = bioWidgetProvider;
    }

    public a(ynj.e commonUiBuilder) {
        this.f132228a = 6;
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        this.f132229b = commonUiBuilder;
    }

    public a(k8j.f mapper) {
        this.f132228a = 26;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f132229b = mapper;
    }

    public a(y21.c optOutRepository) {
        this.f132228a = 15;
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f132229b = optOutRepository;
    }

    public a(ly.c inputData) {
        this.f132228a = 7;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f132229b = inputData;
    }

    public a(gb8.b juniorGraduationRepository) {
        this.f132228a = 21;
        Intrinsics.checkNotNullParameter(juniorGraduationRepository, "juniorGraduationRepository");
        this.f132229b = juniorGraduationRepository;
    }

    public a(htk.l itemMapper, ytk.c percentageClauseMapper) {
        this.f132228a = 13;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f132229b = percentageClauseMapper;
    }

    public a(k61.a transferInteractor, q6i.a balanceTypeMapper) {
        this.f132228a = 9;
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(balanceTypeMapper, "balanceTypeMapper");
        this.f132229b = transferInteractor;
    }

    public a(ou5.b juniorPayeesTransferSettingsInteractor) {
        this.f132228a = 17;
        Intrinsics.checkNotNullParameter(juniorPayeesTransferSettingsInteractor, "juniorPayeesTransferSettingsInteractor");
        this.f132229b = juniorPayeesTransferSettingsInteractor;
    }

    public a(CfdOrderReviewScreen cfdOrderReviewScreen) {
        this.f132228a = 14;
        this.f132229b = cfdOrderReviewScreen.f82272b0;
    }

    public a(hsh.d repositoryProvider) {
        this.f132228a = 12;
        Intrinsics.checkNotNullParameter(repositoryProvider, "repositoryProvider");
        this.f132229b = repositoryProvider;
    }

    public a() {
        this.f132228a = 4;
        this.f132229b = new ArrayDeque();
    }

    public a(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f132228a = 2;
        this.f132229b = etfDetailsOverviewController.f103935e0;
    }
}
