package hee;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f151689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151691c;
    public final LocalDate d;
    public final boolean e;
    public final boolean f;

    public j(Data currency, String amountString, String str, LocalDate localDate, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        this.f151689a = currency;
        this.f151690b = amountString;
        this.f151691c = str;
        this.d = localDate;
        this.e = z;
        this.f = z3;
    }

    public static j a(j jVar, Data data, String str, String str2, LocalDate localDate, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = jVar.f151689a;
        }
        Data currency = data;
        if ((i & 2) != 0) {
            str = jVar.f151690b;
        }
        String amountString = str;
        if ((i & 4) != 0) {
            str2 = jVar.f151691c;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            localDate = jVar.d;
        }
        LocalDate localDate2 = localDate;
        if ((i & 16) != 0) {
            z = jVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = jVar.f;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        return new j(currency, amountString, str3, localDate2, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f151689a, jVar.f151689a) && Intrinsics.f(this.f151690b, jVar.f151690b) && Intrinsics.f(this.f151691c, jVar.f151691c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151689a.hashCode() * 31, 31, this.f151690b);
        String str = this.f151691c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.e);
    }
}
