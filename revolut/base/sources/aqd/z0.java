package aqd;

import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z0 z0Var = new z0(this.v, continuation);
        z0Var.u = obj2;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        IncomeSorterHomeContract$DestinationValue destination = obj3 instanceof IncomeSorterHomeContract$DestinationValue ? (IncomeSorterHomeContract$DestinationValue) obj3 : null;
        if (destination != null) {
            IncomeSorterDestinationId incomeSorterDestinationId = destination.f87827c;
            IncomeSortersDetailsController incomeSortersDetailsController = this.v;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d();
            eVar.getClass();
            Intrinsics.checkNotNullParameter(destination, "destination");
            cli.y yVar = eVar.f87766x;
            eVar.H2(yVar, new amh.j(incomeSorterDestinationId, ((t) ((j2) yVar.f22677a).getValue()).f8405g, 21));
            boolean zF = Intrinsics.f(((t) ((j2) ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) incomeSortersDetailsController.d()).f87766x.f22677a).getValue()).f8405g, incomeSorterDestinationId);
            KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) incomeSortersDetailsController.O.getValue();
            Object obj4 = dqd.s.f116956a;
            keyboardSuggestionsControllerExtension.S("income_sorter_details", zF ? (List) dqd.s.f116958c.getValue() : (List) dqd.s.f116957b.getValue());
        }
        return Unit.f186387a;
    }
}
