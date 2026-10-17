package fg8;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f134936w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134936w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f134936w, continuation, 0);
            case 1:
                return new i(this.f134936w, continuation, 1);
            default:
                return new i(this.f134936w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f134936w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        hj8.a aVar2 = mVar.d;
                        this.v = 1;
                        if (((nj8.n) aVar2).n(true, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        kbb.c cVar = mVar.f134962w;
                        this.v = 1;
                        x4l.c cVar2 = ((ff8.i) ((ff8.e) cVar.f182549b)).e;
                        Object obj3 = Unit.f186387a;
                        Object objD = cVar2.d(obj3, true, this);
                        if (objD != aVar3) {
                            objD = obj3;
                        }
                        if (objD == aVar3) {
                            obj3 = objD;
                        }
                        if (obj3 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (Exception e2) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    xcd.a aVar5 = mVar.f134951g;
                    this.v = 1;
                    x4l.c cVar3 = aVar5.f304111a.d;
                    Object obj4 = Unit.f186387a;
                    Object objD2 = cVar3.d(obj4, true, this);
                    if (objD2 != aVar4) {
                        objD2 = obj4;
                    }
                    if (objD2 == aVar4) {
                        obj4 = objD2;
                    }
                    if (obj4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
