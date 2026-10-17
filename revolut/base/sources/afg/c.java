package afg;

import cli.y;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.joda.time.DateTime;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsSuggestedExperiencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsSuggestedExperiencesScreen travelHotelsSuggestedExperiencesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsSuggestedExperiencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsSuggestedExperiencesScreen travelHotelsSuggestedExperiencesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) travelHotelsSuggestedExperiencesScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) travelHotelsSuggestedExperiencesScreen.d();
                y yVar = iVar.f4064t;
                cfi.g gVar = (cfi.g) zi0.c.I(((e) ((j2) yVar.f22677a).getValue()).f4051a);
                rei.e eVar = (rei.e) ((e) ((j2) yVar.f22677a).getValue()).f4053c.getContent();
                iVar.C1(new TravelExperiencesDestination.ExperiencesSearchResults(gVar.f23707a, gVar.f23708b, eVar != null ? new TravelExperienceDatesSelection.RangeDateSelection(new DateTime(oc.c.F(eVar.f253602a)), new DateTime(oc.c.F(eVar.f253603b))) : TravelExperienceDatesSelection.NoDatesSelection.f92906a));
                break;
        }
        return Unit.f186387a;
    }
}
