package s2g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesAvailabilityTimes;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesOptionsV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesOptionsV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object optionWithTimes;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarH3 = this.v.T2();
        Intrinsics.h(model);
        w wVar = (w) oVarH3;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int i = 14;
        Continuation continuation = null;
        if (a0.H(str, "PAYMENT_OPTIONS_BUTTON_ITEM_ID", false)) {
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2");
            TravelExperiencesOptionV2 travelExperiencesOptionV2 = (TravelExperiencesOptionV2) obj3;
            ArrayList<TravelExperiencesAvailabilityTimes> arrayList = travelExperiencesOptionV2.f92869a.f;
            if (arrayList.size() != 0) {
                for (TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes : arrayList) {
                    if (travelExperiencesAvailabilityTimes.f92857b) {
                        optionWithTimes = new TravelExperienceOptionSelectionV2.OptionWithTimes(travelExperiencesOptionV2, travelExperiencesAvailabilityTimes);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            optionWithTimes = new TravelExperienceOptionSelectionV2.Option(travelExperiencesOptionV2);
            wVar.x2(new ryd.i(optionWithTimes, 13));
            int size = arrayList.size();
            if (size < 0 || size >= 2) {
                wVar.l2(new u(wVar, null, 1), new yi5.b(26));
            } else {
                wVar.n2(new rhl.b(wVar, ((j) wVar.t2()).e, continuation, i), new whi.b(6));
            }
        } else if (a0.H(str, "BOTTOM_DIALOG_BUTTON_ITEM_ID", false) && (((j) wVar.t2()).e instanceof TravelExperienceOptionSelectionV2.OptionWithTimes)) {
            wVar.n2(new rhl.b(wVar, ((j) wVar.t2()).e, continuation, i), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
