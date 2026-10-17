package veh;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f288324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f288325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qel.b f288326c;

    public f(List expirationDates, LocalDate selectedExpirationDate, qel.b selectedContractType) {
        Intrinsics.checkNotNullParameter(expirationDates, "expirationDates");
        Intrinsics.checkNotNullParameter(selectedExpirationDate, "selectedExpirationDate");
        Intrinsics.checkNotNullParameter(selectedContractType, "selectedContractType");
        this.f288324a = expirationDates;
        this.f288325b = selectedExpirationDate;
        this.f288326c = selectedContractType;
    }

    public static f a(f fVar, LocalDate selectedExpirationDate, qel.b selectedContractType, int i) {
        List expirationDates = fVar.f288324a;
        if ((i & 2) != 0) {
            selectedExpirationDate = fVar.f288325b;
        }
        if ((i & 4) != 0) {
            selectedContractType = fVar.f288326c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(expirationDates, "expirationDates");
        Intrinsics.checkNotNullParameter(selectedExpirationDate, "selectedExpirationDate");
        Intrinsics.checkNotNullParameter(selectedContractType, "selectedContractType");
        return new f(expirationDates, selectedExpirationDate, selectedContractType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f288324a, fVar.f288324a) && Intrinsics.f(this.f288325b, fVar.f288325b) && this.f288326c == fVar.f288326c;
    }

    public final int hashCode() {
        return this.f288326c.hashCode() + y.a(this.f288324a.hashCode() * 31, 31, this.f288325b);
    }
}
