package ow1;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrebQrRequestScreen brebQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.v.R2();
        String listId = model.f53531a;
        qVarD3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ALIAS_SELECTOR_ID")) {
            qVarD3.C2(k.f230263a);
        }
        return Unit.f186387a;
    }
}
