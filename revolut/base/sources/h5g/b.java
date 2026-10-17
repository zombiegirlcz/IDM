package h5g;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149555a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149555a, ((b) obj2).f149555a);
    }

    public final int hashCode() {
        return this.f149555a.hashCode();
    }

    public b(List bookings) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        this.f149555a = bookings;
    }

    public b(int i) {
        this(f0.f322471a);
    }
}
