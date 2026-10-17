package v5e;

import com.revolut.data.model.Data;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m5e.l;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a f286207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f286207w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f286207w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f286207w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((x4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a aVar = this.f286207w;
        switch (i) {
            case 0:
                x4e.d dVar = (x4e.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f88911r, new l(dVar, 1));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f88911r, new uz7.d(data, 14));
                break;
        }
        return Unit.f186387a;
    }
}
