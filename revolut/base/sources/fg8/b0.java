package fg8;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f134910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134910w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f134910w, continuation, 0);
            default:
                return new b0(this.f134910w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.f134910w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        kd8.x xVar = c0Var.f134912b;
                        this.v = 1;
                        x4l.c cVar = ((gd8.x) xVar.f182859a).d;
                        Object obj3 = Unit.f186387a;
                        Object objD = cVar.d(obj3, true, this);
                        if (objD != aVar) {
                            objD = obj3;
                        }
                        if (objD == aVar) {
                            obj3 = objD;
                        }
                        if (obj3 == aVar) {
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        kd8.x xVar2 = c0Var.f134912b;
                        this.v = 1;
                        x4l.c cVar2 = ((gd8.x) xVar2.f182859a).d;
                        Object obj4 = Unit.f186387a;
                        Object objD2 = cVar2.d(obj4, true, this);
                        if (objD2 != aVar2) {
                            objD2 = obj4;
                        }
                        if (objD2 == aVar2) {
                            obj4 = objD2;
                        }
                        if (obj4 == aVar2) {
                            return aVar2;
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
        }
    }
}
