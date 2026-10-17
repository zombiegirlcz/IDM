package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gim.i f261544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ParcelableDestination f261545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ApmDeeplinkPayload.Apm f261546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(ApmDeeplinkPayload.Apm apm, ParcelableDestination parcelableDestination, Continuation continuation, Function1 function1, k kVar) {
        super(2, continuation);
        this.v = kVar;
        this.f261544w = (gim.i) function1;
        this.f261545x = parcelableDestination;
        this.f261546y = apm;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f261546y, this.f261545x, continuation, this.f261544w, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        ApmDeeplinkPayload.Apm apm = this.f261546y;
        ParcelableDestination parcelableDestination = this.f261545x;
        ?? r72 = this.f261544w;
        k kVar = this.v;
        f fVar = new f(apm, parcelableDestination, null, r72, kVar);
        this.u = 1;
        Object objY2 = kVar.Y2(this, fVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
