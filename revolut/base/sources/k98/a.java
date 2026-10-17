package k98;

import a07.p;
import ael.l0;
import android.os.PowerManager;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.locked.balance.impl.ui.excluded_locked_balances.ExcludedLockedBalancesScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrderTransaction;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import com.revolut.feature.junior.card_request.impl.ui.flow.request_review.CardRequestReviewFlow;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreen;
import com.revolut.feature.payments.api.PaymentsToggles$SplitBillsWithQRCode;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlow;
import com.revolut.revolut.feature_fourthline_impl.R;
import e1a.f;
import et6.j;
import fnc.s;
import gld.f0;
import h98.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import jyk.d0;
import k9e.i;
import ke7.v;
import ke7.y;
import kjk.x;
import kkf.b4;
import kkf.c6;
import kkf.i1;
import kkf.m5;
import kkf.u8;
import kkf.w1;
import kkf.z7;
import kkf.z8;
import kkk.u;
import klf.a3;
import klf.b1;
import klf.b3;
import klf.c2;
import klf.f2;
import klf.g1;
import klf.h0;
import klf.h1;
import klf.l1;
import klf.n2;
import klf.o;
import klf.o1;
import klf.p1;
import klf.s0;
import kmm.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import n14.k;
import no.m;
import om4.r1;
import skm.p0;
import t38.e;
import vkm.d;
import vkm.q;
import w4l.h;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182293b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f182292a = i;
        this.f182293b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v144, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Flow flowE;
        int i = this.f182292a;
        int i2 = 9;
        int i3 = 14;
        int i5 = 13;
        int i6 = 12;
        int i21 = 22;
        int i22 = 2;
        int i32 = 4;
        int i33 = 10;
        int i43 = 28;
        int i59 = 25;
        int i66 = 24;
        int i74 = 3;
        Continuation continuation = null;
        Object obj2 = this.f182293b;
        switch (i) {
            case 0:
                return (b) ((g) ((CardRequestReviewFlow) obj2).P.getValue()).d.get();
            case 1:
                KProperty[] kPropertyArr = CountryOfResidenceRevolutXDisclaimerScreen.S;
                qji.c cVarZ2 = ((CountryOfResidenceRevolutXDisclaimerScreen) obj2).z2();
                m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                if (mVar != null) {
                    return mVar.getM();
                }
                return null;
            case 2:
                KProperty[] kPropertyArr2 = AcceptConditionsScreen.f89166a0;
                return (i) ((i9e.g) ((AcceptConditionsScreen) obj2).X.getValue()).f159677c.get();
            case 3:
                return (kdj.a) ((fdj.b) ((PriceTargetsDetailsFlow) obj2).P.getValue()).d.get();
            case 4:
                Object systemService = ((y) obj2).f183047a.getContext().getSystemService("power");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager powerManager = (PowerManager) systemService;
                if (powerManager.isWakeLockLevelSupported(32)) {
                    return powerManager.newWakeLock(32, "Revolut::CallProximityWakeLock");
                }
                return null;
            case 5:
                int i92 = ExcludedLockedBalancesScreen.V;
                return (kh5.b) ((hh5.c) ((ExcludedLockedBalancesScreen) obj2).T.getValue()).f152257a.get();
            case 6:
                List list = (List) ((a5h.g) obj2).f1407c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    String lowerCase = ((String) it8.next()).toLowerCase(Locale.ROOT);
                    arrayList.add(new Pair(lowerCase, t61.a.p(lowerCase, "toLowerCase(...)", ".", lowerCase)));
                }
                return arrayList;
            case 7:
                i1 i1Var = (i1) obj2;
                r70.c.b(i1Var.f184741r, 3);
                i1Var.L2(new mii.i("COPIED_FLIGHT_BOOKING_CONFIRMATION_DIALOG_ID", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 8:
                ((w1) obj2).f184993b.getClass();
                return vlf.b.g(3, "GENERAL");
            case 9:
                ((c6) obj2).f184626p.getClass();
                return vlf.b.g(3, "ROBO");
            case 10:
                z8 z8Var = (z8) obj2;
                return q.Q(z8Var.f185061c.h(new x(i59)), new u8(continuation, z8Var, 1));
            case 11:
                klf.c cVar = (klf.c) obj2;
                return edl.a.r(q.q(new e(q.Q(cVar.d.d(), new m5(continuation, cVar, i33)), i66, cVar.f185455c.a(), new hwi.b(i74, i43, continuation))), cVar.f185453a);
            case 12:
                klf.m mVar2 = (klf.m) obj2;
                Flow flowQ = q.q(q.Q(q.s(mVar2.f185527b.d(), new u(i32), q.f290100b), new m5(continuation, mVar2, i6)));
                Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
                return edl.a.r(q.C(flowQ, oji.e.f225788b), mVar2.f185526a);
            case 13:
                o oVar = (o) obj2;
                return edl.a.r(q.Q(oVar.f185542b.d(), new m5(continuation, oVar, i5)), oVar.f185541a);
            case 14:
                s0 s0Var = (s0) obj2;
                h0 h0Var = s0Var.f185570b;
                return edl.a.r(q.q(q.Q(q.q(new e(h0Var.d(), i66, h0Var.c(), new l0(3, s0Var, s0.class, "toLookup", "toLookup(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/CreditRepaymentRevPointsDataSource$Lookup;", 4, 24))), new m5(continuation, s0Var, 15))), s0Var.f185569a);
            case 15:
                b1 b1Var = (b1) obj2;
                return edl.a.r(rd0.e.e(q.Q(new e(b1Var.f185448c.j(), i66, b1Var.f185447b.h(new u(i2)), new j(i74, 1, continuation)), new m5(continuation, b1Var, 19)), zhm.h0.f322473a, new i23.c(i74, i59, continuation)), b1Var.f185446a);
            case 16:
                g1 g1Var = (g1) obj2;
                return edl.a.r(q.q(new vkm.y(new g2d.c(i22, i43, continuation), mo3.a.g(rd0.e.n(nim.a.v(u0.m(k.p(q.Q(g1Var.f185485c.h(new u(i6)), new m5(continuation, g1Var, 21)), new u(i5)), k.p(nim.a.v(((r1) g1Var.d).c(), new v(g1Var, 18)), new u(i3))), new u(g1Var, 11)), zhm.h0.f322473a), null, new b4(i2), 1))), g1Var.f185483a);
            case 17:
                h1 h1Var = (h1) obj2;
                return edl.a.r(rd0.e.n(q.Q(h1Var.f185503b.d(), new m5(continuation, h1Var, i21)), zhm.h0.f322473a), h1Var.f185502a);
            case 18:
                o1 o1Var = (o1) obj2;
                return edl.a.r(q.Q(o1Var.f185547b.d(), new m5(continuation, o1Var, i66)), o1Var.f185546a);
            case 19:
                p1 p1Var = (p1) obj2;
                return edl.a.r(q.Q(p1Var.f185554b.d(), new m5(continuation, p1Var, i59)), p1Var.f185553a);
            case 20:
                klf.r1 r1Var = (klf.r1) obj2;
                return edl.a.r(q.Q(r1Var.f185567b.d(), new m5(continuation, r1Var, 26)), r1Var.f185566a);
            case 21:
                c2 c2Var = (c2) obj2;
                return edl.a.r(q.q(q.Q(c2Var.f185460b.d(), new m5(continuation, c2Var, 27))), c2Var.f185459a);
            case 22:
                f2 f2Var = (f2) obj2;
                return edl.a.r(q.q(new a6e.b(rd0.e.n(zi0.c.w(((f0) f2Var.f185478a).f144638l.h()), zhm.h0.f322473a), i66)), f2Var.f185479b);
            case 23:
                n2 n2Var = (n2) obj2;
                u71.a aVar = n2Var.f185539c;
                k71.i iVar = n2Var.f185538b;
                d dVarB = rd0.e.b(aVar.observeSplitBillForTransaction(iVar));
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                Flow flowQ2 = q.q(new a6e.b(rd0.e.n(dVarB, h0Var2), i59));
                if (n2Var.f.a(PaymentsToggles$SplitBillsWithQRCode.f79166c)) {
                    flowE = new go.g(null, 2);
                } else {
                    s sVar = n2Var.d;
                    String transactionId = iVar.a();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    f fVar = (f) sVar.f136657b;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    flowE = rd0.e.e(q.Q(new p(nim.a.v(nim.a.v(fVar.e.b(Unit.f186387a, h.f294642c), new d7a.p(transactionId, 29)), new d0(sVar, 23)), i21), new m5(continuation, n2Var, i43)), h0Var2, new l1(i74, i74, continuation));
                }
                return edl.a.r(q.q(new z7(yh5.b.d(flowQ2, flowE), n2Var, i33)), n2Var.f185537a);
            case 24:
                b3 b3Var = (b3) obj2;
                return edl.a.r(rd0.e.e(q.Q(b3Var.f185451b.c(), new a3(continuation, b3Var, 0)), zhm.h0.f322473a, new l1(i74, i32, continuation)), b3Var.f185450a);
            case 25:
                kmi.g gVar = (kmi.g) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "NfcDelegate", m72.b.r("Clearing tag callback in ", o0.f186429a.b(gVar.f185894a.getClass())), null, null, 16);
                gVar.e = null;
                return Unit.f186387a;
            case 26:
                vlm.h.f((n) obj2);
                return Unit.f186387a;
            case 27:
                ylm.q qVar = ((kmm.h) obj2).i;
                Intrinsics.h(qVar);
                qVar.cancel();
                return Unit.f186387a;
            case 28:
                CryptoWithdrawOrderTransaction cryptoWithdrawOrderTransaction = ((CryptoWithdrawOrder) obj2).f71096a;
                long j2 = cryptoWithdrawOrderTransaction.e;
                xi0.a aVar2 = xi0.b.Companion;
                String str = cryptoWithdrawOrderTransaction.d;
                aVar2.getClass();
                return new dj0.d(j2, xi0.a.a(str));
            default:
                KProperty[] kPropertyArr3 = AddressPickerScreen.f75543d0;
                return (ko7.f) ((ql7.f) ((AddressPickerScreen) obj2).Y.getValue()).f247293h.get();
        }
    }
}
