package yeg;

import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import f0d.m;
import fag.t0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ TravelHotelsSortingOption v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f312929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelHotelsSortingOption travelHotelsSortingOption, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSortingOption;
        this.f312929w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f312929w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TravelHotelsSortingOption travelHotelsSortingOption = this.v;
        g gVar = this.f312929w;
        if (i == 0) {
            o.b(obj2);
            String str = travelHotelsSortingOption.f98141a;
            ggi.a aVar2 = (ggi.a) ((b) ((j2) gVar.f312931q.f22677a).getValue()).f312925a.getContent();
            TravelHotelsSortingOption travelHotelsSortingOption2 = Intrinsics.f(str, aVar2 != null ? aVar2.f143689a : null) ? null : travelHotelsSortingOption;
            t0 t0Var = gVar.f312930p.f159799a;
            t0Var.getClass();
            pfm.h hVar = new pfm.h(new m(t0Var, travelHotelsSortingOption2, 7), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            this.u = 1;
            if (nim.a.a(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gVar.C2(new c(travelHotelsSortingOption));
        return Unit.f186387a;
    }
}
