package t18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FeedFilter f267213w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar, FeedFilter feedFilter, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f267213w = feedFilter;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f267213w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar = this.v.f76433p;
            this.u = 1;
            if (hVar.l(this.f267213w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
