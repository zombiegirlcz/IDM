package adb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DepositAssetsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DepositAssetsScreen depositAssetsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = depositAssetsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVar = (k) this.v.O.getValue();
        Intrinsics.h(model);
        n nVar = (n) kVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1483823991) {
            if (iHashCode != -705431479) {
                if (iHashCode == 335408424 && str.equals("MONEY_ITEM_ID")) {
                    nVar.C2(f.f3315a);
                }
            } else if (str.equals("CRYPTO_ITEM_ID")) {
                nVar.C2(h.f3317a);
            }
        } else if (str.equals("TRADING_ITEM_ID")) {
            nVar.C2(i.f3318a);
        }
        return Unit.f186387a;
    }
}
