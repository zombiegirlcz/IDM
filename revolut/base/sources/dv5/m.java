package dv5;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pt5.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f118048b;

    public /* synthetic */ m(o oVar, int i) {
        this.f118047a = i;
        this.f118048b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f118047a) {
            case 0:
                pt5.q swipeAction = (pt5.q) obj2;
                Intrinsics.checkNotNullParameter(swipeAction, "swipeAction");
                l lVar = this.f118048b.f118053c;
                if (swipeAction instanceof pt5.n) {
                    ExchangeOrder order = ((pt5.n) swipeAction).f239622a;
                    Intrinsics.checkNotNullParameter(order, "order");
                    return ((x0i.g) lVar.f118046c).a(order.getF72134a().f72137a);
                }
                if (!(swipeAction instanceof pt5.o)) {
                    if (swipeAction instanceof pt5.p) {
                        return lVar.c(((pt5.p) swipeAction).f239624a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                qua.p payment = ((pt5.o) swipeAction).f239623a;
                Intrinsics.checkNotNullParameter(payment, "payment");
                pfm.h hVar = new pfm.h(((yua.q) lVar.d).k(payment.f249314a.f160150a, null), 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                return hVar;
            case 1:
                pt5.a aVar = pt5.b.Companion;
                String str = ((g6) obj2).f54199a;
                aVar.getClass();
                this.f118048b.d = pt5.a.a(str);
                return Unit.f186387a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                pt5.j jVar = (pt5.j) pair.f186385a;
                String str2 = (String) pair.f186386b;
                boolean z = jVar instanceof pt5.g;
                o oVar = this.f118048b;
                if (z) {
                    return oVar.f118052b.h3(((pt5.g) jVar).f239617a);
                }
                if (jVar instanceof pt5.h) {
                    return oVar.f118052b.i3(((pt5.h) jVar).f239618a);
                }
                if (jVar instanceof pt5.k) {
                    return oVar.f118052b.k3(((pt5.k) jVar).f239621a);
                }
                if (jVar instanceof pt5.i) {
                    return oVar.f118052b.j3(((pt5.i) jVar).f239619a);
                }
                if (Intrinsics.f(jVar, j.a.f239620a)) {
                    return oVar.f118052b.g3(Intrinsics.f(str2, "LIST_ID_ORDERS_HEADER") ? pt5.b.ORDERS : Intrinsics.f(str2, "LIST_ID_TRANSACTIONS_HEADER") ? pt5.b.TRANSACTIONS : oVar.d);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
