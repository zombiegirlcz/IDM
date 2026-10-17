package d5g;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f111414a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f111414a, ((c) obj2).f111414a);
    }

    public final int hashCode() {
        return this.f111414a.hashCode();
    }

    public c(Data bookingStatus) {
        Intrinsics.checkNotNullParameter(bookingStatus, "bookingStatus");
        this.f111414a = bookingStatus;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
