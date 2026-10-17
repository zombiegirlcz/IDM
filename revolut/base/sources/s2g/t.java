package s2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionAvailability;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceLanguageSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f259328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TravelExperienceOptionSelectionV2 f259329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, CoroutineScope coroutineScope, TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2, Continuation continuation) {
        super(1, continuation);
        this.v = wVar;
        this.f259328w = coroutineScope;
        this.f259329x = travelExperienceOptionSelectionV2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f259328w, this.f259329x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TravelExperienceOptionSelection optionWithTimes;
        w wVar = this.v;
        u2g.a aVar = wVar.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            s15.j jVar = new s15.j(this.f259328w, wVar, this.f259329x, (Continuation) null, 1);
            this.u = 1;
            obj2 = wVar.p2(this, jVar);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Object obj4 = list.get(1);
        j60.a.v(wVar.f259333s, false, null, 3);
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionAvailability");
        TravelExperienceAvailabilitySelection.Availability availability = new TravelExperienceAvailabilitySelection.Availability((TravelExperiencesOptionAvailability) obj3);
        TravelExperienceOptionSelectionV2 selection = ((j) wVar.t2()).e;
        ((u2g.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        if (selection instanceof TravelExperienceOptionSelectionV2.Option) {
            optionWithTimes = new TravelExperienceOptionSelection.Option(((TravelExperienceOptionSelectionV2.Option) selection).f93096a.f92869a);
        } else if (selection instanceof TravelExperienceOptionSelectionV2.OptionWithTimes) {
            TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes2 = (TravelExperienceOptionSelectionV2.OptionWithTimes) selection;
            optionWithTimes = new TravelExperienceOptionSelection.OptionWithTimes(optionWithTimes2.f93097a.f92869a, optionWithTimes2.f93098b);
        } else {
            if (!(selection instanceof TravelExperienceOptionSelectionV2.NoSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            optionWithTimes = TravelExperienceOptionSelection.NoSelection.f92912a;
        }
        TravelExperienceOptionSelection travelExperienceOptionSelection = optionWithTimes;
        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion>");
        List list2 = (List) obj4;
        TravelExperienceDatesSelection.SingleDateSelection singleDateSelectionA = ((u2g.b) aVar).a(((j) wVar.t2()).e);
        TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = ((j) wVar.t2()).d.f240825b;
        TravelExperienceOptionSelectionV2 selection2 = ((j) wVar.t2()).e;
        ((u2g.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(selection2, "selection");
        boolean z = selection2 instanceof TravelExperienceOptionSelectionV2.Option;
        TravelExperienceLanguageSelection selected = TravelExperienceLanguageSelection.NoSelection.f92910a;
        if (z) {
            TravelExperiencesOptionV2.Language language = ((TravelExperienceOptionSelectionV2.Option) selection2).f93096a.f92871c;
            if (language != null) {
                selected = new TravelExperienceLanguageSelection.Selected(new TravelExperienceSelectedLanguage(language.f92872a, language.f92873b, f0.f322471a, language.f92874c));
            }
        } else {
            if (!(selection2 instanceof TravelExperienceOptionSelectionV2.OptionWithTimes)) {
                if (selection2 instanceof TravelExperienceOptionSelectionV2.NoSelection) {
                    throw new IllegalStateException("Cannot provide language selection from NoSelection type");
                }
                throw new NoWhenBranchMatchedException();
            }
            TravelExperiencesOptionV2.Language language2 = ((TravelExperienceOptionSelectionV2.OptionWithTimes) selection2).f93097a.f92871c;
            if (language2 != null) {
                selected = new TravelExperienceLanguageSelection.Selected(new TravelExperienceSelectedLanguage(language2.f92872a, language2.f92873b, f0.f322471a, language2.f92874c));
            }
        }
        wVar.v2(new l(availability, travelExperienceOptionSelection, list2, singleDateSelectionA, travelExperienceVisitorsSelection, selected));
        return Unit.f186387a;
    }
}
