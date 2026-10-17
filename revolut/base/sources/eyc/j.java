package eyc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        p pVar = (p) this.receiver;
        KProperty[] kPropertyArr = EntityHomeScreen.Z;
        com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) pVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (!Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            throw new UnsupportedOperationException(j6.a.q("No click handler found for listId=", model.f52373a));
        }
        bVar.K2();
        return Unit.f186387a;
    }
}
