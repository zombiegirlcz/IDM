package pdg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pdg.p;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsPropertyDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsPropertyDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strN2;
        String strN22;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) xVarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        int iHashCode = str.hashCode();
        if (iHashCode != 1143007285) {
            if (iHashCode != 1992579087) {
                if (iHashCode == 2050679675 && str.equals("RATING_REVIEW_TITLE_ITEM_ID") && (strN22 = i0Var.N2()) != null) {
                    i0Var.C2(new t(strN22));
                }
            } else if (str.equals("AMENITY_SUBHEADER_ITEM_ID")) {
                i0Var.C2(p.a.f235212a);
            }
        } else if (str.equals("ADDITIONAL_DETAILS_TITLE_ITEM_ID ") && (strN2 = i0Var.N2()) != null) {
            i0Var.C2(new o(strN2));
        }
        return Unit.f186387a;
    }
}
