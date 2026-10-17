package m56;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ DeFiTransferAssetsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeFiTransferAssetsScreen deFiTransferAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiTransferAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((f) this.u.P.getValue()).f202845q.a();
        return Unit.f186387a;
    }
}
