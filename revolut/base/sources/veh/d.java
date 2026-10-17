package veh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OptionsTabController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OptionsTabController optionsTabController, Continuation continuation) {
        super(2, continuation);
        this.v = optionsTabController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.P.getValue();
        String listId = model.f52373a;
        vii.b bVar = kVar.f288337r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = 18;
        Continuation continuation = null;
        switch (listId.hashCode()) {
            case -1896074213:
                if (listId.equals("UNDERLYING_PRICE_AND_EXPIRATION_DATES_ERROR_LIST_ID")) {
                    kVar.n2(new uxe.l(kVar, continuation, i), new whi.b(6));
                    bVar.a();
                }
                break;
            case -1704007271:
                if (listId.equals("CHAIN_OPTION_ERROR_LIST_ID") && kVar.f288338s.getValue() != null) {
                    kVar.f288339t.a();
                }
                break;
            case -1473056627:
                if (listId.equals("UNDERLYING_PRICE_ERROR_LIST_ID")) {
                    kVar.n2(new uxe.l(kVar, continuation, i), new whi.b(6));
                }
                break;
            case 552899355:
                if (listId.equals("EXPIRATION_DATES_ERROR_LIST_ID")) {
                    bVar.a();
                }
                break;
        }
        return Unit.f186387a;
    }
}
