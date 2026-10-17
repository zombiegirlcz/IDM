package pkf;

import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fof.b f237105w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, fof.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = q0Var;
        this.f237105w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p0(this.v, this.f237105w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wk5.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q0 q0Var = this.v;
        fof.b bVar = this.f237105w;
        if (i == 0) {
            yhm.o.b(obj2);
            vbj.c cVar = q0Var.f237114m;
            String transactionId = bVar.f136946a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            pfm.h hVar = new pfm.h(new v3e.t(cVar, "STORAGE_KEY_CANCEL_BUTTON_VISIBLE_FOR_ADDITIONAL_INFO_DEPOSIT" + transactionId, 5), 2);
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
        if (bVar.f136947b != null && (iVar = bVar.d) != null) {
            int i2 = o0.f237102a[iVar.ordinal()];
            km5.f fVar = i2 != 1 ? i2 != 2 ? null : km5.f.LEGAL_ENTITY_ID : km5.f.DATE_PLACE_OF_BIRTH;
            if (fVar != null) {
                String str = bVar.f136947b;
                String str2 = bVar.f136948c;
                if (str2 == null) {
                    str2 = "";
                }
                q0Var.N2(q0Var.o2(new lm5.a(new TfrValidationFlowContract$InputData(str, fVar, str2, null))), ModalDestination.Style.POPUP.f98311a, new pij.d1(q0Var, 5));
            }
        }
        return Unit.f186387a;
    }
}
