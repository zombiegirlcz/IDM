package bh5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.transfer_info.CryptoGiftAssetTransferInfoScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ CryptoGiftAssetTransferInfoScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CryptoGiftAssetTransferInfoScreen cryptoGiftAssetTransferInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoGiftAssetTransferInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((e) this.u.T.getValue()).f15230q.a();
        return Unit.f186387a;
    }
}
