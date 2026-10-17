package dca;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixQrRequestScreen pixQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f51871a, "ADD_DESCRIPTION_KEY_ID")) {
            ((r) this.v.d()).C2(k.f112832a);
        }
        return Unit.f186387a;
    }
}
