package tag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$Step;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCheckoutFlowContract$Step f269339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f269340b;

    public l(TravelHotelsCheckoutFlowContract$Step travelHotelsCheckoutFlowContract$Step) {
        this(travelHotelsCheckoutFlowContract$Step, f0.f322471a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f269339a, lVar.f269339a) && Intrinsics.f(this.f269340b, lVar.f269340b);
    }

    public final int hashCode() {
        return this.f269340b.hashCode() + (this.f269339a.hashCode() * 31);
    }

    public l(TravelHotelsCheckoutFlowContract$Step step, List initialBackStack) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(initialBackStack, "initialBackStack");
        this.f269339a = step;
        this.f269340b = initialBackStack;
    }
}
