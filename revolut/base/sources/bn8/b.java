package bn8;

import an4.f;
import blh.y;
import com.revolut.data.model.Data;
import gim.i;
import go.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nj8.n;
import w4l.h;
import wkm.l;
import yhm.o;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = ((Boolean) obj2).booleanValue();
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((b) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!z) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        d dVar = this.v;
        xcd.a aVar2 = dVar.f17124b;
        h loadingStrategy = h.f294642c;
        vkm.d dVarA = aVar2.a(loadingStrategy);
        l lVarK = ((n) dVar.f17123a).k(null, loadingStrategy);
        an8.b bVar = dVar.f17125c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.i(dVarA, lVarK, nim.a.v(ijb.a.a(bVar.f6576b, ncd.h.YOUTH, null, null, loadingStrategy, 6), new f(bVar, 2))), new y(dVar, 25));
    }
}
