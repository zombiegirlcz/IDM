package p4c;

import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.t3;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IppShopProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IppShopProductScreen ippShopProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ippShopProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ExpandableCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExpandableCellDelegate.Model model = (ExpandableCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f;
        String listId = model.f52256a;
        boolean z = obj3 instanceof j;
        IppShopProductScreen ippShopProductScreen = this.v;
        if (z) {
            x xVar = (x) ippShopProductScreen.R2();
            xVar.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            xVar.H2(xVar.u, new t3(listId, 19));
        } else if (obj3 instanceof l) {
            x xVar2 = (x) ippShopProductScreen.R2();
            xVar2.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            xVar2.H2(xVar2.u, new t3(listId, 18));
        }
        return Unit.f186387a;
    }
}
