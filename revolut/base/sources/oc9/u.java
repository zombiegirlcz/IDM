package oc9;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsAcknowledgement;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
        x xVar = (x) this.receiver;
        QesTermsScreen.Companion aVar = QesTermsScreen.INSTANCE;
        b0 b0Var = (b0) xVar;
        cli.y yVar = b0Var.f224137t;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.i;
        QesTermsAcknowledgement qesTermsAcknowledgement = obj4 instanceof QesTermsAcknowledgement ? (QesTermsAcknowledgement) obj4 : null;
        if (qesTermsAcknowledgement != null) {
            Set setH1 = zhm.d0.h1(((v) ((j2) yVar.f22677a).getValue()).f);
            if (setH1.contains(qesTermsAcknowledgement)) {
                setH1.remove(qesTermsAcknowledgement);
            } else {
                setH1.add(qesTermsAcknowledgement);
            }
            b0Var.H2(yVar, new imk.e(22, setH1));
        }
        return Unit.f186387a;
    }
}
