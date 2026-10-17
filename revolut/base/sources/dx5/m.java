package dx5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f120881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.f120881w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f120881w, continuation);
        mVar.v = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.f120881w;
        if (i == 0) {
            yhm.o.b(obj2);
            int i2 = 13;
            an1.d dVar = new an1.d(nVar, i2);
            a3b.h hVar = new a3b.h(nVar, i2);
            l lVar = new l(nVar, null);
            this.v = coroutineScope;
            this.u = 1;
            obj2 = n14.k.V(nVar, null, hVar, dVar, lVar, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.h hVar2 = (nii.h) obj2;
        if (hVar2 instanceof nii.g) {
            a3 a3Var = (a3) ((nii.g) hVar2).f216152a;
            if (a3Var != null) {
                nVar.v2(new f(a3Var.f272581b, a3Var.f272579a));
            } else {
                nVar.v2(new f(null, null));
            }
        }
        return Unit.f186387a;
    }
}
