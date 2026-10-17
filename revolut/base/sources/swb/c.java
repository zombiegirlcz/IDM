package swb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.RevPointsGiftcardsDownloadScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardsDownloadScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsGiftcardsDownloadScreen revPointsGiftcardsDownloadScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardsDownloadScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            aVar2.C2(new f(str));
        }
        return Unit.f186387a;
    }
}
