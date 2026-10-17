package ud3;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.R$string;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279116a;

    public /* synthetic */ m(int i) {
        this.f279116a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mda.c aVar;
        int i = this.f279116a;
        udk.m mVar = udk.m.f279262a;
        switch (i) {
            case 0:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List list = plans;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (hha.s.p((hha.d) it8.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                i updateState = (i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return i.a(updateState, null, null, null, null, null, null, null, null, null, null, null, new Data(null, null, false, 7, null), false, 12287);
            case 2:
                i updateState2 = (i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return i.a(updateState2, null, null, null, null, null, null, null, null, null, null, null, null, false, 15871);
            case 3:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Integer.valueOf(R$string.cashback_details_total_earned_title);
            case 4:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return i0.b("ID_TRANSACTIONS_LOADING_HEADER", "ID_TRANSACTION_ROW_LOADING");
            case 5:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return i0.b("ID_SPLIT_BY_SOURCES_HEADER", "ID_SPLIT_BY_SOURCES_ROW_LOADING");
            case 6:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.f0.f322471a;
            case 7:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return CounterTextDelegate.c.a.f52173a;
            case 8:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zhm.f0.f322471a;
            case 9:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return i0.b("ID_UNUSED_CASHBACKS_LOADING_HEADER", "ID_UNUSED_CASHBACKS_ROW_LOADING");
            case 10:
                return ((ddi.f) obj2).f113228b;
            case 11:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                s7 s7Var = new s7("MANAGE_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                s7 s7Var2 = new s7("REPORT_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                s7 s7Var3 = new s7("FAQ_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var3, 0, 0, 0, 0, null, false, 63);
                s7 s7Var4 = new s7("CLOSE_POCKET_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var4, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(s7Var, s7Var2, s7Var3, s7Var4);
            case 12:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                List listK = zhm.v.k(new s7("REWARD_ITEM_ID", 0, 0, 0, 0, false, null, 126), new s7("THIS_MONTH_ITEM_ID", 0, 0, 0, 0, false, null, 126), new s7("ALL_TIME_ITEM_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 13:
                udk.d update = (udk.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return udk.d.a(update, new Data(null, null, true, 3, null), null, null, 2);
            case 14:
                return udk.d.a((udk.d) obj2, null, null, udk.j.f279259a, 3);
            case 15:
                return udk.d.a((udk.d) obj2, null, null, mVar, 3);
            case 16:
                return udk.d.a((udk.d) obj2, null, null, mVar, 3);
            case 17:
                return udk.d.a((udk.d) obj2, null, null, udk.l.f279261a, 3);
            case 18:
                ve7.k it18 = (ve7.k) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 instanceof ve7.c);
            case 19:
                ve7.k it19 = (ve7.k) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19 instanceof ve7.g);
            case 20:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                List<yda.d> list2 = it20;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (yda.d currencyAccountInfoDto : list2) {
                    Intrinsics.checkNotNullParameter(currencyAccountInfoDto, "currencyAccountInfoDto");
                    xda.u uVar = currencyAccountInfoDto.f312671c;
                    String str = currencyAccountInfoDto.f312670b;
                    String str2 = currencyAccountInfoDto.f312669a;
                    if (uVar != null) {
                        xi0.b.Companion.getClass();
                        xi0.b bVarA = xi0.a.a(str2);
                        wi0.b.Companion.getClass();
                        aVar = new mda.b(bVarA, wi0.a.a(str), uda.a.a(currencyAccountInfoDto.f312671c));
                    } else {
                        xi0.b.Companion.getClass();
                        xi0.b bVarA2 = xi0.a.a(str2);
                        wi0.b.Companion.getClass();
                        aVar = new mda.a(wi0.a.a(str), bVarA2);
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            case 21:
                List flows = (List) obj2;
                Intrinsics.checkNotNullParameter(flows, "flows");
                return new rfm.o(new d73.a(flows, 4));
            case 22:
                d71.a it21 = (d71.a) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f111737b;
            case 23:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new xeg.a((List) rVar.f314201a, (vei.a) rVar.f314202b, (List) rVar.f314203c);
            case 24:
                lk0.g it22 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.f196174a.isEmpty());
            case 25:
                lk0.e it23 = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return null;
            case 26:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.TRUE;
            case 27:
                ueg.v update2 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ueg.v.a(update2, null, null, null, null, null, null, null, new Data(null, null, false, 7, null), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388479);
            case 28:
                ueg.v update3 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ueg.v.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, ueg.h0.FAILED, null, null, zhm.f0.f322471a, 2621439);
            default:
                ueg.v update4 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ueg.v.a(update4, null, null, null, null, null, null, null, null, null, null, null, null, ueg.i0.SEARCH_AREA_BUTTON, null, null, null, null, null, false, null, null, null, null, 8384511);
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f279116a = i;
    }
}
