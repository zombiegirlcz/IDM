package tob;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.CapitalAtRiskScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l10.m;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        f fVar = (f) this.receiver;
        KProperty[] kPropertyArr = CapitalAtRiskScreen.S;
        i iVar = (i) fVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "GOT_IT_BUTTON_LIST_ID")) {
            iVar.B2();
        } else {
            Object obj4 = model.i;
            if (obj4 instanceof d) {
                iVar.l2(new m((Object) iVar, (Object) ((d) obj4).f272564a, true, (Continuation) null, 24), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
