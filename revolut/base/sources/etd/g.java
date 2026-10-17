package etd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthTypeSelectorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TotalWealthTypeSelectorController totalWealthTypeSelectorController, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthTypeSelectorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.O.getValue();
        String itemId = model.f53228a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ASSETS_ID")) {
            hVar.C2(a.f129404a);
        } else if (Intrinsics.f(itemId, "LIABILITIES_ID")) {
            hVar.C2(b.f129405a);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected id: ", itemId));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
