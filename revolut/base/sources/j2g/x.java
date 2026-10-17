package j2g;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import zhm.d0;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ VoucherSmallTileDelegate.Model u;
    public final /* synthetic */ y v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(VoucherSmallTileDelegate.Model model, y yVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.f53623w;
        boolean z = obj3 instanceof TravelExperiencesSummary;
        y yVar = this.v;
        if (z) {
            TravelExperiencesSummary travelExperiencesSummary = (TravelExperiencesSummary) obj3;
            String str = travelExperiencesSummary.f93201a;
            String str2 = (String) d0.d0(travelExperiencesSummary.f93203c);
            yVar.C2(new j(str2 != null ? new TravelExperiencePreview(travelExperiencesSummary.f93202b, str2, null) : null, null, str));
        } else {
            boolean z3 = obj3 instanceof n2g.a;
            TravelExperienceDatesSelection rangeDateSelection = TravelExperienceDatesSelection.NoDatesSelection.f92906a;
            if (z3) {
                n2g.a aVar2 = (n2g.a) obj3;
                TravelSearchDestination travelSearchDestination = aVar2.f211539a;
                yVar.C1(new TravelExperiencesDestination.ExperiencesSearchResults(travelSearchDestination.f92888a, travelSearchDestination.f92889b, rangeDateSelection, z0.h(aVar2.f211540b.f92809a)));
            } else if (obj3 instanceof nyf.c) {
                nyf.c cVar = (nyf.c) obj3;
                String str3 = cVar.f220866a;
                nyf.a aVar3 = cVar.e;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                LocalDate localDate = aVar3.f220862a;
                LocalDate localDate2 = aVar3.f220863b;
                if (localDate != null && localDate2 == null) {
                    DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay, "toDateTimeAtStartOfDay(...)");
                    rangeDateSelection = new TravelExperienceDatesSelection.SingleDateSelection(dateTimeAtStartOfDay);
                } else if (localDate == null && localDate2 != null) {
                    DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay2, "toDateTimeAtStartOfDay(...)");
                    rangeDateSelection = new TravelExperienceDatesSelection.SingleDateSelection(dateTimeAtStartOfDay2);
                } else if (localDate != null && localDate.equals(localDate2)) {
                    DateTime dateTimeAtStartOfDay3 = localDate.toDateTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay3, "toDateTimeAtStartOfDay(...)");
                    rangeDateSelection = new TravelExperienceDatesSelection.SingleDateSelection(dateTimeAtStartOfDay3);
                } else if (localDate != null && localDate2 != null) {
                    DateTime dateTimeAtStartOfDay4 = localDate.toDateTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay4, "toDateTimeAtStartOfDay(...)");
                    DateTime dateTimeAtStartOfDay5 = localDate2.toDateTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeAtStartOfDay5, "toDateTimeAtStartOfDay(...)");
                    rangeDateSelection = new TravelExperienceDatesSelection.RangeDateSelection(dateTimeAtStartOfDay4, dateTimeAtStartOfDay5);
                }
                yVar.C2(new j(new TravelExperiencePreview(cVar.f220867b, cVar.d, null), rangeDateSelection, str3));
            }
        }
        return Unit.f186387a;
    }
}
