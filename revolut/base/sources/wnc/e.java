package wnc;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.s5;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = TemplatesScreen.g0;
        g0 g0Var = (g0) nVar;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.k;
        if (obj4 instanceof ooc.a) {
            g0Var.x2(new rhg.n(obj4, model.f instanceof s5, 1));
        }
        return Unit.f186387a;
    }
}
