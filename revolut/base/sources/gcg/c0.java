package gcg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature_travel_hotels_models.property.search.EmptyLocation;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import com.revolut.feature_travel_hotels_models.property.search.SimplifiedLocationType;
import gcg.k;
import i9g.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.i implements Function1 {
    public final /* synthetic */ LargeActionButtonDelegate.Model u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(LargeActionButtonDelegate.Model model, e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(this.u.f52613a, "SEARCH_BUTTON_ID")) {
            e0 e0Var = this.v;
            s sVar = ((j) ((j2) e0Var.E.f22677a).getValue()).f142450b;
            LocationData locationData = sVar != null ? sVar.d : null;
            if (locationData instanceof PropertyType) {
                String str = ((PropertyType) locationData).f98137b;
                i9g.b0 b0Var = e0Var.f142441q;
                Boolean bool = Boolean.TRUE;
                h0 h0Var = e0Var.f142440p;
                yji.l.a1(e0Var, rd0.e.b(m70.a.g(b0Var.a(new yfi.a(str, bool, h0Var.b(), h0Var.c(), hx7.a.F(h0Var.f159799a.a().d)), false), null, new gcc.c(2), 1)), null, null, new y(e0Var, null), 3);
            } else if ((locationData instanceof LocationType) || (locationData instanceof SimplifiedLocationType) || (locationData instanceof LocationMapBoundaries)) {
                e0Var.C2(new k.c(false));
            } else {
                if (!(locationData instanceof EmptyLocation) && locationData != null) {
                    throw new NoWhenBranchMatchedException();
                }
                e0Var.C2(k.b.f142457a);
            }
        }
        return Unit.f186387a;
    }
}
