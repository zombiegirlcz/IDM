package l5g;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f192259b;

    public e(Data bookingDetails, String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        this.f192258a = bookingId;
        this.f192259b = bookingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f192258a, eVar.f192258a) && Intrinsics.f(this.f192259b, eVar.f192259b);
    }

    public final int hashCode() {
        return this.f192259b.hashCode() + (this.f192258a.hashCode() * 31);
    }
}
