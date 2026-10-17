package c5a;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ChatTransferScreen chatTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarG3 = this.v.d();
        Intrinsics.h(model);
        ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG3).K2(model);
        return Unit.f186387a;
    }
}
