package vob;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.SavingsReturnExampleScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = SavingsReturnExampleScreen.S;
        i iVar = (i) gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        iVar.B2();
        return Unit.f186387a;
    }
}
