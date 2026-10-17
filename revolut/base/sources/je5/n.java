package je5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebResourceException;
import com.revolut.feature.retail.reverywhere.impl.web_app.c;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import feh.j;
import ff4.s;
import java.util.List;
import jfb.m0;
import jfb.p0;
import jhe.x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofa.f0;
import ofa.g0;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173225a;

    public /* synthetic */ n(int i) {
        this.f173225a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f173225a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ce9.p pagingState = new ce9.p(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 61);
                String query = update.f173217b;
                Intrinsics.checkNotNullParameter(pagingState, "pagingState");
                Intrinsics.checkNotNullParameter(query, "query");
                return new g(pagingState, query);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 2:
                jec.c update2 = (jec.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                jec.h state = jec.h.f173263a;
                Intrinsics.checkNotNullParameter(state, "state");
                return new jec.c(state);
            case 3:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                jef.h hVar = jef.h.d;
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 4:
                ieg.a it8 = (ieg.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f160708b ? ieg.a.a(it8, false) : it8;
            case 5:
                xag.c it9 = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f303878c;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return j.a.f134625a;
            case 7:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new s((List) getDefaultLoadingItems.invoke(), null, null, ShimmerImage.f60002a, null, null, null, null, null, false, false, null, null, 6678);
            case 8:
                return f0.INSTANCE.serializer();
            case 9:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.b(o0.f186429a.b(g0.class), new n(8));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 10:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update3 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update3, null, null, null, 0, c.a.f82932a, 79);
            case 11:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update4 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update4, null, null, null, 0, null, ISO781611.SMT_TAG);
            case 12:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update5 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update5, null, null, null, 0, new p0(new ReverywhereWebResourceException(null, "Navigation error")), 31);
            case 13:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update6 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update6, null, null, null, 0, c.C0526c.f82934a, 95);
            case 14:
                com.revolut.feature.retail.reverywhere.impl.web_app.b update7 = (com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return update7.f instanceof c.C0526c ? com.revolut.feature.retail.reverywhere.impl.web_app.b.a(update7, null, null, null, 0, c.d.f82935a, 95) : update7;
            case 15:
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a((com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2, null, null, null, 0, null, 63);
            case 16:
                return com.revolut.feature.retail.reverywhere.impl.web_app.b.a((com.revolut.feature.retail.reverywhere.impl.web_app.b) obj2, null, null, null, 0, new p0(new ReverywhereWebResourceException(null, "Page load timeout")), 31);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new m0(zhm.f0.f322471a);
            case 18:
                Intrinsics.checkNotNullParameter((ReverywhereWebResourceException) obj2, "it");
                return Unit.f186387a;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 20:
                whf.p transactionsContent = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                return new jh3.a(transactionsContent.f297646a, transactionsContent.f297647b);
            case 21:
                ((jh6.c) obj2).getClass();
                return new jh6.c(true);
            case 22:
                CenteredAmountDelegate.Model it10 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr = FormAmountScreen.S;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj3 = it10.f51981p;
                if (obj3 instanceof yof.b) {
                    return (yof.b) obj3;
                }
                return null;
            case 23:
                jh9.f it11 = (jh9.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f174161b;
            case 24:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return w.u(it12);
            case 25:
                Data params = (Data) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return new Pair(params.getContent(), params.getContent() == null ? Boolean.valueOf(params.getLoading()) : null);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 27:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return w.u(it13);
            case 28:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return u.c(x.a(new ProductAccountId("totalWealth", null), (dj0.d) pair.f186385a, (ProductAccountListAction) ((od0.i) pair.f186386b).f224257a));
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Pair pair3 = (Pair) pair2.f186385a;
                return new yhm.r(pair3.f186385a, pair3.f186386b, pair2.f186386b);
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f173225a = i;
    }
}
