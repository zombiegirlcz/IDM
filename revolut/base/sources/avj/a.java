package avj;

import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalTime f10048c;
    public final Address d;

    public a() {
        this(0);
    }

    public static a a(a aVar, String eventName, LocalDate localDate, LocalTime localTime, Address address, int i) {
        if ((i & 1) != 0) {
            eventName = aVar.f10046a;
        }
        if ((i & 2) != 0) {
            localDate = aVar.f10047b;
        }
        if ((i & 4) != 0) {
            localTime = aVar.f10048c;
        }
        if ((i & 8) != 0) {
            address = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new a(eventName, localDate, localTime, address);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f10046a, aVar.f10046a) && Intrinsics.f(this.f10047b, aVar.f10047b) && Intrinsics.f(this.f10048c, aVar.f10048c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10046a.hashCode() * 31;
        LocalDate localDate = this.f10047b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalTime localTime = this.f10048c;
        int iHashCode3 = (iHashCode2 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        Address address = this.d;
        return iHashCode3 + (address != null ? address.hashCode() : 0);
    }

    public a(String eventName, LocalDate localDate, LocalTime localTime, Address address) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f10046a = eventName;
        this.f10047b = localDate;
        this.f10048c = localTime;
        this.d = address;
    }

    public /* synthetic */ a(int i) {
        this("", null, null, null);
    }
}
