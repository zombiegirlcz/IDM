package vyi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportSavedLoungesScreen f293334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AirportSavedLoungesScreen airportSavedLoungesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f293334w = airportSavedLoungesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f293334w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f293334w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        hxi.b bVar = (hxi.b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(bVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportSavedLoungesScreen airportSavedLoungesScreen = this.f293334w;
        switch (i) {
            case 0:
                hxi.b loungeItemPayload = (hxi.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) airportSavedLoungesScreen.Y.getValue();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(loungeItemPayload, "loungeItemPayload");
                rVar.v2(new j(loungeItemPayload.f156600a, loungeItemPayload.f156601b));
                break;
            default:
                hxi.b bVar = (hxi.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = (r) airportSavedLoungesScreen.Y.getValue();
                String loungeId = bVar.f156600a;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(loungeId, "loungeId");
                rVar2.n2(new vnl.o(rVar2, loungeId, null, 18), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
