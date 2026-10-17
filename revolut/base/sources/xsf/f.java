package xsf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function2 {
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model p0 = (InputTextDelegate.Model) obj2;
        InputText p17 = (InputText) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen = (TransferReasonsAdditionalInfoScreen) this.receiver;
        KProperty[] kPropertyArr = TransferReasonsAdditionalInfoScreen.T;
        transferReasonsAdditionalInfoScreen.getClass();
        Object obj4 = p0.P;
        n nVar = obj4 instanceof n ? (n) obj4 : null;
        if (nVar == null) {
            return null;
        }
        return new zp0.d(p17.getInnerEditText(), nVar.f308473a, (u80.d) transferReasonsAdditionalInfoScreen.P.getValue(), null, new e(transferReasonsAdditionalInfoScreen, nVar), false, false, 0, false, null, 2024);
    }
}
