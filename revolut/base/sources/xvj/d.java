package xvj;

import com.revolut.retail.feature.api.trips.models.Trip;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f309286w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eVar;
        this.f309286w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, this.f309286w, continuation, 0);
            default:
                return new d(this.v, this.f309286w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.v;
        String str = this.f309286w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(Long.TYPE, eVar.d, str);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) eVar.f309288b.get("trips_cache");
                if (list != null) {
                    x4l.c cVar = eVar.f;
                    Unit unit = Unit.f186387a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!Intrinsics.f(((Trip) obj3).f99263a, str)) {
                            arrayList.add(obj3);
                        }
                    }
                    cVar.g(unit, arrayList);
                }
                eVar.f309287a.d(str);
                return Unit.f186387a;
        }
    }
}
