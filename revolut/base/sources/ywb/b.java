package ywb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevPointsGiftcardsSearchScreen revPointsGiftcardsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(model);
        m mVar = (m) hVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        String str2 = model.f53228a;
        if (d0.J(str2, "SECTION_VOUCHER_PRODUCT_PREFIX", false)) {
            mVar.C2(new f(str));
        } else if (d0.J(str2, "SECTION_USER_VOUCHER_PREFIX", false)) {
            mVar.C2(new e(str));
        }
        return Unit.f186387a;
    }
}
