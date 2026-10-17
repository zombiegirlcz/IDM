package udi;

import cli.y;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsPocketDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RevPointsPocketDetailsScreen revPointsPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar = (com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) this.u.R2();
        y yVar = bVar.f97820x;
        if (!zi0.c.E(((j) ((j2) yVar.f22677a).getValue()).f279212a)) {
            bVar.v.a();
        }
        if (!zi0.c.E(((j) ((j2) yVar.f22677a).getValue()).f279213b)) {
            bVar.f97819w.a();
        }
        return Unit.f186387a;
    }
}
