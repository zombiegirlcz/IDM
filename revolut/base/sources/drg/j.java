package drg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "p0");
        l lVar = (l) ((f) this.receiver);
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_LIST_ITEM_ID")) {
            lVar.f117133y.onNext(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
