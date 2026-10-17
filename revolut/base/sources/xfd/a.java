package xfd;

import aii.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f305233w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f305233w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f305233w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(this.f305233w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a(this.f305233w, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
            default:
                a aVar4 = new a(this.f305233w, continuation, 3);
                aVar4.v = obj2;
                return aVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((a) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 2:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((a) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                return ((a) create((gfd.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f305233w;
        switch (i) {
            case 0:
                u uVar = (u) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                gVar.A2(uVar);
                return Unit.f186387a;
            case 1:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
            case 2:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
            default:
                gfd.b bVar = (gfd.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                gVar.f305240n.setValue(bVar);
                return Unit.f186387a;
        }
    }
}
