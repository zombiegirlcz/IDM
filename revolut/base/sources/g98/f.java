package g98;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu6.p;
import nj8.n;
import yhm.o;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ j49.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f141503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j49.i iVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f141503w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f141503w, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j49.i iVar = this.v;
        boolean zF = Intrinsics.f(iVar.f171328a, ProductId.YOUTH.getId());
        k kVar = this.f141503w;
        if (zF) {
            jt0.b bVar = kVar.e;
            String productAccountId = iVar.f171329b;
            Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
            n nVar = (n) ((hj8.a) bVar.f178265b);
            w4l.h hVar = w4l.h.f294642c;
            return nim.a.v(nim.a.v(zi0.c.w(nim.a.v(u0.m(nVar.k(null, hVar), ((wsg.b) bVar.f178266c).b(hVar)), new m11.h(bVar, 23))), new p(productAccountId, 12)), new e(list, kVar));
        }
        List<c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (c cVar : list2) {
            arrayList.add(k.h(kVar, cVar.f141499b, cVar.f141498a));
        }
        return new go.g(zi0.c.P(arrayList, false, null, 3), 2);
    }
}
