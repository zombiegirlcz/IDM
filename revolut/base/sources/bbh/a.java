package bbh;

import aim.e;
import aw0.h;
import aw0.m6;
import aw0.n6;
import bbk.k;
import bbk.s;
import bcj.d;
import bdh.f;
import bec.e0;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.bb0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import od0.i;
import sak.g;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14309a;

    public /* synthetic */ a(int i) {
        this.f14309a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g gVar;
        switch (this.f14309a) {
            case 0:
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (TradingAccount) it8.f224257a;
            case 1:
                bbk.i it9 = (bbk.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                sak.c cVar = (sak.c) it9.f14326b.getContent();
                if (cVar == null || (gVar = cVar.f261440a) == null) {
                    return null;
                }
                return gVar.f261449h;
            case 2:
                bbk.i it10 = (bbk.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f14326b;
            case 3:
                bbk.i it11 = (bbk.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f14326b;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ArrayList arrayListC = iii.c.c(1);
                n6.Companion.getClass();
                return new s(arrayListC, k.f14331a, new h(false, m6.a(), m6.a(), null, null, null, 121));
            case 5:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zi0.c.O(it12);
            case 6:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data.getContent() != null);
            case 7:
                q it13 = (q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                i.Companion.getClass();
                return od0.h.a(it13);
            case 8:
                hce.c it14 = (hce.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(it14, false, null, 3);
            case 9:
                d it15 = (d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                xi0.b bVar = it15.f14453a;
                wk5.a aVar = it15.f14454b;
                if (bVar == null || aVar == null) {
                    return null;
                }
                return new Pair(bVar, aVar);
            case 10:
                d it16 = (d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f14455c;
            case 11:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                uc3.a aVar2 = (uc3.a) d0.d0(it17);
                String str = aVar2 != null ? aVar2.f278973a : null;
                return str == null ? "" : str;
            case 12:
                List cashbackBoxes = (List) obj2;
                Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                uc3.a aVar3 = (uc3.a) d0.d0(cashbackBoxes);
                dj0.d dVar = null;
                io3.d dVar2 = aVar3 != null ? aVar3.f278974b : null;
                if (dVar2 != null) {
                    long j2 = dVar2.i;
                    xi0.a aVar4 = xi0.b.Companion;
                    String str2 = dVar2.f163147c;
                    aVar4.getClass();
                    dVar = new dj0.d(j2, xi0.a.a(str2));
                }
                i.Companion.getClass();
                return od0.h.a(dVar);
            case 13:
                x it18 = (x) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                i.Companion.getClass();
                return od0.h.a(it18);
            case 14:
                CellDetailsChevronDelegate.Model it19 = (CellDetailsChevronDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.e instanceof f);
            case 15:
                InAppCallStateWithData updateCallState = (InAppCallStateWithData) obj2;
                Intrinsics.checkNotNullParameter(updateCallState, "$this$updateCallState");
                return InAppCallStateWithData.a(updateCallState, be7.a.CONNECTED, null, null, null, null, null, null, null, 510);
            case 16:
                InAppCallStateWithData updateCallState2 = (InAppCallStateWithData) obj2;
                Intrinsics.checkNotNullParameter(updateCallState2, "$this$updateCallState");
                return InAppCallStateWithData.a(updateCallState2, be7.a.RECONNECTING, null, null, null, null, null, null, null, 510);
            case 17:
                InAppCallStateWithData updateCallState3 = (InAppCallStateWithData) obj2;
                Intrinsics.checkNotNullParameter(updateCallState3, "$this$updateCallState");
                return InAppCallStateWithData.a(updateCallState3, be7.a.CONNECTING, null, null, null, null, null, null, null, 510);
            case 18:
                beb.h update = (beb.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return beb.h.a(update, null, new Data(null, null, false, 7, null), null, null, false, 29);
            case 19:
                return beb.h.a((beb.h) obj2, new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null, null, false, 28);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                e eVarB = u.b();
                s7 s7Var = new s7("CONFIRM_RESERVATION_RESTAURANT", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                List listK = v.k(new pb0("CONFIRM_RESERVATION_DATE"), new pb0("CONFIRM_RESERVATION_PARTY_SIZE"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                v7.C("CONFIRM_RESERVATION_CUSTOMER_DETAILS_HEADER", 0, 0, 30, eVarB);
                nb0 nb0Var = pb0.Companion;
                List listK2 = v.k(nb0.a(nb0Var, "CONFIRM_RESERVATION_CUSTOMER_NAME", true, 4), nb0.a(nb0Var, "CONFIRM_RESERVATION_CUSTOMER_PHONE", true, 4), nb0.a(nb0Var, "CONFIRM_RESERVATION_CUSTOMER_EMAIL", true, 4), nb0.a(nb0Var, "CONFIRM_RESERVATION_CUSTOMER_NOTE", true, 4));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                return u.a(eVarB);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.h(v.k(new pb0("PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID"), new s7("CONFIRM_RESERVATION_PAYMENT_AMOUNT", 0, 0, 0, 0, false, null, 126)), new gu("CONFIRM_RESERVATION_PAYMENT_DETAILS_HEADER", 0, 0, 30), null, 0, 126);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return e0.e();
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return e0.e();
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return e0.e();
            case 25:
                bec.i it20 = (bec.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f14784a;
            case 26:
                bec.h it21 = (bec.h) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(!it21.f14779a.isEmpty());
            case 27:
                return new go.g(f0.f322471a, 2);
            case 28:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    bb0 bb0Var = new bb0(a0.d.n("ROOM_RATES_LOADING_ITEM_ID_", i));
                    yp0.b.l(bb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(bb0Var);
                }
                return arrayListP;
            default:
                List nominees = (List) obj2;
                Intrinsics.checkNotNullParameter(nominees, "nominees");
                List list = nominees;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it22 = list.iterator();
                while (it22.hasNext()) {
                    arrayList.add(eek.a.b((fek.b) it22.next()));
                }
                return arrayList;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f14309a = i;
    }
}
