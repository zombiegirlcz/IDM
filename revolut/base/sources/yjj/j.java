package yjj;

import cfl.p;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import dej.t1;
import ima.a;
import ip0.fm;
import ip0.m20;
import ip0.xc;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.z;
import tof.a3;
import tof.p0;
import tof.y6;
import yna.a;
import yna.i0;
import yna.w;
import yna.x;
import yna.y;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314536a;

    public /* synthetic */ j(int i) {
        this.f314536a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f314536a) {
            case 0:
                EsimDescriptorValue it8 = (EsimDescriptorValue) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 1:
                gkl.m it9 = (gkl.m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return yjl.h.d(it9).getValue();
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "COUNTER_VERIFICATION_CODE_LOADING_ID", null, 0, 0, 0, 0, 122);
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                return new yk6.k(yk6.h.f314585a, u.c(modelB));
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 4:
                ybl.g it10 = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.a(v.k(p.PRIVATE_MARKETS, p.PRIVATE_BANK)));
            case 5:
                ybl.g it11 = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.c(p.MUTUAL_FUNDS, TradingAccountType.Gia.f105270a));
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                mx0.d dVar = mx0.d.SHIMMER;
                return v.k(ykh.a.b(dVar), ykh.a.c(dVar));
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 8:
                ym2.d update = (ym2.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ym2.d.a(update, null, null, 7);
            case 9:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((Boolean) pair.f186385a).booleanValue() || ((Boolean) pair.f186386b).booleanValue());
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new fm("private_bank_banner_loading"));
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ymk.p.DEFAULT;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return mmk.e.a();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 14:
                qla.a profileType = (qla.a) obj2;
                Intrinsics.checkNotNullParameter(profileType, "profileType");
                int i = i0.f315348b[profileType.ordinal()];
                boolean z = true;
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                qla.a profileType2 = (qla.a) obj2;
                Intrinsics.checkNotNullParameter(profileType2, "profileType");
                int i2 = i0.f315348b[profileType2.ordinal()];
                boolean z3 = true;
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 16:
                List plansToUpgrade = (List) obj2;
                Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
                return plansToUpgrade.isEmpty() ? a.b.f162336a : a.C0929a.f162335a;
            case 17:
                yna.a updateState = (yna.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List list = updateState.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!(((a.AbstractC1757a) obj3) instanceof a.AbstractC1757a.p)) {
                        arrayList.add(obj3);
                    }
                }
                return yna.a.a(updateState, null, null, null, arrayList, null, null, null, false, false, null, false, null, null, null, null, 65519);
            case 18:
                Integer count = (Integer) obj2;
                Intrinsics.checkNotNullParameter(count, "count");
                return count.intValue() <= 0 ? x.f315383a : new y(count.intValue());
            case 19:
                w it12 = (w) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it12);
            case 20:
                pha.a state = (pha.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                od0.h hVar = od0.i.Companion;
                do3.u uVar = state.f236250a;
                hVar.getClass();
                return od0.h.a(uVar);
            case 21:
                z status = (z) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof m1c.y) {
                    return Double.valueOf(((m1c.y) status).f201475a.f201472c.J());
                }
                if (status instanceof z.a) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m20 m20Var = new m20("1");
                yp0.b.l(m20Var, 0, 0, 0, 0, null, false, 63);
                return new wnc.w(null, null, null, u.c(new xc("0", u.c(m20Var), 0, null, null, 0, 0, 0, 1020)), wnc.u.e);
            case 24:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List list2 = (List) kVar.f288454a;
                q qVar = (q) kVar.f288455b;
                whf.a aVar = (whf.a) kVar.f288456c;
                return new xnf.a(!list2.isEmpty() ? new whf.p(list2, qVar, aVar) : null, (snf.y) kVar.d, (znf.a) ((od0.i) kVar.e).f224257a, 2);
            case 25:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                return Boolean.valueOf(transaction.e != y6.EXCHANGE || transaction.z == p0.SELL);
            case 26:
                t1 subscription = (t1) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                return Boolean.valueOf(gj7.b.B(subscription));
            case 27:
                List<xoa.a> notificationSettingsDtoList = (List) obj2;
                Intrinsics.checkNotNullParameter(notificationSettingsDtoList, "notificationSettingsDtoList");
                Intrinsics.checkNotNullParameter(notificationSettingsDtoList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (xoa.a aVar2 : notificationSettingsDtoList) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    soa.c cVarP = ifk.b.p(aVar2.getId());
                    soa.b bVar = cVarP != null ? new soa.b(cVarP, aVar2.getEmail(), aVar2.getPush(), aVar2.getAiCalls(), aVar2.getInApp(), aVar2.getAiProactiveInsights()) : null;
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                return arrayList2;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                tla.c.Companion.getClass();
                return tla.c.f272042c;
            default:
                return ((Boolean) obj2).booleanValue() ? qla.a.INDIA : qla.a.FULL;
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f314536a = i;
    }
}
