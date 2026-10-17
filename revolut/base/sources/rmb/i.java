package rmb;

import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str;
        HighlightTileDelegate.Model model = (HighlightTileDelegate.Model) obj2;
        c cVar = (c) this.receiver;
        KProperty[] kPropertyArr = SavingsTermSelectionScreen.V;
        q qVar = (q) cVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.i;
        Continuation continuation = null;
        qkb.a aVar = obj4 instanceof qkb.a ? (qkb.a) obj4 : null;
        if (aVar != null && (str = aVar.f246977a) != null) {
            qVar.l2(new rm6.c(qVar, str, continuation, 1), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
