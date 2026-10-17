package vch;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        v vVar = (v) this.receiver;
        KProperty[] kPropertyArr = WithdrawScreen.f95647h0;
        x0 x0Var = (x0) vVar;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (!Intrinsics.f(str, "ERROR_STATE_ID")) {
            throw new IllegalStateException(h30.l.r("Unhandled listId ", str));
        }
        x0Var.H.setValue(Instant.now());
        return Unit.f186387a;
    }
}
