package cza;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ ty0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f110176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ty0.a aVar, g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f110176w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f110176w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        String str = this.v.f275445a;
        g gVar = this.f110176w;
        if (!gVar.o.y1(str)) {
            return gVar.C1(new ExternalDestination.Browser(str, null));
        }
        x xVar = gVar.o;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, null, null, this, 6);
        return objX1 == aVar ? aVar : objX1;
    }
}
