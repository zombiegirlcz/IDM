package id8;

import aw0.m6;
import aw0.n6;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.a;
import com.revolut.retail.feature.pod_nominees.impl.details.a;
import com.youTransactor.uCube.rpc.Constants;
import do3.n;
import ip0.bb0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import ox0.b0;
import tof.a3;
import tof.z6;
import xdb.p;
import xdb.x;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160437a;

    public /* synthetic */ a(int i) {
        this.f160437a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strE;
        switch (this.f160437a) {
            case 0:
                return new go.g(f0.f322471a, 2);
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                return d0.E0(d0.B0((List) pair.f186386b, d0.i1(list)), list);
            case 4:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return u.c(nb0.b(pb0.Companion, "TRANSACTIONS_LOADING_LIST_ID", false, 0, false, 30));
            case 5:
                return ((n) obj2).i;
            case 6:
                ie6.a update = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ie6.a.a(update, null, ie6.i.LOADING, false, false, 13);
            case 7:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                return Boolean.TRUE;
            case 8:
                ie6.a update2 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ie6.a.a(update2, null, ie6.i.LOADING, false, false, 13);
            case 9:
                ie6.a update3 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ie6.a.a(update3, null, null, true, false, 3);
            case 10:
                ie6.a update4 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ie6.a.a(update4, null, null, false, true, 3);
            case 11:
                ie6.a update5 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ie6.a.a(update5, null, ie6.i.FINISHING, false, false, 13);
            case 12:
                ie6.a update6 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ie6.a.a(update6, null, ie6.i.FINISHING, false, false, 13);
            case 13:
                ie6.a update7 = (ie6.a) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ie6.a.a(update7, null, ie6.i.IDLE, false, false, 13);
            case 14:
                return ie6.a.a((ie6.a) obj2, null, ie6.i.FINISHING, false, false, 13);
            case 15:
                return ie6.a.a((ie6.a) obj2, null, ie6.i.FINISHING, false, false, 13);
            case 16:
                return ((ie6.a) obj2).f160630b;
            case 17:
                ieb.g update8 = (ieb.g) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return ieb.g.a(update8, null, Data.copy$default(update8.f160685b, null, null, true, 1, null), Data.copy$default(update8.f160686c, null, null, true, 1, null), Data.copy$default(update8.d, null, null, true, 1, null), Data.copy$default(update8.e, null, null, true, 1, null), Data.copy$default(update8.f, null, null, true, 1, null), null, null, Constants.TAG_ATMEL_SERIAL);
            case 18:
                p it11 = (p) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return d0.Q(it11.f304404b);
            case 19:
                x group = (x) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                return y.x(d0.Q(group.f304413a), new i9e.a(group, 19));
            case 20:
                return ieb.g.a((ieb.g) obj2, new Data(null, null, true, 3, null), null, null, null, null, null, null, null, 254);
            case 21:
                xag.c updateFilters = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                return xag.c.b(updateFilters, c8g.a.x(updateFilters.f303876a), null, null, 6);
            case 22:
                xag.c updateFilters2 = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(updateFilters2, "$this$updateFilters");
                return xag.c.b(updateFilters2, null, c8g.a.x(updateFilters2.f303877b), null, 5);
            case 23:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    bb0 bb0Var = new bb0(a0.d.n("ROOM_RATES_LOADING_ITEM_ID_", i));
                    yp0.b.l(bb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayListP.add(bb0Var);
                }
                return arrayListP;
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new iek.j(a.b.f102588a, (List) getDefaultLoadingItems.invoke());
            case 25:
                List content = (List) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                a3 a3Var = ((j61.c) d0.b0(content)).f171656a;
                z6 z6Var = a3Var.G;
                if (z6Var == null || (strE = z6Var.c()) == null) {
                    strE = k.e(a3Var);
                }
                return new gal.b(a3Var.k, strE);
            case 26:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ArrayList arrayListA = com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.b.a();
                n6.Companion.getClass();
                return new iga.i(arrayListA, a.C0523a.f80971a, new aw0.h(false, m6.a(), m6.a(), null, b0.ABOVE_BUTTONS, null, 105));
            case 27:
                igf.c update9 = (igf.c) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return igf.c.a(update9, null, null, null, null, 11);
            case 28:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "<unused var>", 5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayListP2.add(t61.a.o("FUND_DETAILS_ALL_HOLDINGS_ITEM_LOADING", i2, pb0.Companion, false, 4));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return arrayListP2;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                eVarB.add(new qi("FUND_DETAILS_ALLOCATION_FIXED_TAB_LOADING", 3));
                ArrayList arrayList = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("FUND_DETAILS_ALLOCATION_ROW_ITEM_LOADING", i3), false, 0, false, 30));
                }
                eVarB.addAll(arrayList);
                return yp0.b.h(u.a(eVarB), new gu("FUND_DETAILS_ALLOCATION_HEADER_LOADING", 0, 0, 30), null, 0, 126);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f160437a = i;
    }
}
