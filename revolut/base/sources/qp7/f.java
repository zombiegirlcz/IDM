package qp7;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ ReservationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ReservationScreen reservationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = reservationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = ReservationScreen.g0;
        ReservationScreen reservationScreen = this.u;
        reservationScreen.g3().f217061c.setExpanded(false, true);
        RecyclerView.LayoutManager layoutManager = reservationScreen.h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        reservationScreen.h().smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount() - 1);
        return Unit.f186387a;
    }
}
