package yo7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDriver f315618a;

    public j(AdditionalDriver driver) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        this.f315618a = driver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f315618a, ((j) obj2).f315618a);
    }

    public final int hashCode() {
        return this.f315618a.hashCode();
    }
}
