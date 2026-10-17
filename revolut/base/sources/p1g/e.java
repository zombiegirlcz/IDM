package p1g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f231919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f231920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f231921c;

    public e() {
        this(false, 7);
    }

    public static e a(e eVar, Data bookings, Data lifestyleBorderlessFooter, int i) {
        if ((i & 1) != 0) {
            bookings = eVar.f231919a;
        }
        if ((i & 2) != 0) {
            lifestyleBorderlessFooter = eVar.f231920b;
        }
        boolean z = eVar.f231921c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        return new e(bookings, lifestyleBorderlessFooter, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f231919a, eVar.f231919a) && Intrinsics.f(this.f231920b, eVar.f231920b) && this.f231921c == eVar.f231921c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231921c) + kii.e.c(this.f231920b, this.f231919a.hashCode() * 31, 31);
    }

    public e(Data bookings, Data lifestyleBorderlessFooter, boolean z) {
        Intrinsics.checkNotNullParameter(bookings, "bookings");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        this.f231919a = bookings;
        this.f231920b = lifestyleBorderlessFooter;
        this.f231921c = z;
    }

    public /* synthetic */ e(boolean z, int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), (i & 4) != 0 ? false : z);
    }
}
