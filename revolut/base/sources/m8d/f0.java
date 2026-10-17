package m8d;

import aj0.m0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f203496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203496w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f203496w, continuation, 0);
            case 1:
                return new f0(this.f203496w, continuation, 1);
            default:
                return new f0(this.f203496w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        h0 h0Var = this.f203496w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    m0 m0Var = (m0) ((m) h0Var.t2()).f203514c.getContent();
                    aj0.j jVar = m0Var != null ? m0Var.e : null;
                    if (jVar == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Chat button must be visible only when content has 'chat' object");
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        return Unit.f186387a;
                    }
                    String str = jVar.f5359b;
                    if (str != null) {
                        h0Var.v2(new s(jVar.f5358a, str));
                    } else {
                        this.v = 1;
                        if (h0.y2(h0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    hg0.b bVar = h0Var.f203501s;
                    String str2 = h0Var.v.f86287a;
                    this.v = 1;
                    Object objA = ((hg0.c) bVar).f152043a.a(str2, this);
                    if (objA != aVar2) {
                        objA = Unit.f186387a;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    f0 f0Var = new f0(h0Var, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    this.v = 1;
                    if (skm.e0.J(fVar, f0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
