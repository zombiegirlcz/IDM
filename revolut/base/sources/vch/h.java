package vch;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        v vVar = (v) this.receiver;
        KProperty[] kPropertyArr = WithdrawScreen.f95647h0;
        x0 x0Var = (x0) vVar;
        j60.a aVar = x0Var.f287744r;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.i;
        if ((obj4 instanceof t) || (obj4 instanceof b0)) {
            j60.a.v(aVar, false, null, 3);
        } else if (obj4 instanceof j) {
            j60.a.v(aVar, false, new v0c.b((j) obj4, x0Var, 27), 1);
        } else if (obj4 instanceof o) {
            j60.a.v(aVar, false, new v0c.b((o) obj4, x0Var, 28), 1);
        } else if (obj4 instanceof t1h.m) {
            x0Var.f287749y.Z2((t1h.m) obj4);
        } else if (obj4 instanceof a0) {
            j60.a.v(aVar, false, new v0c.b(x0Var, obj4, 29), 1);
        }
        return Unit.f186387a;
    }
}
