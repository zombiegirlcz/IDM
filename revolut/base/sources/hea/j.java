package hea;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PocketDetailsScreen pocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        ActionWidgetDelegate.Model model = tVar.f54722b;
        ActionWidgetDelegate.a action = tVar.f54721a;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(model.f51590a, "ACCOUNT_DETAILS_SWITCH_BANNER_ID")) {
            Continuation continuation = null;
            if (Intrinsics.f(action, ActionWidgetDelegate.a.b.f51608a)) {
                Object obj3 = model.f51596l;
                mn2.a aVar3 = obj3 instanceof mn2.a ? (mn2.a) obj3 : null;
                if (aVar3 != null) {
                    aVar2.n2(new h54.o(aVar2, aVar3, continuation, 24), new whi.b(6));
                }
            } else if (Intrinsics.f(action, ActionWidgetDelegate.a.C0395a.f51607a)) {
                aVar2.l2(new y(3, aVar2, continuation), new yi5.b(26));
            } else if (!Intrinsics.f(action, ActionWidgetDelegate.a.c.f51609a) && !Intrinsics.f(action, ActionWidgetDelegate.a.d.f51610a) && !(action instanceof com.revolut.core.ui_kit.delegates.h)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
