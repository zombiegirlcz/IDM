package um7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Survey.Employment f281264a;

    public c(Survey.Employment employment) {
        Intrinsics.checkNotNullParameter(employment, "employment");
        this.f281264a = employment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f281264a, ((c) obj2).f281264a);
    }

    public final int hashCode() {
        return this.f281264a.hashCode();
    }
}
