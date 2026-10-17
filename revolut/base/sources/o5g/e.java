package o5g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f222430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f222431c;

    public e(Data bookingDetails, String bookingId, int i) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        this.f222429a = bookingId;
        this.f222430b = i;
        this.f222431c = bookingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222429a, eVar.f222429a) && this.f222430b == eVar.f222430b && Intrinsics.f(this.f222431c, eVar.f222431c);
    }

    public final int hashCode() {
        return this.f222431c.hashCode() + j6.a.b(this.f222430b, this.f222429a.hashCode() * 31, 31);
    }
}
