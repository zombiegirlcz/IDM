package i7g;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f159294b;

    public e(Data bookingDetails, String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        this.f159293a = bookingId;
        this.f159294b = bookingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f159293a, eVar.f159293a) && Intrinsics.f(this.f159294b, eVar.f159294b);
    }

    public final int hashCode() {
        return this.f159294b.hashCode() + (this.f159293a.hashCode() * 31);
    }
}
