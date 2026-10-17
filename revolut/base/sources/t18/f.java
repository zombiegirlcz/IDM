package t18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f267214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f267214w = linkedHashSet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f267214w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar = this.v.f76433p;
            FeedFilter.ByAssetFilter byAssetFilter = new FeedFilter.ByAssetFilter(this.f267214w);
            this.u = 1;
            if (hVar.l(byAssetFilter, this) == aVar) {
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
