package qm7;

import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Survey.Claims f247775a;

    public b(Survey.Claims claims) {
        Intrinsics.checkNotNullParameter(claims, "claims");
        this.f247775a = claims;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f247775a, ((b) obj2).f247775a);
    }

    public final int hashCode() {
        return this.f247775a.hashCode();
    }
}
