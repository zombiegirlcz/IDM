package mic;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PerkDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PerkDetailsScreen perkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ihm.b bVar = ((g0) this.u.R2()).f205663t;
        bVar.onNext(Boolean.valueOf(!(((Boolean) bVar.f()) != null ? r0.booleanValue() : false)));
        return Unit.f186387a;
    }
}
