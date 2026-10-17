package ayf;

import java.time.LocalDate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11159b;

    public /* synthetic */ e(n nVar, int i) {
        this.f11158a = i;
        this.f11159b = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f11158a) {
            case 0:
                LocalDate currentDate = (LocalDate) obj2;
                hxf.a booking = (hxf.a) obj3;
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                Intrinsics.checkNotNullParameter(booking, "booking");
                return Boolean.valueOf(!ifk.b.g(booking).isBefore(currentDate) && d0.T(this.f11159b.e, booking.f));
            default:
                LocalDate currentDate2 = (LocalDate) obj2;
                hxf.a booking2 = (hxf.a) obj3;
                Intrinsics.checkNotNullParameter(currentDate2, "currentDate");
                Intrinsics.checkNotNullParameter(booking2, "booking");
                return Boolean.valueOf(ifk.b.g(booking2).isBefore(currentDate2) || d0.T(this.f11159b.d, booking2.f));
        }
    }
}
