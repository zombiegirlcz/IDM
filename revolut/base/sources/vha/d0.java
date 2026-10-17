package vha;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0 extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        l lVar = (l) this.receiver;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "ID_CASH_BACK_BOTTOM_DIALOG_UPGRADE_PLAN")) {
            j60.a.v(lVar.f289403n, false, null, 3);
            lVar.V2(new k(lVar, null), new yi5.b(29));
        }
        return Unit.f186387a;
    }
}
