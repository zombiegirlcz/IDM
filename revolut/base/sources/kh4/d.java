package kh4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f184048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mv3.i f184049x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, mv3.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184048w = gVar;
        this.f184049x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f184048w, this.f184049x, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f184048w, this.f184049x, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        mv3.i iVar = this.f184049x;
        g gVar = this.f184048w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mv3.h hVar = (mv3.h) data.getContent();
                if (hVar != null) {
                    gVar.f184056c.f(g.e(iVar), hVar);
                    gVar.g(hVar);
                }
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mv3.h hVar2 = (mv3.h) data2.getContent();
                if (hVar2 != null) {
                    ne0.j jVar = gVar.f184056c;
                    jVar.f(g.e(iVar), hVar2);
                    jVar.f("OFFER_PARAMETERS_CACHE_KEY", hVar2.f209124a);
                    gVar.g(hVar2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
