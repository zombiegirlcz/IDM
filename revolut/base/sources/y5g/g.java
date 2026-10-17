package y5g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7g.b f311080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f311081c;

    public g(String bookingId, n7g.b travelDocument, Data receipts) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(travelDocument, "travelDocument");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.f311079a = bookingId;
        this.f311080b = travelDocument;
        this.f311081c = receipts;
    }

    public static g a(g gVar, n7g.b travelDocument, Data receipts, int i) {
        String bookingId = gVar.f311079a;
        if ((i & 2) != 0) {
            travelDocument = gVar.f311080b;
        }
        if ((i & 4) != 0) {
            receipts = gVar.f311081c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(travelDocument, "travelDocument");
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        return new g(bookingId, travelDocument, receipts);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f311079a, gVar.f311079a) && Intrinsics.f(this.f311080b, gVar.f311080b) && Intrinsics.f(this.f311081c, gVar.f311081c);
    }

    public final int hashCode() {
        return this.f311081c.hashCode() + j6.a.c(this.f311079a.hashCode() * 31, 31, this.f311080b.f213089a);
    }
}
