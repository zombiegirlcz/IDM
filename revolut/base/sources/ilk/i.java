package ilk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.DeclineReason;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import imk.l;
import imk.u;
import imk.x;
import ise.g0;
import ise.j0;
import iuj.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f162259b;

    public /* synthetic */ i(Data data, int i) {
        this.f162258a = i;
        this.f162259b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g0 g0Var;
        g0 g0VarK2;
        Data data;
        Data data2;
        switch (this.f162258a) {
            case 0:
                Data data3 = this.f162259b;
                Intrinsics.h(data3);
                return d.a((d) obj2, data3, null, 2);
            case 1:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, 130047);
            case 2:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, null, null, 130943);
            case 3:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, null, 130815);
            case 4:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, 130559);
            case 5:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, 98303);
            case 6:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, 129023);
            case 7:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, null, 126975);
            case 8:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, null, 122879);
            case 9:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f162259b, null, null, 114687);
            case 10:
                return imh.d.a((imh.d) obj2, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, null, null, null, null, null, 131055);
            case 11:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, null, null, null, null, 131039);
            case 12:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, this.f162259b, null, null, null, null, null, null, null, null, null, null, 131007);
            case 13:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                hha.d dVar = (hha.d) this.f162259b.getContent();
                return new x(pd.b.j(dVar != null ? Boolean.valueOf(dVar.f152296p) : null) ? com.revolut.retail.feature.pricing_plans.ui.api.models.c.LEFT_ALIGNED : com.revolut.retail.feature.pricing_plans.ui.api.models.c.CENTERED);
            case 14:
                return u.c((u) obj2, null, null, null, this.f162259b, null, 23);
            case 15:
                Data data4 = this.f162259b;
                Intrinsics.h(data4);
                return u.c((u) obj2, data4, null, null, null, null, 30);
            case 16:
                return inc.e.a((inc.e) obj2, null, this.f162259b, null, false, null, 29);
            case 17:
                return inc.e.a((inc.e) obj2, this.f162259b, null, null, false, null, 30);
            case 18:
                return inc.e.a((inc.e) obj2, null, null, null, false, this.f162259b, 15);
            case 19:
                ((ip4.f) obj2).getClass();
                Data content = this.f162259b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new ip4.f(content);
            case 20:
                ((ipb.e) obj2).getClass();
                Data data5 = this.f162259b;
                Intrinsics.checkNotNullParameter(data5, "data");
                return new ipb.e(data5);
            case 21:
                Data data6 = this.f162259b;
                Intrinsics.h(data6);
                return is2.f.a((is2.f) obj2, null, data6, null, null, false, 29);
            case 22:
                Data data7 = this.f162259b;
                Intrinsics.h(data7);
                return is2.f.a((is2.f) obj2, null, null, data7, null, false, 27);
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new r(this.f162259b, (String) pair.f186385a, (List) pair.f186386b);
            case 24:
                j0 update = (j0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data8 = this.f162259b;
                Intrinsics.h(data8);
                ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) data8.getContent();
                if (threeDSTransaction != null) {
                    String str = threeDSTransaction.f60534a;
                    List list = threeDSTransaction.f60544q;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((DeclineReason) it9.next()).d);
                    }
                    g0Var = new g0(str, arrayList, null);
                } else {
                    g0Var = null;
                }
                return j0.a(update, data8, null, null, null, null, null, null, null, g0Var, false, 6141);
            case 25:
                return j0.a((j0) obj2, null, null, null, null, null, null, this.f162259b, null, null, false, 7679);
            case 26:
                j0 j0Var = (j0) obj2;
                Data data9 = this.f162259b;
                AddMoneyMethod addMoneyMethod = (AddMoneyMethod) data9.getContent();
                if (addMoneyMethod == null || (g0VarK2 = com.revolut.feature.three_ds_verification.impl.ui.sceen.d.K2(addMoneyMethod, j0Var.f168205j)) == null) {
                    g0VarK2 = j0Var.f168205j;
                }
                return j0.a(j0Var, null, null, null, null, data9, null, null, null, g0VarK2, false, 6015);
            case 27:
                Data data10 = this.f162259b;
                j0 j0Var2 = (j0) obj2;
                try {
                    Object content2 = data10.getContent();
                    data = new Data(content2 != null ? (OrderQuote) ((Pair) content2).f186385a : null, data10.getError(), data10.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data10.getLoading());
                }
                Data data11 = data;
                try {
                    Object content3 = data10.getContent();
                    data2 = new Data(content3 != null ? (Clause) ((Pair) content3).f186386b : null, data10.getError(), data10.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data10.getLoading());
                }
                return j0.a(j0Var2, null, null, null, null, null, data11, null, data2, null, false, 6911);
            case 28:
                return iug.e.a((iug.e) obj2, this.f162259b, false, 6);
            default:
                return o.a((o) obj2, this.f162259b, null, null, 6);
        }
    }

    public /* synthetic */ i(Data data, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, int i) {
        this.f162258a = i;
        this.f162259b = data;
    }

    public /* synthetic */ i(l lVar, Data data) {
        this.f162258a = 13;
        this.f162259b = data;
    }
}
