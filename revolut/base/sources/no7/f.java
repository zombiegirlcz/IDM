package no7;

import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import kl7.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsurableCar f217934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f217935b;

    public f(InsurableCar car, o0 o0Var) {
        Intrinsics.checkNotNullParameter(car, "car");
        this.f217934a = car;
        this.f217935b = o0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f217934a, fVar.f217934a) && this.f217935b == fVar.f217935b;
    }

    public final int hashCode() {
        int iHashCode = this.f217934a.hashCode() * 31;
        o0 o0Var = this.f217935b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }
}
