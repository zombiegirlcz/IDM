package ro2;

import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerConfig f255810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f255811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qo2.c f255812c;
    public final boolean d;

    public h(DatePickerConfig datePickerConfig, LocalDate localDate, qo2.c cVar) {
        Intrinsics.checkNotNullParameter(datePickerConfig, "datePickerConfig");
        this.f255810a = datePickerConfig;
        this.f255811b = localDate;
        this.f255812c = cVar;
        this.d = (localDate == null || cVar == null) ? false : true;
    }

    public static h a(h hVar, LocalDate localDate, qo2.c cVar, int i) {
        DatePickerConfig datePickerConfig = hVar.f255810a;
        if ((i & 2) != 0) {
            localDate = hVar.f255811b;
        }
        if ((i & 4) != 0) {
            cVar = hVar.f255812c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(datePickerConfig, "datePickerConfig");
        return new h(datePickerConfig, localDate, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f255810a, hVar.f255810a) && Intrinsics.f(this.f255811b, hVar.f255811b) && this.f255812c == hVar.f255812c;
    }

    public final int hashCode() {
        int iHashCode = this.f255810a.hashCode() * 31;
        LocalDate localDate = this.f255811b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        qo2.c cVar = this.f255812c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
