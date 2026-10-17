package xp7;

import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Occupation f307890a;

    public e(Occupation occupation) {
        this.f307890a = occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f307890a, ((e) obj2).f307890a);
    }

    public final int hashCode() {
        Occupation occupation = this.f307890a;
        if (occupation == null) {
            return 0;
        }
        return occupation.hashCode();
    }
}
