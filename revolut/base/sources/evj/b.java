package evj;

import aii.r;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f129970a;

    public b(LocalTime selectedTime) {
        Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
        this.f129970a = selectedTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f129970a, ((b) obj2).f129970a);
    }

    public final int hashCode() {
        return this.f129970a.hashCode();
    }
}
