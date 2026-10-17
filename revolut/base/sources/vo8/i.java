package vo8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        k kVar = (k) this.receiver;
        KProperty[] kPropertyArr = JuniorSecurityAndPrivacyController.W;
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) kVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.n2(new k0(model, bVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}
