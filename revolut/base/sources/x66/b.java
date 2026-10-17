package x66;

import com.revolut.data.model.Data;
import gim.i;
import go.g;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rd0.e;
import vkm.q;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk5.a f303047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, wk5.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f303047w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f303047w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (list.size() >= 4) {
            return new g(new Data(d0.V0(list, 4), null, false, 6, null), 2);
        }
        d dVar = this.v;
        return q.Q(e.b(xv5.c.b(dVar.f303049b)), new x4k.c((Continuation) null, dVar, list, this.f303047w, 1));
    }
}
