package ayf;

import java.time.LocalDate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11152b;

    public /* synthetic */ a(n nVar, int i) {
        this.f11151a = i;
        this.f11152b = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LocalDate currentDate = (LocalDate) obj2;
        hxf.a booking = (hxf.a) obj3;
        switch (this.f11151a) {
            case 0:
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                Intrinsics.checkNotNullParameter(booking, "booking");
                return Boolean.valueOf(ifk.b.g(booking).isBefore(currentDate) || d0.T(this.f11152b.d, booking.f));
            default:
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                Intrinsics.checkNotNullParameter(booking, "booking");
                return Boolean.valueOf(!ifk.b.g(booking).isBefore(currentDate) && d0.T(this.f11152b.e, booking.f));
        }
    }
}
