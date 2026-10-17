package gp7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_car.impl.data.model.PaymentBreakdownCategory;
import com.revolut.feature.insurance_car.impl.data.model.PriceWithLabel;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xl7.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PaymentBreakdownScreen paymentBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.X.getValue();
        String id10 = model.f51832a;
        Object obj3 = model.o;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj3 instanceof PaymentBreakdownCategory) {
            PaymentBreakdownCategory paymentBreakdownCategory = (PaymentBreakdownCategory) obj3;
            j60.a aVar2 = fVar.f145282p;
            h hVar = fVar.f145283q;
            String title = paymentBreakdownCategory.f75277a;
            ArrayList<PriceWithLabel> items = paymentBreakdownCategory.f75278b;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            TextClause textClause = new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ArrayList arrayList = new ArrayList(w.t(items, 10));
            for (PriceWithLabel priceWithLabel : items) {
                arrayList.add(new yl7.c(new TextClause(priceWithLabel.f75295a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), n.g(priceWithLabel.f75296b, null, null, 3)));
            }
            aVar2.x(yl7.d.a(textClause, arrayList));
        }
        return Unit.f186387a;
    }
}
