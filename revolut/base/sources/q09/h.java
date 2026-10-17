package q09;

import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LessonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(LessonScreen lessonScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = lessonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LessonScreen lessonScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = LessonScreen.c0;
                SwipeableCardsView swipeableCardsView = lessonScreen.Z2().f110334b;
                swipeableCardsView.setCurrentItem(swipeableCardsView.getCurrentItem() + 1);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr2 = LessonScreen.c0;
                SwipeableCardsView swipeableCardsView2 = lessonScreen.Z2().f110334b;
                swipeableCardsView2.setCurrentItem(swipeableCardsView2.getCurrentItem() + 1);
                break;
        }
        return Unit.f186387a;
    }
}
