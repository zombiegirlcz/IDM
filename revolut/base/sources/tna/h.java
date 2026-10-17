package tna;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppearanceThemeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AppearanceThemeScreen appearanceThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = appearanceThemeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) lVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ID_PRIDE_THEME_SWITCHER")) {
            rVar.l2(new q(rVar, null, 1), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
