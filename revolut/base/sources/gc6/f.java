package gc6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.ContributionsTabScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContributionsTabScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ContributionsTabScreen contributionsTabScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contributionsTabScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.v.Z.getValue();
        Intrinsics.h(model);
        o oVar = (o) lVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "DONATIONS_DISCLAIMER_BUTTON_ITEM_ID")) {
            j60.a.v(oVar.f142361q, false, null, 3);
        }
        return Unit.f186387a;
    }
}
