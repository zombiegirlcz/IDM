package jta;

import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RaffleScreen f178439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RaffleScreen raffleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178439w = raffleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f178439w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f178439w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        bta.d dVar;
        String str;
        int i = this.u;
        RaffleScreen raffleScreen = this.f178439w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = raffleScreen.e3();
                Intrinsics.h(clickData);
                v vVar = (v) jVarE3;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                vVar.n2(new t0(vVar, clickData.f275445a, null, 4), new whi.b(6));
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = raffleScreen.e3();
                Intrinsics.h(id10);
                v vVar2 = (v) jVarE32;
                vVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("RAFFLE_INFO_MENU_ITEM")) {
                    com.revolut.feature.raffle.impl.data.models.b bVar = (com.revolut.feature.raffle.impl.data.models.b) ((e) ((j2) vVar2.f178467t.f22677a).getValue()).f178441b.getContent();
                    if (bVar != null && (dVar = bVar.d) != null && (str = dVar.d) != null) {
                        vVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    }
                } else if (id10.equals("RAFFLE_SHARE_MENU_ITEM")) {
                    vVar2.K2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
