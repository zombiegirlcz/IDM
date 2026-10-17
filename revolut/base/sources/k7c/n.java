package k7c;

import android.service.notification.StatusBarNotification;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$State;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$State;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f181983b;

    public /* synthetic */ n(String str, int i) {
        this.f181982a = i;
        this.f181983b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String str;
        Object next2;
        Object next3;
        Object objPrevious;
        Object next4;
        Object next5;
        Object next6;
        switch (this.f181982a) {
            case 0:
                PaymentMethod it8 = (PaymentMethod) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.getF84393a(), this.f181983b));
            case 1:
                return Boolean.valueOf(Intrinsics.f(((ShippingContact) obj2).f84740a, this.f181983b));
            case 2:
                UserDevice it9 = (UserDevice) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f71914a, this.f181983b));
            case 3:
                kae.e update = (kae.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return kae.e.a(update, null, this.f181983b, 5);
            case 4:
                kae.e update2 = (kae.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String str2 = this.f181983b;
                return kae.e.a(update2, str2, str2, 4);
            case 5:
                kbi.f update3 = (kbi.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return kbi.f.a(update3, null, this.f181983b, null, 13);
            case 6:
                kbi.f update4 = (kbi.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return kbi.f.a(update4, kbi.k.f182605a, this.f181983b, null, 12);
            case 7:
                List allJuniorConsents = (List) obj2;
                Intrinsics.checkNotNullParameter(allJuniorConsents, "allJuniorConsents");
                Iterator it10 = allJuniorConsents.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(((xc8.g) next).f304107a, this.f181983b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (xc8.g) next;
            case 8:
                Map instrumentActionsByRef = (Map) obj2;
                Intrinsics.checkNotNullParameter(instrumentActionsByRef, "instrumentActionsByRef");
                return (hdh.e) zhm.r0.h(this.f181983b, instrumentActionsByRef);
            case 9:
                ProductLifecycleFlowContract$State update5 = (ProductLifecycleFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ProductLifecycleFlowContract$State.a(update5, this.f181983b, null, 2);
            case 10:
                kk9.h updateState = (kk9.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return kk9.h.a(updateState, this.f181983b, null, null, 6);
            case 11:
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                Iterator it11 = walletProfiles.iterator();
                while (true) {
                    boolean zHasNext = it11.hasNext();
                    str = this.f181983b;
                    if (zHasNext) {
                        next2 = it11.next();
                        if (Intrinsics.f(((psg.a) next2).f239485b, str)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 != null) {
                    return (psg.a) next2;
                }
                throw new IllegalArgumentException(j6.a.q("Could not find wallet profile for ", str).toString());
            case 12:
                km1.d update6 = (km1.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return km1.d.a(update6, this.f181983b, null, 5);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                kn3.e eVar = (kn3.e) pair.f186386b;
                return new fn3.a(eVar.f185980a, eVar.f185981b, list, eVar.f185982c, this.f181983b);
            case 14:
                ko8.d update7 = (ko8.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                update7.getClass();
                String qrData = this.f181983b;
                Intrinsics.checkNotNullParameter(qrData, "qrData");
                return new ko8.d(qrData);
            case 15:
                PersonsListScreenContract$DomainState update8 = (PersonsListScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return PersonsListScreenContract$DomainState.a(update8, zhm.r0.l(this.f181983b, update8.f94663b));
            case 16:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                boolean zW = kotlin.text.d0.W(it12);
                String str3 = this.f181983b;
                return zW ? it12.length() < str3.length() ? str3 : it12 : a0.d.r(str3, it12);
            case 17:
                kp7.j updateState2 = (kp7.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return kp7.j.a(updateState2, null, this.f181983b, null, null, null, ISO781611.SMT_TAG);
            case 18:
                BiometricVerificationActiveLivenessStepFlowContract$State update9 = (BiometricVerificationActiveLivenessStepFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                List mediaKeys = zhm.d0.U(zhm.d0.F0(this.f181983b, update9.f50498a));
                Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
                return new BiometricVerificationActiveLivenessStepFlowContract$State(mediaKeys);
            case 19:
                StatusBarNotification it13 = (StatusBarNotification) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.getTag(), this.f181983b));
            case 20:
                kwa.a update10 = (kwa.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                update10.getClass();
                String enteredCode = this.f181983b;
                Intrinsics.checkNotNullParameter(enteredCode, "enteredCode");
                return new kwa.a(enteredCode);
            case 21:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new Pair(this.f181983b, currency);
            case 22:
                kye.m update11 = (kye.m) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return kye.m.a(update11, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, this.f181983b, null, null, null, null, null, -1, 62);
            case 23:
                List incomeSources = (List) obj2;
                Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
                Iterator it14 = incomeSources.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next3 = it14.next();
                        if (Intrinsics.f(((gzc.n) next3).f148015b, this.f181983b)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                gzc.n nVar = (gzc.n) next3;
                if (nVar != null) {
                    return nVar.e;
                }
                return null;
            case 24:
                List incomeSources2 = (List) obj2;
                Intrinsics.checkNotNullParameter(incomeSources2, "incomeSources");
                ListIterator listIterator = incomeSources2.listIterator(incomeSources2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.f(((gzc.n) objPrevious).f148015b, this.f181983b)) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                return (gzc.n) objPrevious;
            case 25:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                Iterator it15 = portfolio.e.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next4 = it15.next();
                        kel.g gVar = (kel.g) next4;
                        if (!(gVar instanceof kel.n) || !Intrinsics.f(((kel.n) gVar).f183173a.f183145a, this.f181983b)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                kel.n nVar2 = next4 instanceof kel.n ? (kel.n) next4 : null;
                return l2b.f.b(nVar2 != null ? new CfdTradingFeatureConfig.PositionDetails.Destination(nVar2) : null);
            case 26:
                List assetsInfo = (List) obj2;
                Intrinsics.checkNotNullParameter(assetsInfo, "assetsInfo");
                Iterator it16 = assetsInfo.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next5 = it16.next();
                        if (Intrinsics.f(((u3d.a) next5).f276920a, this.f181983b)) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                u3d.a aVar = (u3d.a) next5;
                Integer num = aVar != null ? aVar.e : null;
                od0.i.Companion.getClass();
                return od0.h.a(num);
            case 27:
                m2k.j bankTransferExchangeRateDto = (m2k.j) obj2;
                Intrinsics.checkNotNullParameter(bankTransferExchangeRateDto, "bankTransferExchangeRateDto");
                return n2k.b.b(bankTransferExchangeRateDto, this.f181983b);
            case 28:
                m2k.j bankTransferExchangeRateDto2 = (m2k.j) obj2;
                Intrinsics.checkNotNullParameter(bankTransferExchangeRateDto2, "bankTransferExchangeRateDto");
                return n2k.b.b(bankTransferExchangeRateDto2, this.f181983b);
            default:
                List loans = (List) obj2;
                Intrinsics.checkNotNullParameter(loans, "loans");
                Iterator it17 = loans.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        next6 = it17.next();
                        if (Intrinsics.f(((Loan) next6).getF70108a(), this.f181983b)) {
                        }
                    } else {
                        next6 = null;
                    }
                }
                return (Loan) next6;
        }
    }

    public /* synthetic */ n(l2b.f fVar, String str) {
        this.f181982a = 25;
        this.f181983b = str;
    }
}
