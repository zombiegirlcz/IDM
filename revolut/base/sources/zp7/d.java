package zp7;

import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Occupation f324185a;

    public d(Occupation occupation) {
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        this.f324185a = occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324185a, ((d) obj2).f324185a);
    }

    public final int hashCode() {
        return this.f324185a.hashCode();
    }
}
