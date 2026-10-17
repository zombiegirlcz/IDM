package tse;

import blj.t;
import ep6.m;
import ep6.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pfm.r;
import vkm.q;
import vkm.q0;
import vkm.z1;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f274099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f274100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f274101y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274100x = iVar;
        this.f274101y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f274100x, this.f274101y, continuation, 0);
                dVar.f274099w = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f274100x, this.f274101y, continuation, 1);
                dVar2.f274099w = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f274100x, this.f274101y, continuation, 2);
                dVar3.f274099w = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        String str = this.f274101y;
        i iVar = this.f274100x;
        Continuation continuation = null;
        switch (i) {
            case 0:
                m mVar = (m) this.f274099w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    if (mVar instanceof ep6.j) {
                        iVar.f274112r.a();
                        z1 z1Var = iVar.f274113s;
                        this.f274099w = null;
                        this.v = 1;
                        if (z1Var.emit(str, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.f274099w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    n nVar = iVar.o;
                    yo6.d dVar = yo6.d.TICKETOR;
                    ep6.e eVar = n.Companion;
                    q.G(new q0(nVar.I1(str, dVar, null), new d(iVar, str, continuation, 0), 1), coroutineScope);
                    Flow flowF1 = iVar.o.F1();
                    t tVar = new t(iVar, 23);
                    this.f274099w = null;
                    this.v = 1;
                    Object objCollect = flowF1.collect(new tnb.j(tVar, 19), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        o.b(obj2);
                        m.Companion companion = yhm.m.INSTANCE;
                        r rVarD = iVar.f274108m.d(str);
                        this.f274099w = null;
                        this.v = 1;
                        if (nim.a.a(rVarD, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = o.a(th10);
                }
                return new yhm.m(objA);
        }
    }
}
