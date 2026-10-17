package au;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f9098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a f9099x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(y0 y0Var, com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9098w = y0Var;
        this.f9099x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f9098w, this.f9099x, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f9098w, this.f9099x, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar = this.f9099x;
        y0 y0Var = this.f9098w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof l1) && Intrinsics.f(((l1) n1Var).f216190a, y0Var.f216244b)) {
                    com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.I2(aVar, hu.d.f155472a);
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var2 instanceof l1) && Intrinsics.f(((l1) n1Var2).f216190a, y0Var.f216244b)) {
                    com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.J2(aVar, hu.h.f155474a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
