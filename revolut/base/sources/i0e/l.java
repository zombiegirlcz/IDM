package i0e;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) obj2;
        q qVar = (q) ((g) this.receiver);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (kotlin.text.a0.H(model.f53324a, "PERIOD_CHOICE_ID_", false)) {
            Object obj4 = model.f;
            b0 b0Var = obj4 instanceof b0 ? (b0) obj4 : null;
            if (b0Var != null) {
                j60.a.v(qVar.o, false, new hl6.b(qVar, b0Var, 28), 1);
            }
        }
        return Unit.f186387a;
    }
}
