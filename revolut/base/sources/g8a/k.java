package g8a;

import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import java.util.Date;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f141312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f141313c;
    public final Date d;
    public final dj0.d e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f141314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f141315h;
    public final Date i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Date f141316j;
    public final Date k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PixAuthorisationFrequency f141317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f141318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f141319n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f141320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f141321q;

    public k(String id10, s sVar, p pVar, Date date, dj0.d dVar, q paymentMethodDetails, Date date2, m mVar, Date date3, Date date4, Date date5, PixAuthorisationFrequency pixAuthorisationFrequency, dj0.d dVar2, boolean z, Set relatedTransactions, i iVar, h hVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        this.f141311a = id10;
        this.f141312b = sVar;
        this.f141313c = pVar;
        this.d = date;
        this.e = dVar;
        this.f = paymentMethodDetails;
        this.f141314g = date2;
        this.f141315h = mVar;
        this.i = date3;
        this.f141316j = date4;
        this.k = date5;
        this.f141317l = pixAuthorisationFrequency;
        this.f141318m = dVar2;
        this.f141319n = z;
        this.o = relatedTransactions;
        this.f141320p = iVar;
        this.f141321q = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f141311a, kVar.f141311a) && this.f141312b == kVar.f141312b && this.f141313c == kVar.f141313c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f141314g, kVar.f141314g) && this.f141315h == kVar.f141315h && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f141316j, kVar.f141316j) && Intrinsics.f(this.k, kVar.k) && this.f141317l == kVar.f141317l && Intrinsics.f(this.f141318m, kVar.f141318m) && this.f141319n == kVar.f141319n && Intrinsics.f(this.o, kVar.o) && Intrinsics.f(this.f141320p, kVar.f141320p) && Intrinsics.f(this.f141321q, kVar.f141321q);
    }

    public final int hashCode() {
        int iHashCode = this.f141311a.hashCode() * 31;
        s sVar = this.f141312b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        p pVar = this.f141313c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Date date = this.d;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        dj0.d dVar = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        Date date2 = this.f141314g;
        int iHashCode6 = (iHashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        m mVar = this.f141315h;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Date date3 = this.i;
        int iHashCode8 = (iHashCode7 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.f141316j;
        int iHashCode9 = (iHashCode8 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.k;
        int iHashCode10 = (iHashCode9 + (date5 == null ? 0 : date5.hashCode())) * 31;
        PixAuthorisationFrequency pixAuthorisationFrequency = this.f141317l;
        int iHashCode11 = (iHashCode10 + (pixAuthorisationFrequency == null ? 0 : pixAuthorisationFrequency.hashCode())) * 31;
        dj0.d dVar2 = this.f141318m;
        int iF = p.a.f(j6.a.c((iHashCode11 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f141319n), 31, this.o);
        i iVar = this.f141320p;
        int iHashCode12 = (iF + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.f141321q;
        return iHashCode12 + (hVar != null ? hVar.hashCode() : 0);
    }
}
