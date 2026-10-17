package ylh;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) obj2;
        t tVar = (t) ((j) this.receiver);
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (kotlin.text.a0.H(model.f53324a, "PERIOD_CHOICE_ID_", false)) {
            Object obj4 = model.f;
            z zVar = obj4 instanceof z ? (z) obj4 : null;
            if (zVar != null) {
                j60.a.v(tVar.f314731p, false, new yff.b(tVar, zVar, 8), 1);
            }
        }
        return Unit.f186387a;
    }
}
