package mbg;

import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204208a;

    public b(List bookings) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        this.f204208a = bookings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f204208a, ((b) obj2).f204208a);
    }

    public final int hashCode() {
        return this.f204208a.hashCode();
    }
}
