package g48;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f140396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f140397x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140396w = r0Var;
        this.f140397x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f140396w, this.f140397x, continuation, 0);
            case 1:
                return new o0(this.f140396w, this.f140397x, continuation, 1);
            default:
                return new o0(this.f140396w, this.f140397x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        boolean z = this.f140397x;
        r0 r0Var = this.f140396w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        k38.d dVar = r0Var.f140406c;
                        this.v = 1;
                        w4l.f fVar = ((c48.g) dVar).k;
                        Object obj3 = Unit.f186387a;
                        Object objA = nim.a.a(fVar.g(obj3, z), this);
                        if (objA == aVar) {
                            obj3 = objA;
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
                    return Unit.f186387a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    return null;
                }
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        k38.d dVar2 = r0Var.f140406c;
                        this.v = 1;
                        w4l.f fVar2 = ((c48.g) dVar2).f21114l;
                        Object obj4 = Unit.f186387a;
                        Object objA2 = nim.a.a(fVar2.g(obj4, z), this);
                        if (objA2 == aVar2) {
                            obj4 = objA2;
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
                    return Unit.f186387a;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var2);
                    return null;
                }
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarV = ue0.e.v(r0Var.e.l0(z));
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar3) {
                        return aVar3;
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
