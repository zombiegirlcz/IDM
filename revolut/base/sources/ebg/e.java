package ebg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f124336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f124337b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data bookings, Data lifestyleBorderlessFooter, int i) {
        if ((i & 1) != 0) {
            bookings = eVar.f124336a;
        }
        if ((i & 2) != 0) {
            lifestyleBorderlessFooter = eVar.f124337b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        return new e(bookings, lifestyleBorderlessFooter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124336a, eVar.f124336a) && Intrinsics.f(this.f124337b, eVar.f124337b);
    }

    public final int hashCode() {
        return this.f124337b.hashCode() + (this.f124336a.hashCode() * 31);
    }

    public e(Data bookings, Data lifestyleBorderlessFooter) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        this.f124336a = bookings;
        this.f124337b = lifestyleBorderlessFooter;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null));
    }
}
