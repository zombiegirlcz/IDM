package xsh;

import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WidgetCarouselScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WidgetCarouselScreen widgetCarouselScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = widgetCarouselScreen;
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

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WidgetCarouselScreen widgetCarouselScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) ((f) widgetCarouselScreen.T.getValue());
                d dVar = (d) rVar.t2();
                h hVar = (h) d0.e0(dVar.f308494b, dVar.f308493a);
                if ((hVar != null ? hVar.f : null) != null) {
                    rVar.v2(new e(hVar.f308500a, hVar.f));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                widgetCarouselScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
