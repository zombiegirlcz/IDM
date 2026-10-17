package nj9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model action = (LargeActionButtonDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = ActivationController.V;
        n nVar = (n) iVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        j60.a.v(nVar.f216428q, false, null, 3);
        return Unit.f186387a;
    }
}
