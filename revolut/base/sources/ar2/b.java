package ar2;

import androidx.lifecycle.Lifecycle;
import elm.g;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xu.e f8503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xu.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f8503w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f8503w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        int i2 = 1;
        c cVar = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                if (cVar.f8506c.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED)) {
                    g gVar = p0.f264002b;
                    a aVar2 = new a(cVar, this.f8503w, continuation, i2);
                    this.u = 1;
                    if (e0.J(gVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
        } catch (Throwable throwable) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
            er2.a aVar3 = cVar.f8505b;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            aVar3.f128528a.onNext(throwable);
        }
        return Unit.f186387a;
    }
}
