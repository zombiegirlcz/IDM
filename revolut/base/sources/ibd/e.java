package ibd;

import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f160151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f160152c;
    public final DateTime d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f160153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f160154h;
    public final RecurringPaymentEndCriteria i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f160155j;
    public final c k;

    public /* synthetic */ e(String str, Period period, h hVar, DateTime dateTime, LocalDate localDate, LocalDate localDate2, Boolean bool, Boolean bool2, RecurringPaymentEndCriteria.Date date, d dVar, c cVar, int i) {
        this(str, (i & 2) != 0 ? null : period, hVar, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? null : localDate, (i & 32) != 0 ? null : localDate2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : date, (i & 512) != 0 ? null : dVar, (i & 1024) != 0 ? null : cVar);
    }

    public static e a(e eVar, Period period, LocalDate localDate) {
        String id10 = eVar.f160150a;
        h type = eVar.f160152c;
        DateTime dateTime = eVar.d;
        LocalDate localDate2 = eVar.f;
        Boolean bool = eVar.f160153g;
        Boolean bool2 = eVar.f160154h;
        RecurringPaymentEndCriteria recurringPaymentEndCriteria = eVar.i;
        d dVar = eVar.f160155j;
        c cVar = eVar.k;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new e(id10, period, type, dateTime, localDate, localDate2, bool, bool2, recurringPaymentEndCriteria, dVar, cVar);
    }

    @Override // ibd.i
    public final Period L() {
        return this.f160151b;
    }

    @Override // ibd.i
    public final LocalDate Q() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f160150a, eVar.f160150a) && Intrinsics.f(this.f160151b, eVar.f160151b) && this.f160152c == eVar.f160152c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f160153g, eVar.f160153g) && Intrinsics.f(this.f160154h, eVar.f160154h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f160155j, eVar.f160155j) && Intrinsics.f(this.k, eVar.k);
    }

    @Override // ibd.i
    public final String getId() {
        return this.f160150a;
    }

    @Override // ibd.i
    public final Boolean getRecurring() {
        return this.f160153g;
    }

    @Override // ibd.i
    public final h getType() {
        return this.f160152c;
    }

    public final int hashCode() {
        int iHashCode = this.f160150a.hashCode() * 31;
        Period period = this.f160151b;
        int iHashCode2 = (this.f160152c.hashCode() + ((iHashCode + (period == null ? 0 : period.hashCode())) * 31)) * 31;
        DateTime dateTime = this.d;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Boolean bool = this.f160153g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f160154h;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RecurringPaymentEndCriteria recurringPaymentEndCriteria = this.i;
        int iHashCode8 = (iHashCode7 + (recurringPaymentEndCriteria == null ? 0 : recurringPaymentEndCriteria.hashCode())) * 31;
        d dVar = this.f160155j;
        int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.f160149a.hashCode())) * 31;
        c cVar = this.k;
        return iHashCode9 + (cVar != null ? cVar.f160148a.hashCode() : 0);
    }

    @Override // ibd.i
    public final LocalDate n2() {
        return this.f;
    }

    public e(String id10, Period period, h type, DateTime dateTime, LocalDate localDate, LocalDate localDate2, Boolean bool, Boolean bool2, RecurringPaymentEndCriteria recurringPaymentEndCriteria, d dVar, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f160150a = id10;
        this.f160151b = period;
        this.f160152c = type;
        this.d = dateTime;
        this.e = localDate;
        this.f = localDate2;
        this.f160153g = bool;
        this.f160154h = bool2;
        this.i = recurringPaymentEndCriteria;
        this.f160155j = dVar;
        this.k = cVar;
    }
}
