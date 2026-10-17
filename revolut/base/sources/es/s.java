package es;

import com.revolut.biometric_verification.impl.ui.flow.dialogs.SuccessUploadDialogPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nq.j0;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128769w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f128769w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f128769w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((j0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = this.f128769w;
        switch (i) {
            case 0:
                j0 j0Var = (j0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(j0Var);
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var.a().a() instanceof SuccessUploadDialogPayload) {
                    dVar.C2(new oq.d(dVar.W2()));
                }
                break;
        }
        return Unit.f186387a;
    }
}
