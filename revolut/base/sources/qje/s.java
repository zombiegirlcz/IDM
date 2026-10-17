package qje;

import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TabCryptoFlowContract$ModalStep p0 = (TabCryptoFlowContract$ModalStep) obj2;
        ModalDestination.Style style = (ModalDestination.Style) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        u uVar = (u) this.receiver;
        if (style != null) {
            oki.h.v2(uVar.u, p0, style);
        } else {
            oki.h.v2(uVar.u, p0, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
