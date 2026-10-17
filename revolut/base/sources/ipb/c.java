package ipb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        f fVar = (f) this.receiver;
        KProperty[] kPropertyArr = ProtectionAndSafetyScreen.W;
        k kVar = (k) fVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "INVESTOR_INSURANCE_SCHEME_LIST_ID")) {
            kVar.l2(new j(kVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
