package a91;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.AccessibilitySettingsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccessibilitySettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccessibilitySettingsController accessibilitySettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = accessibilitySettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Q.getValue();
        Intrinsics.h(model);
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "UNDERLINE_LINKS_SWITCH_ID")) {
            hVar.I2();
        } else if (Intrinsics.f(str, "COLOR_CONTRAST_SWITCH_ID")) {
            hVar.J2();
        }
        return Unit.f186387a;
    }
}
