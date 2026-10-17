package gk9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = PayLaterPlansListScreen.f0;
        o oVar = (o) iVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        oVar.l2(new n(oVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
