package j23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$ModalStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderNewCardFlowContract$ModalStep.SubtypePicker f170667a;

    public h(OrderNewCardFlowContract$ModalStep.SubtypePicker step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f170667a = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f170667a.equals(((h) obj2).f170667a);
    }

    public final int hashCode() {
        return this.f170667a.hashCode();
    }
}
