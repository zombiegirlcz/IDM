package ysk;

import aw0.m6;
import aw0.n6;
import ba6.l;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingAvailability;
import ip0.kg;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jmrtd.PassportService;
import ytj.j;
import ytj.p;
import ytj.r;
import yui.q;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316505a;

    public /* synthetic */ a(int i) {
        this.f316505a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set set;
        switch (this.f316505a) {
            case 0:
                xsk.f it8 = (xsk.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf((it8.f308558a.getContent() == null || it8.f308559b.getContent() == null) ? false : true);
            case 1:
                xsk.f it9 = (xsk.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                i.Companion.getClass();
                return od0.h.a(it9);
            case 2:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (npg.b) zi0.c.I(it10);
            case 3:
                efm.b it11 = (efm.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11;
            case 4:
                Object[] results = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                int length = results.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj3 = results[i];
                        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj3).booleanValue()) {
                            i++;
                        } else {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, null, null, false, true, 15);
            case 6:
                j update2 = (j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j.a(update2, null, null, null, true, false, 23);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                n6 n6VarA = m6.a();
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(nb0.b(pb0.Companion, "challenge_details_loading_row_", false, 0, false, 28));
                }
                int i3 = R$attr.uikit_dp24;
                yp0.b.k(arrayList, i3, i3, 0, 0, 28);
                return new r(p.f316825a, new aw0.e(false, null, null, n6VarA, null, null, 55), false, arrayList);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(nb0.a(pb0.Companion, "LOADING_STATE_ID", false, 6));
            case 9:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (it12.getContent() != null || it12.getLoading()) ? it12 : new Data(f0.f322471a, null, false, 6, null);
            case 10:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List<l> list = it13;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (l lVar : list) {
                    linkedHashMap.put(lVar.f13938a, lVar);
                }
                return linkedHashMap;
            case 11:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : subscriptions) {
                    if (((qua.p) obj4).getType() != ibd.h.DIRECT_DEBIT_TOPUP) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 12:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : recurringPayments) {
                    qua.p pVar = (qua.p) obj5;
                    if (qua.u.G(pVar) && (set = pVar.G) != null && (!set.isEmpty())) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(1);
            case 14:
                List stakingProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
                return d0.P0(stakingProducts, new yud.d());
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new StakingAvailability(null, null);
            case 16:
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, null, null, false, false, false, true, 8191);
            case 17:
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 8191);
            case 18:
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 7871);
            case 19:
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 8191);
            case 20:
                return yui.l.a((yui.l) obj2, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 8191);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                kg.Companion.getClass();
                Intrinsics.checkNotNullParameter("ID_LOADING_ITEM_1", "listId");
                kg kgVar = new kg("ID_LOADING_ITEM_1", false, false, false, R$attr.uikit_dp16, 7152);
                yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model = new InputTextDelegate.Model("ID_LOADING_ITEM_2", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_LOADING_ITEM_3", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model3 = new InputTextDelegate.Model("ID_LOADING_ITEM_4", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model model4 = new InputTextDelegate.Model("ID_LOADING_ITEM_4", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                return new yui.u(v.k(kgVar, model, model2, model3, model4), q.f317045a);
            case 22:
                Long it14 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Long.valueOf(((long) 7) - it14.longValue());
            case 23:
                return yv2.f.a((yv2.f) obj2, 0, null, null, false, null, false, true, null, 191);
            case 24:
                return yv2.f.a((yv2.f) obj2, 0, null, null, false, null, false, false, null, 191);
            case 25:
                return yv2.f.a((yv2.f) obj2, 0, null, null, false, null, false, false, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 26:
                i it15 = (i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                List list2 = (List) it15.f224257a;
                return list2 == null ? f0.f322471a : list2;
            case 27:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return d0.P0(it16, new yv5.c());
            case 28:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List<yv5.e> list3 = it17;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (yv5.e eVar : list3) {
                    xi0.a aVar = xi0.b.Companion;
                    String code = eVar.getCode();
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(code);
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(eVar.getLastSeen());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    arrayList4.add(new uv5.i(bVarA, instantOfEpochMilli));
                }
                return arrayList4;
            default:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new yv7.h((List) defaultItems.invoke(), false);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f316505a = i;
    }
}
