package pkf;

import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fof.e f237140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, fof.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = w0Var;
        this.f237140w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v0(this.v, this.f237140w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        fof.e eVar = this.f237140w;
        w0 w0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vbj.c cVar = w0Var.f237146n;
            String transactionId = eVar.f136949a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            pfm.h hVar = new pfm.h(new v3e.t(cVar, "STORAGE_KEY_CANCEL_BUTTON_VISIBLE_FOR_MESH_PENDING_DEPOSIT" + transactionId, 5), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            pfm.r rVarG0 = te0.w.g0(hVar);
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        w0Var.N2(w0Var.o2(new lm5.a(new TfrValidationFlowContract$InputData(eVar.f136950b, km5.f.MESH, null, null))), ModalDestination.Style.POPUP.f98311a, new pij.d1(w0Var, 6));
        return Unit.f186387a;
    }
}
