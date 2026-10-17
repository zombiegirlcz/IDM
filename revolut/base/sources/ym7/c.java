package ym7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Answer.Mileage f314876a;

    public c(Answer.Mileage mileage) {
        Intrinsics.checkNotNullParameter(mileage, "mileage");
        this.f314876a = mileage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f314876a == ((c) obj2).f314876a;
    }

    public final int hashCode() {
        return this.f314876a.hashCode();
    }
}
