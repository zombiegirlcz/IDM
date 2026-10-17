package nqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f218421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f218421w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, this.f218421w, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CategorisationFilter categorisationFilter = (CategorisationFilter) pair.f186385a;
        fo3.c cVar = (fo3.c) pair.f186386b;
        o oVar = this.v;
        return xam.a.h(new m(oVar, cVar, categorisationFilter, this.f218421w, null), wzi.a.a(oVar.o, cVar.f136801a, hzi.c.RECURRING, null, 4));
    }
}
