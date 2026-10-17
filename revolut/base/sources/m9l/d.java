package m9l;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import efm.i;
import fa1.h;
import fa1.j;
import fa1.k;
import fa1.l;
import fa1.o;
import fa1.q;
import ip0.bo0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import ma.m;
import ma.n;
import qfm.t0;
import rp0.b1;
import rp0.e1;
import tof.va;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203832a;

    public /* synthetic */ d(int i) {
        this.f203832a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 20;
        boolean z = false;
        z = false;
        int i2 = 4;
        j jVar = null;
        switch (this.f203832a) {
            case 0:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List list = rates;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((g) it8.next()).f203839a);
                }
                return arrayList;
            case 1:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new n((List) loadingItems.invoke(), new m(), null);
            case 2:
                ma.g update = (ma.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ma.g.a(update, null, f0.f322471a, 1);
            case 3:
                qa1.e it9 = (qa1.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return fa1.g.SUFFICIENT;
            case 4:
                qa1.e eVar = (qa1.e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                int i3 = eVar.f243933a;
                qa1.f fVar = eVar.f243934b;
                return (fVar == qa1.f.BATTERY_FULL || fVar == qa1.f.PLUGGED) ? fa1.g.SUFFICIENT : i3 > 20 ? fa1.g.SUFFICIENT : i3 > 10 ? fa1.g.LOW : fa1.g.EXTREMELY_LOW;
            case 5:
                fa1.g chargeLevel = (fa1.g) obj2;
                Intrinsics.checkNotNullParameter(chargeLevel, "chargeLevel");
                int i5 = ma1.b.f203865a[chargeLevel.ordinal()];
                if (i5 == 1) {
                    z = true;
                } else if (i5 != 2 && i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 6:
                ea1.b.a(v1.c.u("Error logging: ", (Throwable) obj2), k.ERROR);
                return Unit.f186387a;
            case 7:
                h it10 = (h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Unit.f186387a;
            case 8:
                ea1.b.a("Connection FAILED because of timeout", k.ERROR);
                return Unit.f186387a;
            case 9:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Throwable th10 = (Throwable) obj3;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                Integer num = (Integer) obj4;
                if (num.intValue() >= 5) {
                    ea1.b.a("Unable to connect after " + num + " attempts", k.ERROR);
                    return i.c(th10);
                }
                ea1.b.a("Retry connection attempt = " + num, k.INFO);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i6 = i.f125385a;
                return i.r(5000L, hhm.f.f152430b);
            case 10:
                q it11 = (q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(!Intrinsics.f(it11, q.d.f133211a));
            case 11:
                q connectionResult = (q) obj2;
                Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
                return Intrinsics.f(connectionResult, q.e.f133212a) ? pfm.m.f235744a : efm.b.n(new RuntimeException("Connection is failed"));
            case 12:
                i errors = (i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                i iVarK = i.k(1, 5);
                m78.e eVar2 = new m78.e(new j1(i2), i);
                errors.getClass();
                t0 t0VarS = i.s(errors, iVarK, eVar2);
                m78.e eVar3 = new m78.e(new d(9), 21);
                int i21 = i.f125385a;
                return t0VarS.f(eVar3, i21, i21);
            case 13:
                ea1.b.a(v1.c.u("Terminal could not be moved to PERSONALIZED state: ", (Throwable) obj2), k.ERROR);
                return Unit.f186387a;
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return (l) pair2.f186385a;
            case 15:
                ea1.b.a(v1.c.u("Payment error = ", (Throwable) obj2), k.ERROR);
                return Unit.f186387a;
            case 16:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new l(new o.e(exception), jVar, fa1.n.COMPLETED, 26);
            case 17:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                aim.e eVarB = u.b();
                int i22 = 0;
                int i32 = 0;
                s7 s7Var = new s7("LIST_ID_PAYID", 0, i22, i32, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                s7 s7Var2 = new s7("LIST_ID_NAME", i22, i32, 0, 0 == true ? 1 : 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return u.a(eVarB);
            case 18:
                return ma2.e.a((ma2.e) obj2, new Data(null, null, true, 3, null));
            case 19:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 20:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return null;
            case 21:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                yp0.b.k(items, R$attr.uikit_dp48, 0, 0, 0, 30);
                return items;
            case 22:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List listC = u.c(new s7("ID_SUSPICIOUS_TRANSACTION_LOADING", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 23:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new mc6.i(null, f0.f322471a);
            case 24:
                mc9.d update2 = (mc9.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ESignatureProcess eSignatureProcess = update2.f204311a;
                update2.getClass();
                return new mc9.d(eSignatureProcess, true);
            case 25:
                b9e.c content = (b9e.c) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList arrayListA = content.f13735b.a();
                ArrayList arrayList2 = new ArrayList(w.t(arrayListA, 10));
                Iterator it16 = arrayListA.iterator();
                while (it16.hasNext()) {
                    arrayList2.add(((RecurringPaymentWithExtra) it16.next()).getF81653a());
                }
                return new vf0.h(d0.P0(arrayList2, new mce.c()), content.f13734a, content.f13736c, content.e);
            case 26:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                fo3.c cVar = (fo3.c) pair3.f186385a;
                List list2 = (List) pair3.f186386b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list2) {
                    io3.d dVar = (io3.d) obj5;
                    if (dVar.e == io3.l.CURRENT) {
                        xi0.a aVar = xi0.b.Companion;
                        String str = dVar.f163147c;
                        aVar.getClass();
                        if (xi0.a.a(str).equals(cVar.d)) {
                            arrayList3.add(obj5);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it17 = arrayList3.iterator();
                while (it17.hasNext()) {
                    arrayList4.add(((io3.d) it17.next()).f163145a);
                }
                return new va(d0.i1(arrayList4));
            case 27:
                e1 event = (e1) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                return Boolean.valueOf(event instanceof b1);
            case 28:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i33 = 0; i33 < 4; i33++) {
                    bo0 bo0Var = new bo0(a0.d.n("FAVORITE_LOADING_ITEM_LIST_ID_", i33));
                    int i43 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i43, i43, i43, i43, null, false, 48);
                    arrayListP.add(bo0Var);
                }
                return arrayListP;
            default:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return null;
        }
    }

    public /* synthetic */ d(cli.n nVar, int i) {
        this.f203832a = i;
    }
}
