package hih;

import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Descriptor;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthTransferFlowControllerFactory$Descriptor f152605b;

    public c(WealthTransferFlowControllerFactory$Descriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ModalDestination.Style.BOTTOM_DIALOG style = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f152605b = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c) || !this.f152605b.equals(((c) obj2).f152605b)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ModalDestination.Style.BOTTOM_DIALOG.f98301a.hashCode() + (this.f152605b.hashCode() * 31);
    }
}
