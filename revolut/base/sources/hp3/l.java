package hp3;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f154410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f154411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f154412c;

    public l(LocalDate localDate, LocalDate localDate2, Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f154410a = localDate;
        this.f154411b = localDate2;
        this.f154412c = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f154410a, lVar.f154410a) && Intrinsics.f(this.f154411b, lVar.f154411b) && Intrinsics.f(this.f154412c, lVar.f154412c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f154410a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f154411b;
        return this.f154412c.hashCode() + ((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }
}
