package pkh;

import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DisclosuresController f237180w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DisclosuresController disclosuresController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237180w = disclosuresController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f237180w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f237180w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DisclosuresController disclosuresController = this.f237180w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) disclosuresController.M.getValue();
                Intrinsics.h(clickData);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVar.n2(new pdi.j(kVar, clickData, null, 22), new whi.b(6));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) disclosuresController.M.getValue();
                Intrinsics.h(clickData2);
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                kVar2.n2(new pdi.j(kVar2, clickData2, null, 22), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
