package cp7;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationForm f107897a;

    public g(ApplicationForm applicationForm) {
        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
        this.f107897a = applicationForm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f107897a, ((g) obj2).f107897a);
    }

    public final int hashCode() {
        return this.f107897a.hashCode();
    }
}
