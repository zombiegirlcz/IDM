package m18;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.v;
import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreen;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import m1i.n0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201287a;

    public /* synthetic */ n(int i) {
        this.f201287a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        Object[] objArr = 0;
        switch (this.f201287a) {
            case 0:
                return j18.i.d;
            case 1:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                Json.f255101c = true;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.b(o0.f186429a.b(j18.h.class), new n((int) (objArr == true ? 1 : 0)));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 2:
                Context ctx = (Context) obj2;
                StockLendingProductScreen.Companion aVar = StockLendingProductScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                return new LinearLayoutManager(ctx);
            case 3:
                n4l.e stockLendingStatus = (n4l.e) obj2;
                Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
                if (stockLendingStatus instanceof n4l.c) {
                    z = ((n4l.c) stockLendingStatus).f212470a;
                } else if (!(stockLendingStatus instanceof n4l.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 4:
                rlm.f Json2 = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json2, "$this$Json");
                Json2.f255100b = false;
                Json2.f255101c = true;
                return Unit.f186387a;
            case 5:
                rlm.f Json3 = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json3, "$this$Json");
                Json3.f255100b = false;
                Json3.f255101c = true;
                return Unit.f186387a;
            case 6:
                nqi.a it8 = (nqi.a) obj2;
                MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f218468b;
            case 7:
                nqi.a it9 = (nqi.a) obj2;
                MarketOrderActivity.Companion companion2 = MarketOrderActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f218468b;
            case 8:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(it10, false, null, 3);
            case 9:
                rp0.c result = (rp0.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return Boolean.valueOf(Intrinsics.f(result.f256050a, "POCKET_ACTIVATION_DIALOG") && result.f256052c == AlertDialogDisplayer$Button.POSITIVE);
            case 10:
                yvh.b autoInvest = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                return Boolean.valueOf(autoInvest.f317177b && autoInvest.f == yvh.f.SPARE_CHANGE && autoInvest.e == yvh.h.CURRENT_POCKET);
            case 11:
                Boolean it11 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(!it11.booleanValue());
            case 12:
                v model = (v) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                bw0.m mVar = model.f54837b.f164618g;
                Object obj3 = mVar != null ? mVar.e : null;
                if (obj3 instanceof n0) {
                    return (n0) obj3;
                }
                return null;
            case 13:
                v model2 = (v) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                bw0.m mVar2 = model2.f54838c.f164618g;
                Object obj4 = mVar2 != null ? mVar2.e : null;
                if (obj4 instanceof n0) {
                    return (n0) obj4;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((v) obj2, "it");
                return r1i.h.TOP;
            case 15:
                Intrinsics.checkNotNullParameter((v) obj2, "it");
                return r1i.h.BOTTOM;
            case 16:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return r1i.h.TOP;
            case 17:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return r1i.h.BOTTOM;
            case 18:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return m1i.g.TOP;
            case 19:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return m1i.g.BOTTOM;
            case 20:
                m22.a update = (m22.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data items = Data.copy$default(update.f201679a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(items, "items");
                return new m22.a(items);
            case 21:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new m22.b((List) getDefaultLoadingItems.invoke());
            case 22:
                DeFiAssetDetails details = (DeFiAssetDetails) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return new a8j.d(new TextClause(details.f71665a.f71672b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), details.d, details.e, details.f, f0.f322471a);
            case 23:
                m2f.l update2 = (m2f.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return m2f.l.a(update2, null, null, 0.0d, null, 0, null, null, null, null, false, false, 6143);
            case 24:
                m2f.l update3 = (m2f.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return m2f.l.a(update3, null, null, 0.0d, null, 0, null, m2f.m.FIRST, null, null, false, false, 7935);
            case 25:
                m2f.l update4 = (m2f.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return m2f.l.a(update4, null, null, 0.0d, null, 0, null, m2f.m.SECOND, null, null, false, false, 7935);
            case 26:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, null, 0, null, null, null, null, false, true, 4095);
            case 27:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, null, 0, null, null, null, null, false, false, 4095);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
        }
    }
}
