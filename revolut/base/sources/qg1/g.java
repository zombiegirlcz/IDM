package qg1;

import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f245626w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f245626w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f245626w, continuation, 0);
            default:
                return new g(this.f245626w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    k kVar = this.f245626w;
                    k7i.i iVar = kVar.f245628p;
                    String id10 = ((RetailCardWrapper) ((l) ((j2) kVar.u.f22677a).getValue()).f245633a).f64443a.f104693a;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    pfm.h hVarL = ((x) ((l93.f) iVar.f182069b)).l(id10);
                    this.v = 1;
                    if (nim.a.a(hVarL, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar2 = this.f245626w;
                    k7i.i iVar2 = kVar2.f245628p;
                    String id11 = ((RetailCardWrapper) ((l) ((j2) kVar2.u.f22677a).getValue()).f245633a).f64443a.f104693a;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(id11, "id");
                    pfm.h hVarF = ((x) ((l93.f) iVar2.f182069b)).F(id11);
                    this.v = 1;
                    if (nim.a.a(hVarF, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
