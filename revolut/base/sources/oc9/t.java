package oc9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        x xVar = (x) this.receiver;
        QesTermsScreen.Companion aVar = QesTermsScreen.INSTANCE;
        b0 b0Var = (b0) xVar;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        b0Var.J2();
        return Unit.f186387a;
    }
}
