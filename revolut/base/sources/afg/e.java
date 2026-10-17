package afg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f4051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f4052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f4053c;
    public final boolean d;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data destination, Data experiences, Data bookingDates, boolean z, int i) {
        if ((i & 1) != 0) {
            destination = eVar.f4051a;
        }
        if ((i & 2) != 0) {
            experiences = eVar.f4052b;
        }
        if ((i & 4) != 0) {
            bookingDates = eVar.f4053c;
        }
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(bookingDates, "bookingDates");
        return new e(destination, experiences, bookingDates, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f4051a, eVar.f4051a) && Intrinsics.f(this.f4052b, eVar.f4052b) && Intrinsics.f(this.f4053c, eVar.f4053c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f4053c, kii.e.c(this.f4052b, this.f4051a.hashCode() * 31, 31), 31);
    }

    public e(Data destination, Data experiences, Data bookingDates, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(bookingDates, "bookingDates");
        this.f4051a = destination;
        this.f4052b = experiences;
        this.f4053c = bookingDates;
        this.d = z;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);
    }
}
