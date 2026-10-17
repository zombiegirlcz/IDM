package dba;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.PixTrustedListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixTrustedListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PixTrustedListScreen pixTrustedListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixTrustedListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarD3 = this.v.R2();
        String listId = model.f52373a;
        iVarD3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "EMPTY_STATE_LIST_ITEM_ID")) {
            iVarD3.C2(f.f112696a);
        } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            iVarD3.I2();
        }
        return Unit.f186387a;
    }
}
