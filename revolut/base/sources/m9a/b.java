package m9a;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.PixAuthorisationRejectReasonScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m62.l;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAuthorisationRejectReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAuthorisationRejectReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53304a;
        boolean zF = Intrinsics.f(str, "USER_NOT_INTERESTED_ID");
        PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = this.v;
        if (zF) {
            g gVarD3 = pixAuthorisationRejectReasonScreen.d();
            gVarD3.H2(gVarD3.o, new l(28));
        } else if (Intrinsics.f(str, "USER_DOES_NOT_RECOGNISE_PAYMENT_ID")) {
            g gVarD32 = pixAuthorisationRejectReasonScreen.d();
            gVarD32.H2(gVarD32.o, new l(29));
        }
        return Unit.f186387a;
    }
}
