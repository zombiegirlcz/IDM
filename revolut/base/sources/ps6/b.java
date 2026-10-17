package ps6;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239397c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f239398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f239399h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f239400j;

    public b(String id10, String taxType, String state, String period, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate filingStartDate, LocalDate filingEndDate, List steps) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(filingStartDate, "filingStartDate");
        Intrinsics.checkNotNullParameter(filingEndDate, "filingEndDate");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f239395a = id10;
        this.f239396b = taxType;
        this.f239397c = state;
        this.d = period;
        this.e = localDate;
        this.f = localDate2;
        this.f239398g = localDate3;
        this.f239399h = filingStartDate;
        this.i = filingEndDate;
        this.f239400j = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f239395a, bVar.f239395a) && Intrinsics.f(this.f239396b, bVar.f239396b) && Intrinsics.f(this.f239397c, bVar.f239397c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f239398g, bVar.f239398g) && Intrinsics.f(this.f239399h, bVar.f239399h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f239400j, bVar.f239400j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f239395a.hashCode() * 31, 31, this.f239396b), 31, this.f239397c), 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f239398g;
        return this.f239400j.hashCode() + y.a(y.a((iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0)) * 31, 31, this.f239399h), 31, this.i);
    }
}
