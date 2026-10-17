package oeb;

import aii.r;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f224571a;

    public b(LocalTime selectedTime) {
        Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
        this.f224571a = selectedTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f224571a, ((b) obj2).f224571a);
    }

    public final int hashCode() {
        return this.f224571a.hashCode();
    }
}
