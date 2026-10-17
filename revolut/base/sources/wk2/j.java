package wk2;

import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ float u;
    public final /* synthetic */ AtmMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AtmMapScreen atmMapScreen, Continuation continuation) {
        super(2, continuation);
        this.v = atmMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = ((Number) obj2).floatValue();
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create(Float.valueOf(((Number) obj2).floatValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        float f = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        AtmMapScreen.Companion aVar2 = AtmMapScreen.INSTANCE;
        AtmMapScreen atmMapScreen = this.v;
        FormsActionButton formsActionButton = atmMapScreen.d3().f280484b;
        ?? r2 = atmMapScreen.M;
        formsActionButton.setTranslationY(f - ((Number) r2.getValue()).intValue());
        atmMapScreen.d3().e.setTranslationY(f - ((Number) r2.getValue()).intValue());
        return Unit.f186387a;
    }
}
