package u37;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f276793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ds6.a f276794c;
    public final LocalDate d;
    public final Month e;
    public final boolean f;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data data, Data data2, ds6.a aVar, LocalDate localDate, Month month, boolean z, int i) {
        if ((i & 1) != 0) {
            data = gVar.f276792a;
        }
        Data taxOptionsInfo = data;
        if ((i & 2) != 0) {
            data2 = gVar.f276793b;
        }
        Data taxAuthorityWebsiteUrl = data2;
        if ((i & 4) != 0) {
            aVar = gVar.f276794c;
        }
        ds6.a aVar2 = aVar;
        if ((i & 8) != 0) {
            localDate = gVar.d;
        }
        LocalDate localDate2 = localDate;
        if ((i & 16) != 0) {
            month = gVar.e;
        }
        Month month2 = month;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(taxOptionsInfo, "taxOptionsInfo");
        Intrinsics.checkNotNullParameter(taxAuthorityWebsiteUrl, "taxAuthorityWebsiteUrl");
        return new g(taxOptionsInfo, taxAuthorityWebsiteUrl, aVar2, localDate2, month2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f276792a, gVar.f276792a) && Intrinsics.f(this.f276793b, gVar.f276793b) && this.f276794c == gVar.f276794c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f276793b, this.f276792a.hashCode() * 31, 31);
        ds6.a aVar = this.f276794c;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Month month = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (month != null ? month.hashCode() : 0)) * 31);
    }

    public g(Data taxOptionsInfo, Data taxAuthorityWebsiteUrl, ds6.a aVar, LocalDate localDate, Month month, boolean z) {
        Intrinsics.checkNotNullParameter(taxOptionsInfo, "taxOptionsInfo");
        Intrinsics.checkNotNullParameter(taxAuthorityWebsiteUrl, "taxAuthorityWebsiteUrl");
        this.f276792a = taxOptionsInfo;
        this.f276793b = taxAuthorityWebsiteUrl;
        this.f276794c = aVar;
        this.d = localDate;
        this.e = month;
        this.f = z;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null, false);
    }
}
