package j68;

import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import do3.n;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f171687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f171688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorPlanConfiguration f171689c;
    public final n d;

    public e(LocalDate localDate, LocalDate localDate2, JuniorPlanConfiguration juniorPlanConfiguration, n nVar) {
        this.f171687a = localDate;
        this.f171688b = localDate2;
        this.f171689c = juniorPlanConfiguration;
        this.d = nVar;
    }

    public static e a(e eVar, LocalDate localDate, JuniorPlanConfiguration juniorPlanConfiguration, n nVar, int i) {
        LocalDate localDate2 = eVar.f171687a;
        if ((i & 2) != 0) {
            localDate = eVar.f171688b;
        }
        if ((i & 4) != 0) {
            juniorPlanConfiguration = eVar.f171689c;
        }
        if ((i & 8) != 0) {
            nVar = eVar.d;
        }
        eVar.getClass();
        return new e(localDate2, localDate, juniorPlanConfiguration, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f171687a, eVar.f171687a) && Intrinsics.f(this.f171688b, eVar.f171688b) && Intrinsics.f(this.f171689c, eVar.f171689c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f171687a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f171688b;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        JuniorPlanConfiguration juniorPlanConfiguration = this.f171689c;
        int iHashCode3 = (iHashCode2 + (juniorPlanConfiguration == null ? 0 : juniorPlanConfiguration.hashCode())) * 31;
        n nVar = this.d;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }
}
