package zbg;

import cli.j;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertyPayment$Card f320884a;

    public b(PropertyPayment$Card cardPayment) {
        Intrinsics.checkNotNullParameter(cardPayment, "cardPayment");
        this.f320884a = cardPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f320884a, ((b) obj2).f320884a);
    }

    public final int hashCode() {
        return this.f320884a.hashCode();
    }
}
