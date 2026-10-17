package sm7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Survey.CurrentInsurance f264383a;

    public c(Survey.CurrentInsurance currentInsurance) {
        Intrinsics.checkNotNullParameter(currentInsurance, "currentInsurance");
        this.f264383a = currentInsurance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f264383a, ((c) obj2).f264383a);
    }

    public final int hashCode() {
        return this.f264383a.hashCode();
    }
}
