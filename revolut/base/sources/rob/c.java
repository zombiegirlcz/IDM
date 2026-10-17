package rob;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = AccountSelectionDialogScreen.S;
        l lVar = (l) gVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.vault.Vault");
        lVar.C2(new h((s) obj4));
        return Unit.f186387a;
    }
}
