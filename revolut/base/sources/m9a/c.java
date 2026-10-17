package m9a;

import com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.PixAuthorisationRejectReasonScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixAuthorisationRejectReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixAuthorisationRejectReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD3 = pixAuthorisationRejectReasonScreen.d3();
                gVarD3.C2(new e(((d) ((j2) gVarD3.o.f22677a).getValue()).f203674a));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pixAuthorisationRejectReasonScreen.d3().B2();
                break;
        }
        return Unit.f186387a;
    }
}
