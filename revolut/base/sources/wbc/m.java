package wbc;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f296117c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f296118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f296119h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f296120j;
    public final DeliveryMethods.DeliveryMethod k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Address f296121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xi0.b f296122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f296123n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f296124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f296125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f296126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f296127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f296128t;
    public final long u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f296129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xbc.b f296130x;

    public m(String orderId, String str, LocalDateTime paymentDate, String str2, boolean z, String str3, h merchant, String str4, List transactionIds, List pointsTransactionIds, DeliveryMethods.DeliveryMethod deliveryMethod, Address address, xi0.b currency, long j2, long j3, Long l2, long j5, long j16, long j22, long j42, long j46, List deliveries, List lineItems, xbc.b bVar) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(pointsTransactionIds, "pointsTransactionIds");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        this.f296115a = orderId;
        this.f296116b = str;
        this.f296117c = paymentDate;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.f296118g = merchant;
        this.f296119h = str4;
        this.i = transactionIds;
        this.f296120j = pointsTransactionIds;
        this.k = deliveryMethod;
        this.f296121l = address;
        this.f296122m = currency;
        this.f296123n = j2;
        this.o = j3;
        this.f296124p = l2;
        this.f296125q = j5;
        this.f296126r = j16;
        this.f296127s = j22;
        this.f296128t = j42;
        this.u = j46;
        this.v = deliveries;
        this.f296129w = lineItems;
        this.f296130x = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f296115a, mVar.f296115a) && Intrinsics.f(this.f296116b, mVar.f296116b) && Intrinsics.f(this.f296117c, mVar.f296117c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f296118g, mVar.f296118g) && Intrinsics.f(this.f296119h, mVar.f296119h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f296120j, mVar.f296120j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f296121l, mVar.f296121l) && Intrinsics.f(this.f296122m, mVar.f296122m) && this.f296123n == mVar.f296123n && this.o == mVar.o && Intrinsics.f(this.f296124p, mVar.f296124p) && this.f296125q == mVar.f296125q && this.f296126r == mVar.f296126r && this.f296127s == mVar.f296127s && this.f296128t == mVar.f296128t && this.u == mVar.u && Intrinsics.f(this.v, mVar.v) && Intrinsics.f(this.f296129w, mVar.f296129w) && Intrinsics.f(this.f296130x, mVar.f296130x);
    }

    public final int hashCode() {
        int iHashCode = this.f296115a.hashCode() * 31;
        String str = this.f296116b;
        int i = v7.i(this.f296117c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int iC = j6.a.c((i + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (this.f296118g.hashCode() + ((iC + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f296119h;
        int iD = p.a.d(p.a.d((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.f296120j);
        DeliveryMethods.DeliveryMethod deliveryMethod = this.k;
        int iHashCode3 = (iD + (deliveryMethod == null ? 0 : deliveryMethod.hashCode())) * 31;
        Address address = this.f296121l;
        int iC2 = a0.d.c(a0.d.c(h30.l.j(this.f296122m, (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31, 31), 31, this.f296123n), 31, this.o);
        Long l2 = this.f296124p;
        int iD2 = p.a.d(p.a.d(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f296125q), 31, this.f296126r), 31, this.f296127s), 31, this.f296128t), 31, this.u), 31, this.v), 31, this.f296129w);
        xbc.b bVar = this.f296130x;
        return iD2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
