package hz2;

import com.revolut.feature.terms.api.model.Terms;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.cardagreements.screens.overview.a f157010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f157011x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar, CoroutineScope coroutineScope, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f157010w = aVar;
        this.f157011x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f157010w, this.f157011x, continuation, 0);
            default:
                return new z(this.f157010w, this.f157011x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar2 = this.f157010w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = aVar2.f64819r.f(true);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        aVar2.C2(m.f156999a);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                do3.n nVar = (do3.n) obj2;
                String str = null;
                if (!nVar.f116412h) {
                    String str2 = nVar.f116411g;
                    if (str2 != null && str2.length() != 0) {
                        str = str2;
                    }
                    aVar2.C2(new l(str));
                    return Unit.f186387a;
                }
                Iterable iterable = (Iterable) zi0.c.I(((k) ((j2) aVar2.f64821t.f22677a).getValue()).f156996a);
                ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(e0.g(this.f157011x, null, null, new y(aVar2, (Terms) it8.next(), null, 0), 3));
                }
                this.v = 2;
                if (e0.h(arrayList, this) == aVar) {
                    return aVar;
                }
                aVar2.C2(m.f156999a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.card_management.impl.cardagreements.screens.overview.a aVar4 = this.f157010w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Iterable iterable2 = (Iterable) zi0.c.I(((k) ((j2) aVar4.f64821t.f22677a).getValue()).f156996a);
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(iterable2, 10));
                    Iterator it9 = iterable2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(e0.g(this.f157011x, null, null, new y(aVar4, (Terms) it9.next(), null, 1), 3));
                    }
                    this.v = 1;
                    if (e0.h(arrayList2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar4.C2(m.f156999a);
                return Unit.f186387a;
        }
    }
}
