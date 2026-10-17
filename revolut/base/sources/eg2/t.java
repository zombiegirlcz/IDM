package eg2;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f125538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f125539x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125538w = uVar;
        this.f125539x = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f125538w, this.f125539x, continuation, 0);
            case 1:
                return new t(this.f125538w, this.f125539x, continuation, 1);
            default:
                return new t(this.f125538w, this.f125539x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wf2.e eVar = this.f125538w.f125541q;
                String str = this.f125539x.f125534a;
                this.v = 1;
                Serializable serializableE = eVar.e(str, this);
                return serializableE == aVar ? aVar : serializableE;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar = this.f125538w;
                t tVar = new t(uVar, this.f125539x, null, 0);
                this.v = 1;
                Object objT = do3.q.t(uVar, tVar, this);
                return objT == aVar2 ? aVar2 : objT;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar2 = this.f125538w;
                an1.d dVar = new an1.d(uVar2, 15);
                t tVar2 = new t(uVar2, this.f125539x, null, 1);
                this.v = 1;
                Object objQ = n14.k.Q(uVar2, null, null, dVar, tVar2, this, 3);
                return objQ == aVar3 ? aVar3 : objQ;
        }
    }
}
