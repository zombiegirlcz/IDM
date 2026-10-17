package p5a;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ l u;
    public final /* synthetic */ hrf.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardOwnerWithStats f233063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f233064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PushToCardTransferData f233065y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, hrf.h hVar, CardOwnerWithStats cardOwnerWithStats, dj0.d dVar, PushToCardTransferData pushToCardTransferData, Continuation continuation) {
        super(1, continuation);
        this.u = lVar;
        this.v = hVar;
        this.f233063w = cardOwnerWithStats;
        this.f233064x = dVar;
        this.f233065y = pushToCardTransferData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.u, this.v, this.f233063w, this.f233064x, this.f233065y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        hrf.h hVar = this.v;
        return l.f(hVar != null ? hVar.b() : false, this.f233063w, this.f233064x, this.f233065y);
    }
}
