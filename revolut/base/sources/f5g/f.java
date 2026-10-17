package f5g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f132316a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f132316a, ((f) obj2).f132316a);
    }

    public final int hashCode() {
        return this.f132316a.hashCode();
    }

    public f(Data bookings) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        this.f132316a = bookings;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
