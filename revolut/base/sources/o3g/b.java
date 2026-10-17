package o3g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesDatesSelectionScreen f221803w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TravelExperiencesDatesSelectionScreen travelExperiencesDatesSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221803w = travelExperiencesDatesSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f221803w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f221803w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((DateTime) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TravelExperienceDatesSelection singleDateSelection;
        int i = this.u;
        TravelExperiencesDatesSelectionScreen travelExperiencesDatesSelectionScreen = this.f221803w;
        switch (i) {
            case 0:
                DateTime selectedDate = (DateTime) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) travelExperiencesDatesSelectionScreen.R.getValue();
                Intrinsics.h(selectedDate);
                com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a aVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a) iVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                DateTime dateTimeWithTimeAtStartOfDay = selectedDate.withTimeAtStartOfDay();
                int i2 = k.f221817a[aVar2.f93164p.f93162b.ordinal()];
                if (i2 == 1) {
                    Intrinsics.h(dateTimeWithTimeAtStartOfDay);
                    singleDateSelection = new TravelExperienceDatesSelection.SingleDateSelection(dateTimeWithTimeAtStartOfDay);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.h(dateTimeWithTimeAtStartOfDay);
                    TravelExperienceDatesSelection travelExperienceDatesSelection = ((f) aVar2.t2()).e;
                    if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
                        DateTime dateTime = ((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a;
                        singleDateSelection = dateTimeWithTimeAtStartOfDay.isBefore(dateTime) ? new TravelExperienceDatesSelection.RangeDateSelection(dateTimeWithTimeAtStartOfDay, dateTime) : new TravelExperienceDatesSelection.RangeDateSelection(dateTime, dateTimeWithTimeAtStartOfDay);
                    } else {
                        if (!(travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) && !(travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        singleDateSelection = new TravelExperienceDatesSelection.SingleDateSelection(dateTimeWithTimeAtStartOfDay);
                    }
                }
                aVar2.x2(new j1g.e(singleDateSelection, 1));
                return Unit.f186387a;
            default:
                String menuId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) travelExperiencesDatesSelectionScreen.R.getValue();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a aVar4 = (com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a) iVar2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("MENU_ITEM_ID_CLEAR")) {
                    aVar4.x2(new o2g.f(11));
                }
                return Unit.f186387a;
        }
    }
}
