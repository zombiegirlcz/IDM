package jwf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransportHubTransitScreen f178976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TransportHubTransitScreen transportHubTransitScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178976w = transportHubTransitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f178976w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f178976w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f178976w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((TransitTicket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransportHubTransitScreen transportHubTransitScreen = this.f178976w;
        switch (i) {
            case 0:
                h parcel = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar = (g) transportHubTransitScreen.X.getValue();
                Intrinsics.h(parcel);
                n nVar = (n) gVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                TransportHubLocation transportHubLocation = ((e) nVar.t2()).f178977a;
                if ((transportHubLocation instanceof TransportHubLocation.Unknown) || (transportHubLocation instanceof TransportHubLocation.NoLocation)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Can't open section because no location was selected");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    if (!(transportHubLocation instanceof TransportHubLocation.Selected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.C1(new com.revolut.kompot.common.d(new TransitSectionScreen(new TransitSectionScreenContract$InputData(((TransportHubLocation.Selected) transportHubLocation).f92504a, new TextClause(parcel.f178982b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), parcel.f178981a)), 6));
                }
                return Unit.f186387a;
            case 1:
                TransitTicket ticket = (TransitTicket) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar2 = (g) transportHubTransitScreen.X.getValue();
                Intrinsics.h(ticket);
                n nVar2 = (n) gVar2;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(ticket, "ticket");
                yji.l.g2(nVar2, new TransitCheckoutScreen(new TransitCheckoutScreenContract$InputData(ticket)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
                return Unit.f186387a;
            default:
                d action = (d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar3 = (g) transportHubTransitScreen.X.getValue();
                Intrinsics.h(action);
                n nVar3 = (n) gVar3;
                nVar3.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                int i2 = j.f178984a[action.ordinal()];
                if (i2 == 1) {
                    nVar3.x2(new jt2.d(25));
                    nVar3.f178994t.k(Unit.f186387a);
                } else if (i2 == 2) {
                    ((lvf.c) nVar3.f178992r).b3(new jud.d(nVar3, 10));
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar3.v2(f.f178980a);
                }
                return Unit.f186387a;
        }
    }
}
