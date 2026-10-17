package a3e;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreDealsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(StoreDealsScreen storeDealsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeDealsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(model);
        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
        Object e = model.getE();
        m2e.b bVar = e instanceof m2e.b ? (m2e.b) e : null;
        if (bVar != null) {
            ((t) this.v.R2()).J2(bVar);
        }
        return Unit.f186387a;
    }
}
