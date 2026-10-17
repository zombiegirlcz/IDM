package v2g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f285734a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f285734a, ((d) obj2).f285734a);
    }

    public final int hashCode() {
        return this.f285734a.hashCode();
    }

    public d(Data bookings) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        this.f285734a = bookings;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
