package g2g;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceDurationFilter;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePopularFilter;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelExperiencesFilterScreen travelExperiencesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarI3 = this.v.T2();
        Intrinsics.h(model);
        b bVar = (b) nVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        boolean z = model.f52521c;
        int i = 4;
        if (obj3 instanceof TravelExperiencePopularFilter) {
            TravelExperiencePopularFilter travelExperiencePopularFilter = (TravelExperiencePopularFilter) obj3;
            int i2 = a.f140051a[travelExperiencePopularFilter.f92839a.ordinal()];
            if (i2 == 1) {
                bVar.x2(new g1k.k(19));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.x2(new a31.i(z, travelExperiencePopularFilter.f92840b, i));
            }
        } else if (obj3 instanceof TravelExperienceCategory) {
            bVar.x2(new a31.i(z, ((TravelExperienceCategory) obj3).f92807a, i));
        } else if (obj3 instanceof TravelExperienceDurationFilter) {
            bVar.x2(new a6j.a(z, (TravelExperienceDurationFilter) obj3, 25));
        }
        return Unit.f186387a;
    }
}
