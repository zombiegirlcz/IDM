package oi4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f225442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225442w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f225442w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f225442w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((dn3.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f225442w;
        switch (i) {
            case 0:
                dn3.d dVar = (dn3.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar instanceof dn3.b) {
                    pVar.x2(new ofg.a(pVar, dVar, 8));
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(n1Var instanceof l1) && (n1Var instanceof m1)) {
                    pVar.v2(new f(true));
                } else {
                    pVar.v2(new f(false));
                }
                break;
        }
        return Unit.f186387a;
    }
}
