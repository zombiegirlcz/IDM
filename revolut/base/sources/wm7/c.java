package wm7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Survey.Licence f298616a;

    public c(Survey.Licence licence) {
        Intrinsics.checkNotNullParameter(licence, "licence");
        this.f298616a = licence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298616a, ((c) obj2).f298616a);
    }

    public final int hashCode() {
        return this.f298616a.hashCode();
    }
}
