package fuc;

import com.revolut.data.model.Data;
import gim.i;
import h93.f0;
import h93.r;
import ha3.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wtc.t;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f138175w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138175w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f138175w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f138175w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f138175w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    f0 card = (f0) obj3;
                    hVar.f138176p.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    r rVar = card.f;
                    if (rVar == r.ACTIVE || rVar == r.BLOCKED) {
                        if (!card.d && (card.R || card.S)) {
                            if (!t.a(card)) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                }
                return ((x) hVar.o).H(list2, arrayList, null);
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hVar.H2(hVar.f138178r, new fk4.o(data, 28));
                return Unit.f186387a;
        }
    }
}
