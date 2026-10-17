package x2g;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import d3g.b0;
import d3g.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesPickupDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesPickupDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        Intrinsics.h(textData);
        o oVar = (o) lVarH3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        String string = textData.f52598b.toString();
        String str = textData.f52597a;
        if (a0.H(str, "DEPENDANT_FIELD_", false)) {
            String string2 = d0.f0(str, 0, 16).toString();
            oVar.y2(new b0(string2, string, 2), new wsg.j(string2, 12), new wsg.j(string, 13));
        } else {
            oVar.y2(new c0(textData, string, 2), new vqc.l(textData, 1), new wsg.j(string, 14));
        }
        return Unit.f186387a;
    }
}
