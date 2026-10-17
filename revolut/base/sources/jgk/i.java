package jgk;

import hha.w0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f174075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f174077c;
    public final Date d;
    public final boolean e;
    public final Boolean f;

    public i(w0 nextPlan, boolean z, Period period, Date date, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(nextPlan, "nextPlan");
        this.f174075a = nextPlan;
        this.f174076b = z;
        this.f174077c = period;
        this.d = date;
        this.e = z3;
        this.f = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f174075a == iVar.f174075a && this.f174076b == iVar.f174076b && Intrinsics.f(this.f174077c, iVar.f174077c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f174075a.hashCode() * 31, 31, this.f174076b);
        Period period = this.f174077c;
        int iHashCode = (iC + (period == null ? 0 : period.hashCode())) * 31;
        Date date = this.d;
        int iC2 = j6.a.c((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        return iC2 + (bool != null ? bool.hashCode() : 0);
    }
}
