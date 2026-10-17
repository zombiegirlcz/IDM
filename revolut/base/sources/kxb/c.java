package kxb;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import hxb.g;
import hxb.j;
import hxb.k;
import ip0.u40;
import ip0.xc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import kxk.o;
import kye.m;
import m1c.f0;
import od0.i;
import q06.h;
import yhm.r;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190549a;

    public /* synthetic */ c(int i) {
        this.f190549a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f190549a) {
            case 0:
                k benefitsDto = (k) obj2;
                Intrinsics.checkNotNullParameter(benefitsDto, "benefitsDto");
                List<j> yearlySavings = benefitsDto.getYearlySavings();
                ArrayList arrayList = new ArrayList(w.t(yearlySavings, 10));
                for (j jVar : yearlySavings) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    arrayList.add(new f0(mo3.a.o(jVar.getMonthlySpent()), mo3.a.o(jVar.getSavings())));
                }
                return arrayList;
            case 1:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return w0.t(it8);
            case 2:
                Intrinsics.checkNotNullParameter((UserAuthFeatureConfig) obj2, "it");
                return Boolean.TRUE;
            case 3:
                UserAuthFeatureConfig config = (UserAuthFeatureConfig) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return new h(new BridgeDestination(new FeatureCommand(config)), null);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return i.f224256b;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                zhm.f0 f0Var = zhm.f0.f322471a;
                ArrayList arrayList2 = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList2.add(new u40(a0.d.n("TRADING_SESSION_LOADING_", i)));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new Pair(f0Var, u.c(new xc("MARKET_HOURS_LOADING", arrayList2, 0, null, null, 0, 0, 0, 1020)));
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 9:
                m it9 = (m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f190786s;
            case 10:
                m it10 = (m) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f190775b;
            case 11:
                m it11 = (m) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f190775b;
            case 12:
                m it12 = (m) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f190786s;
            case 13:
                m it13 = (m) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f190775b;
            case 14:
                m update = (m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return m.a(update, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -2, 63);
            case 15:
                m update2 = (m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return m.a(update2, true, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -2, 63);
            case 16:
                m it14 = (m) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f190786s;
            case 17:
                m it15 = (m) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Pair(it15.f190786s, it15.f190775b);
            case 18:
                m it16 = (m) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f190786s;
            case 19:
                m it17 = (m) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new Pair(it17.f190786s, it17.f190775b);
            case 20:
                m update3 = (m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return m.a(update3, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -2, 63);
            case 21:
                m it18 = (m) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Pair(it18.f190786s, it18.f190780l);
            case 22:
                m it19 = (m) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new r(it19.f190786s, it19.f190775b, it19.f190776c);
            case 23:
                m update4 = (m) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return m.a(update4, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -4097, 63);
            case 24:
                m it20 = (m) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f190786s;
            case 25:
                m update5 = (m) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return m.a(update5, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 60);
            case 26:
                m it21 = (m) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.d;
            case 27:
                m it22 = (m) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f190786s;
            case 28:
                m it23 = (m) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.f190786s;
            default:
                m state = (m) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return new Pair(state.d, state.E);
        }
    }

    public /* synthetic */ c(o oVar) {
        this.f190549a = 5;
    }
}
