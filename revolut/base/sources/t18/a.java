package t18;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b f267211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267211w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f267211w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f267211w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = this.f267211w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.v, new t05.v(data, 5));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.v, new t05.v(data2, 6));
                break;
        }
        return Unit.f186387a;
    }
}
