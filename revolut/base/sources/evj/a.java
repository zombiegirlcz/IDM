package evj;

import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f129969a;

    public a(LocalTime selectedTime) {
        Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
        this.f129969a = selectedTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f129969a, ((a) obj2).f129969a);
    }

    public final int hashCode() {
        return this.f129969a.hashCode();
    }
}
