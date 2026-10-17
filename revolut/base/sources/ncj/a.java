package ncj;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f214218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f214219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f214220c;
    public final LocalDate d;
    public final String e;

    public a(dj0.d dVar, dj0.d average, dj0.d dVar2, LocalDate date, String str) {
        Intrinsics.checkNotNullParameter(average, "average");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f214218a = dVar;
        this.f214219b = average;
        this.f214220c = dVar2;
        this.d = date;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f214218a, aVar.f214218a) && Intrinsics.f(this.f214219b, aVar.f214219b) && Intrinsics.f(this.f214220c, aVar.f214220c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f214218a;
        int iC = v7.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f214219b);
        dj0.d dVar2 = this.f214220c;
        int iA = y.a((iC + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iA + (str != null ? str.hashCode() : 0);
    }
}
