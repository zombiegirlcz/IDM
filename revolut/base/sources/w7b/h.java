package w7b;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tw0.x;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsValueReminderScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsValueReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = CobrandedCardsValueReminderScreen.T;
        ScreenContentRecyclerView screenCobrandedValueReminderRecyclerView = this.u.d3().f233164c;
        Intrinsics.checkNotNullExpressionValue(screenCobrandedValueReminderRecyclerView, "screenCobrandedValueReminderRecyclerView");
        Intrinsics.i(screenCobrandedValueReminderRecyclerView.getLayoutManager(), "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        x.b(screenCobrandedValueReminderRecyclerView, ((LinearLayoutManager) r0).getItemCount() - 1);
        return Unit.f186387a;
    }
}
