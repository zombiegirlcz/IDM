package s1g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesCancellationScreenContract$Mode f259135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f259136b;

    public g(TravelExperiencesCancellationScreenContract$Mode mode, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f259135a = mode;
        this.f259136b = legalEntityContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f259135a, gVar.f259135a) && Intrinsics.f(this.f259136b, gVar.f259136b);
    }

    public final int hashCode() {
        return this.f259136b.hashCode() + (this.f259135a.hashCode() * 31);
    }
}
