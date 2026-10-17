package dze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c f121334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f121335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f121336y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f121334w = cVar;
        this.f121335x = str;
        this.f121336y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f121334w, this.f121335x, this.f121336y, continuation, 0);
            default:
                return new l(this.f121334w, this.f121335x, this.f121336y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    c0f.d dVar = this.f121334w.f90961p;
                    String id10 = this.f121336y;
                    if (id10 != null) {
                        Intrinsics.checkNotNullParameter(id10, "id");
                    } else {
                        id10 = null;
                    }
                    this.v = 1;
                    if (dVar.a(this.f121335x, id10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar2 = this.f121334w;
                String str2 = this.f121335x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ack.n nVar = new ack.n(19);
                    l lVar = new l(cVar2, str2, this.f121336y, null, 0);
                    str = str2;
                    this.v = 1;
                    cVar = cVar2;
                    if (n14.k.Q(cVar2, null, null, nVar, lVar, this, 3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    cVar = cVar2;
                    str = str2;
                }
                f fVar = new f(str);
                j jVar = com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c.Companion;
                cVar.C2(fVar);
                return Unit.f186387a;
        }
    }
}
