package z9m;

import cam.t;
import dam.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f320515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320515w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f320515w, continuation, 0);
            case 1:
                return new b(this.f320515w, continuation, 1);
            default:
                return new b(this.f320515w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((cam.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((cam.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        e eVar = this.f320515w;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar = eVar.f320521b;
                    this.v = 1;
                    p0 p0Var = p0.f264001a;
                    if (e0.J(zkm.o.f323119a, new a(kVar, continuation, i2), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    t tVar = eVar.f320522c;
                    this.v = 1;
                    tVar.getClass();
                    p0 p0Var2 = p0.f264001a;
                    Object objJ = e0.J(zkm.o.f323119a, new cam.j(tVar, null, 1), this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    s sVar = eVar.f320520a;
                    dam.m mVar = dam.m.USER_AUTHENTICATED;
                    this.v = 1;
                    if (sVar.i(mVar, null, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
