package g3e;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreExclusivesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(StoreExclusivesScreen storeExclusivesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeExclusivesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((NewsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewsDelegate.Model model = (NewsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((r) this.v.R2()).I2(model.k);
        return Unit.f186387a;
    }
}
