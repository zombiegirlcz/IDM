package xp7;

import aii.r;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Occupation f307891a;

    public f(Occupation selectedOccupation) {
        Intrinsics.checkNotNullParameter(selectedOccupation, "selectedOccupation");
        this.f307891a = selectedOccupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f307891a, ((f) obj2).f307891a);
    }

    public final int hashCode() {
        return this.f307891a.hashCode();
    }
}
