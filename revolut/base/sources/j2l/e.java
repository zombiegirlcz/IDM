package j2l;

import a2l.p;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.TravelStatusPartnerActionBottomSheetScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelStatusPartnerActionBottomSheetScreen f170910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170910w = travelStatusPartnerActionBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f170910w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f170910w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        p pVar = (p) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(pVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelStatusPartnerActionBottomSheetScreen travelStatusPartnerActionBottomSheetScreen = this.f170910w;
        switch (i) {
            case 0:
                p action = (p) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.a aVar2 = (com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.a) ((g) travelStatusPartnerActionBottomSheetScreen.O.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                aVar2.C2(new TravelStatusPartnerActionBottomSheetScreenContract$OutputData.Action(action));
                break;
            default:
                p action2 = (p) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.a aVar4 = (com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet.a) ((g) travelStatusPartnerActionBottomSheetScreen.O.getValue());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(action2, "action");
                aVar4.C2(new TravelStatusPartnerActionBottomSheetScreenContract$OutputData.Action(action2));
                break;
        }
        return Unit.f186387a;
    }
}
