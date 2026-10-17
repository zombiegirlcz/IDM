package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.n1;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142065w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142065w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f142065w, continuation, 0);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.f142065w, continuation, 1);
                c0Var2.v = obj2;
                return c0Var2;
            default:
                c0 c0Var3 = new c0(this.f142065w, continuation, 2);
                c0Var3.v = obj2;
                return c0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142065w;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Continuation continuation = null;
                skm.e0.C(coroutineScope, null, null, new m(vVar, continuation, 3), 3);
                skm.e0.C(coroutineScope, null, null, new m(vVar, continuation, 4), 3);
                return skm.e0.C(coroutineScope, null, null, new m(vVar, continuation, 5), 3);
            case 1:
                String otp = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xai.a aVar3 = vVar.K;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(otp, "otp");
                aVar3.f303892b.mo3647trySendJP2dKIU(otp);
                z1 z1Var = aVar3.f303891a;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    vVar.T2(q89.f.SIGN_UP);
                }
                return Unit.f186387a;
        }
    }
}
