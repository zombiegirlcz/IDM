package gp3;

import aw0.n6;
import com.revolut.data.model.Data;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.feature.structured_note.details.api.navigation.PayoutScenarioDestination;
import iel.z;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CorporateEventDetailsController f145239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(CorporateEventDetailsController corporateEventDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f145239w = corporateEventDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f145239w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f145239w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f145239w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            default:
                k kVar4 = new k(this.f145239w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        kp3.b bVar;
        int i = this.u;
        CorporateEventDetailsController corporateEventDetailsController = this.f145239w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE3 = corporateEventDetailsController.d();
                Intrinsics.h(model);
                com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar2 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                d dVar = obj3 instanceof d ? (d) obj3 : null;
                int i2 = dVar == null ? -1 : o.f145241a[dVar.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        aVar2.I2();
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar2.J2();
                    }
                }
                return Unit.f186387a;
            case 1:
                um0 model2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE32 = corporateEventDetailsController.d();
                Intrinsics.h(model2);
                com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar4 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID")) {
                    Object obj4 = model2.d;
                    kp3.a aVar5 = obj4 instanceof kp3.a ? (kp3.a) obj4 : null;
                    iel.a aVar6 = aVar5 != null ? aVar5.f188164a : null;
                    iel.h hVar = aVar6 instanceof iel.h ? (iel.h) aVar6 : null;
                    if (hVar != null && hVar.d != null) {
                        aVar4.I2();
                    }
                }
                return Unit.f186387a;
            case 2:
                um0 model3 = (um0) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE33 = corporateEventDetailsController.d();
                Intrinsics.h(model3);
                com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar8 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE33;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                if (Intrinsics.f(model3.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID")) {
                    aVar8.J2();
                }
                return Unit.f186387a;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE34 = corporateEventDetailsController.d();
                Intrinsics.h(clickData);
                com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar10 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE34;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "CORPORATE_EVENT_NOTE_PAYOUT_SCENARIOS_LINK_ID")) {
                    Data data = ((b) ((j2) aVar10.u.f22677a).getValue()).f145226a;
                    iel.i iVarA = (data == null || (cVar = (c) data.getContent()) == null || (bVar = cVar.f145229a) == null) ? null : bVar.a();
                    z zVar = iVarA instanceof z ? (z) iVarA : null;
                    if (zVar != null) {
                        aVar10.C1(new PayoutScenarioDestination(zVar.i()));
                    }
                }
                return Unit.f186387a;
        }
    }
}
