package ps6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f239406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239407c;

    public h(String period, String str, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f239405a = period;
        this.f239406b = localDate;
        this.f239407c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f239405a, hVar.f239405a) && Intrinsics.f(this.f239406b, hVar.f239406b) && Intrinsics.f(this.f239407c, hVar.f239407c);
    }

    public final int hashCode() {
        int iHashCode = this.f239405a.hashCode() * 31;
        LocalDate localDate = this.f239406b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f239407c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
