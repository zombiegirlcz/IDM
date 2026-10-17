package bh5;

import aw0.n6;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.transfer_info.CryptoGiftAssetTransferInfoScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoGiftAssetTransferInfoScreen f15232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CryptoGiftAssetTransferInfoScreen cryptoGiftAssetTransferInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15232w = cryptoGiftAssetTransferInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f15232w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f15232w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoGiftAssetTransferInfoScreen cryptoGiftAssetTransferInfoScreen = this.f15232w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(n6Var.f, "CRYPTO_GIFT_ASSET_TRANSFER_INFO_BUY")) {
                    e eVar = (e) cryptoGiftAssetTransferInfoScreen.T.getValue();
                    eVar.C2(new og5.b(eVar.o.f70862a));
                }
                break;
            default:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(n6Var2.f, "CRYPTO_GIFT_ASSET_TRANSFER_INFO_SEND")) {
                    e eVar2 = (e) cryptoGiftAssetTransferInfoScreen.T.getValue();
                    eVar2.C2(new og5.c(eVar2.o.f70862a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
