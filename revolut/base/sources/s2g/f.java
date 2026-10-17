package s2g;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesOptionsV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesOptionsV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarH3 = this.v.T2();
        Intrinsics.h(model);
        final w wVar = (w) oVarH3;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption");
        final TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) obj3;
        if (((j) wVar.t2()).f259311a.contains(travelExperiencesOption)) {
            final int i = 0;
            wVar.x2(new Function1() { // from class: s2g.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            j updateState = (j) obj4;
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return j.a(updateState, d0.A0(((j) wVar.t2()).f259311a, travelExperiencesOption), null, null, null, null, false, 62);
                        default:
                            j updateState2 = (j) obj4;
                            Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                            return j.a(updateState2, d0.F0(travelExperiencesOption, ((j) wVar.t2()).f259311a), null, null, null, null, false, 62);
                    }
                }
            });
        } else {
            final int i2 = 1;
            wVar.x2(new Function1() { // from class: s2g.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            j updateState = (j) obj4;
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return j.a(updateState, d0.A0(((j) wVar.t2()).f259311a, travelExperiencesOption), null, null, null, null, false, 62);
                        default:
                            j updateState2 = (j) obj4;
                            Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                            return j.a(updateState2, d0.F0(travelExperiencesOption, ((j) wVar.t2()).f259311a), null, null, null, null, false, 62);
                    }
                }
            });
        }
        return Unit.f186387a;
    }
}
