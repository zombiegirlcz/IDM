package an7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Survey.LicencePenalties f6571a;

    public c(Survey.LicencePenalties penalties) {
        Intrinsics.checkNotNullParameter(penalties, "penalties");
        this.f6571a = penalties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f6571a, ((c) obj2).f6571a);
    }

    public final int hashCode() {
        return this.f6571a.hashCode();
    }
}
