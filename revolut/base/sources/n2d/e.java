package n2d;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f211522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211522w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f211522w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f211522w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((AlertItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.f211522w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m1d.a aVar2 = fVar.d;
                Object i2 = ((p) obj3).getI();
                Intrinsics.i(i2, "null cannot be cast to non-null type com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext");
                aVar2.f3((AlertsWidgetContext) i2);
                break;
            default:
                AlertItem alertItem = (AlertItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fVar.d.e3(alertItem);
                break;
        }
        return Unit.f186387a;
    }
}
