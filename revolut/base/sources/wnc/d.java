package wnc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import poc.d;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = TemplatesScreen.g0;
        g0 g0Var = (g0) nVar;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.i;
        if (obj4 instanceof d.a) {
            poc.b bVar = g0Var.f298790r;
            d.a parcel = (d.a) obj4;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            j60.a.v(bVar.f237958a, false, null, 3);
        } else if (obj4 instanceof r) {
            r rVar = (r) obj4;
            j60.a.v(g0Var.f298791s, false, null, 3);
            if (rVar instanceof p) {
                j2 j2Var = g0Var.B;
                Template template = ((p) rVar).f298810a;
                j2Var.getClass();
                j2Var.g(null, template);
            } else {
                if (!(rVar instanceof q)) {
                    throw new NoWhenBranchMatchedException();
                }
                g0Var.v2(new o(((q) rVar).f298811a));
            }
        }
        return Unit.f186387a;
    }
}
