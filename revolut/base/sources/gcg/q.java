package gcg;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData f142465a;

    public q(HotelsPropertyInputData property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f142465a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f142465a, ((q) obj2).f142465a);
    }

    public final int hashCode() {
        return this.f142465a.hashCode();
    }
}
