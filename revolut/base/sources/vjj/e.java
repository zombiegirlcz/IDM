package vjj;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.u.R2();
        String str = cVar.o.f101191a;
        Optional optional = (Optional) ((j) ((j2) cVar.I.f22677a).getValue()).e.getContent();
        EsimGiftRecipient esimGiftRecipient = null;
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
        }
        cVar.C2(new p(str, esimGiftRecipient));
        return Unit.f186387a;
    }
}
