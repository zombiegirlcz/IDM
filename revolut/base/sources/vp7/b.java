package vp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f291113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Answer.ClaimType f291114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f291115c;
    public final Boolean d;

    public b() {
        this(null, null, null, null);
    }

    public static b a(b bVar, LocalDate localDate, Answer.ClaimType claimType, Boolean bool, Boolean bool2, int i) {
        if ((i & 1) != 0) {
            localDate = bVar.f291113a;
        }
        if ((i & 2) != 0) {
            claimType = bVar.f291114b;
        }
        if ((i & 4) != 0) {
            bool = bVar.f291115c;
        }
        if ((i & 8) != 0) {
            bool2 = bVar.d;
        }
        bVar.getClass();
        return new b(localDate, claimType, bool, bool2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f291113a, bVar.f291113a) && this.f291114b == bVar.f291114b && Intrinsics.f(this.f291115c, bVar.f291115c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f291113a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Answer.ClaimType claimType = this.f291114b;
        int iHashCode2 = (iHashCode + (claimType == null ? 0 : claimType.hashCode())) * 31;
        Boolean bool = this.f291115c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public b(LocalDate localDate, Answer.ClaimType claimType, Boolean bool, Boolean bool2) {
        this.f291113a = localDate;
        this.f291114b = claimType;
        this.f291115c = bool;
        this.d = bool2;
    }
}
