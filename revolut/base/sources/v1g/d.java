package v1g;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.m0;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCategoriesFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperiencesCategoriesFiltersScreen travelExperiencesCategoriesFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCategoriesFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        Intrinsics.h(model);
        i iVar = (i) gVarE3;
        y yVar = iVar.f285314q;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        TravelExperienceCategory travelExperienceCategory = obj3 instanceof TravelExperienceCategory ? (TravelExperienceCategory) obj3 : null;
        if (travelExperienceCategory != null) {
            String str = travelExperienceCategory.f92807a;
            Set setH1 = d0.h1(((e) ((j2) yVar.f22677a).getValue()).f285309a);
            if (setH1.contains(str)) {
                setH1.remove(str);
            } else {
                setH1.add(str);
            }
            iVar.H2(yVar, new m0(9, setH1));
        }
        return Unit.f186387a;
    }
}
