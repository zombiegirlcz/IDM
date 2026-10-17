package nme;

import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ChallengeMediumDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChallengeMediumDelegate.Model model = (ChallengeMediumDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(model);
        ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3).I2(model);
        return Unit.f186387a;
    }
}
