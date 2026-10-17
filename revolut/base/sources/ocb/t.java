package ocb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f224192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224192w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f224192w, continuation, 0);
                tVar.v = ((Boolean) obj2).booleanValue();
                return tVar;
            case 1:
                t tVar2 = new t(this.f224192w, continuation, 1);
                tVar2.v = ((Boolean) obj2).booleanValue();
                return tVar2;
            case 2:
                t tVar3 = new t(this.f224192w, continuation, 2);
                tVar3.v = ((Boolean) obj2).booleanValue();
                return tVar3;
            case 3:
                t tVar4 = new t(this.f224192w, continuation, 3);
                tVar4.v = ((Boolean) obj2).booleanValue();
                return tVar4;
            case 4:
                t tVar5 = new t(this.f224192w, continuation, 4);
                tVar5.v = ((Boolean) obj2).booleanValue();
                return tVar5;
            default:
                t tVar6 = new t(this.f224192w, continuation, 5);
                tVar6.v = ((Boolean) obj2).booleanValue();
                return tVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((t) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f224192w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new lph.c(z, 28));
                break;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new lph.c(z3, 29));
                break;
            case 2:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new u(z4, 0));
                break;
            case 3:
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new u(z6, 1));
                break;
            case 4:
                boolean z11 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new u(z11, 2));
                break;
            default:
                boolean z12 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new u(z12, 3));
                break;
        }
        return Unit.f186387a;
    }
}
