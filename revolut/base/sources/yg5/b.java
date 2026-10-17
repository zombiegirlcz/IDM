package yg5;

import aw0.n6;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.CryptoGiftAssetClaimScreen;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import y20.a1;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoGiftAssetClaimScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoGiftAssetClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) cryptoGiftAssetClaimScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) cryptoGiftAssetClaimScreen.e3();
                f fVar = ((g) ((j2) uVar.f313545w.f22677a).getValue()).f313525b;
                e eVar = fVar instanceof e ? (e) fVar : null;
                if (eVar != null) {
                    ArrayList arrayList = eVar.f313523a;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((xi0.b) it8.next()).f306286a);
                    }
                    if (arrayList2.size() == 3) {
                        uVar.A1(new a1(uVar, arrayList2, null, 27), new yea.l(1, uVar, u.class, "handleClaimError", "handleClaimError(Ljava/lang/Throwable;)Z", 0, 1));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
