package wn7;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationForm f298717a;

    public g(ApplicationForm applicationForm) {
        this.f298717a = applicationForm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f298717a, ((g) obj2).f298717a);
    }

    public final int hashCode() {
        ApplicationForm applicationForm = this.f298717a;
        if (applicationForm == null) {
            return 0;
        }
        return applicationForm.hashCode();
    }
}
