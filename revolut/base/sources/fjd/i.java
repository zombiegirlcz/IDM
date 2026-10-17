package fjd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCombinedHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ShopsCombinedHomeScreen shopsCombinedHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCombinedHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.R2();
        String listId = model.f52373a;
        com.revolut.feature.shops.impl.ui.home.a aVar2 = (com.revolut.feature.shops.impl.ui.home.a) uVarE3;
        cli.y yVar = aVar2.Q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOPS_COMBINED_STATE_ERROR")) {
            ShopsCategory shopsCategory = ((o) ((j2) yVar.f22677a).getValue()).f135583g;
            if (shopsCategory != null && (str2 = shopsCategory.f87040a) != null) {
                com.revolut.feature.shops.impl.ui.home.a.K2(aVar2, str2, false, 6);
            }
        } else if (Intrinsics.f(listId, "SHOPS_COMBINED_NEARBY_NEARBY_MAP")) {
            aVar2.L2();
            ShopsCategory shopsCategory2 = ((o) ((j2) yVar.f22677a).getValue()).f135583g;
            if (shopsCategory2 != null && (str = shopsCategory2.f87040a) != null) {
                com.revolut.feature.shops.impl.ui.home.a.K2(aVar2, str, false, 6);
            }
        }
        return Unit.f186387a;
    }
}
