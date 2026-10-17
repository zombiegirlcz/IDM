package xd1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LitePosFlow f304210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(LitePosFlow litePosFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304210w = litePosFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f304210w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f304210w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LitePosFlow litePosFlow = this.f304210w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = litePosFlow.e3();
                Intrinsics.h(id10);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) dVarE3;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals(LitePosFlowContract$Step.Catalogue.f60732a.getF94249a())) {
                    gVar.l2(new m(gVar, null, 2), new yi5.b(26));
                } else {
                    gVar.H2(gVar.A, new wsg.j(id10, 24));
                }
                break;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = LitePosFlow.P;
                litePosFlow.d3().e.i0(str);
                break;
        }
        return Unit.f186387a;
    }
}
