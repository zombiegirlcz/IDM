package k6g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f181713b;

    public e(Data customerOrderReference, String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(customerOrderReference, "customerOrderReference");
        this.f181712a = bookingId;
        this.f181713b = customerOrderReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f181712a, eVar.f181712a) && Intrinsics.f(this.f181713b, eVar.f181713b);
    }

    public final int hashCode() {
        return this.f181713b.hashCode() + (this.f181712a.hashCode() * 31);
    }
}
