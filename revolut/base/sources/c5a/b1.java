package c5a;

import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Rev10ChatTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Rev10ChatTransferScreen rev10ChatTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rev10ChatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b1 b1Var = new b1(this.v, continuation);
        b1Var.u = obj2;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b1) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarG3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof ChaosManagementNewsItem) {
            fVar.l2(new btk.j(fVar, (ChaosManagementNewsItem) obj3, null, 19), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
