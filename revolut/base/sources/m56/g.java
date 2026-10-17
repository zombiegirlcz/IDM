package m56;

import aw0.o9;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlowContract$PagerItem;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.global.GlobalDetailsScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m8c.l;
import m8c.m;
import m8d.w;
import m98.g;
import m9d.o1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202847a;

    public /* synthetic */ g(int i) {
        this.f202847a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f202847a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new m58.c(f0.f322471a);
            case 2:
                Throwable error = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (tradingLegalEntityInformation == null) {
                    return error;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return q4g.b.a(4, "OFFER_DETAILS_ERROR_ID", true);
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return q4g.b.a(4, "USER_ERROR_ID", true);
            case 5:
                Throwable error2 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 7:
                Throwable error4 = (Throwable) obj2;
                io3.d dVar = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (dVar != null) {
                    return error4;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Throwable error5 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pair == null) {
                    return error5;
                }
                return null;
            case 10:
                Throwable error6 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cVar == null) {
                    return error6;
                }
                return null;
            case 11:
                Throwable error7 = (Throwable) obj2;
                FaqNodeBase faqNodeBase = (FaqNodeBase) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (faqNodeBase == null) {
                    return error7;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 13:
                ali.b PagerCoordinator = (ali.b) obj2;
                GlobalMarketsRedesignFlowContract$PagerItem item = (GlobalMarketsRedesignFlowContract$PagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                if (Intrinsics.f(item, GlobalMarketsRedesignFlowContract$PagerItem.GlobalItem.f74595a)) {
                    return new GlobalDetailsScreen();
                }
                if (item instanceof GlobalMarketsRedesignFlowContract$PagerItem.MarketItem) {
                    return new MarketDetailsRedesignScreen(new MarketDetailsRedesignScreenContract$InputData(((GlobalMarketsRedesignFlowContract$PagerItem.MarketItem) item).f74596a));
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 15:
                Throwable error8 = (Throwable) obj2;
                io3.d dVar2 = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (dVar2 == null) {
                    return error8;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new m(new l(null, null, null, null, f0.f322471a), (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)));
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new w(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 21:
                Throwable illegalStateException = (Throwable) obj2;
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException("Neither data nor error present");
                }
                RuntimeException runtimeException = new RuntimeException("Cannot build card request items", illegalStateException);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Throwable illegalStateException2 = (Throwable) obj2;
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                if (illegalStateException2 == null) {
                    illegalStateException2 = new IllegalStateException("Neither data nor error present");
                }
                RuntimeException runtimeException2 = new RuntimeException("Cannot build card request items", illegalStateException2);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException2, h0Var2);
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return g.a.f203641a;
            case 24:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return o1.c();
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return o1.b();
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }
}
