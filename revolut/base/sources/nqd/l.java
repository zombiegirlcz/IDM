package nqd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f218415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CategorisationFilter f218416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f218417y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, List list, CategorisationFilter categorisationFilter, List list2, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f218415w = list;
        this.f218416x = categorisationFilter;
        this.f218417y = list2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, this.f218415w, this.f218416x, this.f218417y, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list = (List) pair.f186385a;
        whf.p pVar = (whf.p) pair.f186386b;
        o oVar = this.v;
        return nim.a.v(new n1g.p(oVar.f218425s.a(this.f218415w, list, pVar.f297646a), oVar, 21), new kwg.e(list, this.f218415w, pVar, this.f218416x, this.f218417y, 9));
    }
}
