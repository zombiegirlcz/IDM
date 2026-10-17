package a7l;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import i93.d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1936c;
    public final Address d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1938h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f1939j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1942n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f1943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f1944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f1945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f1946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set f1947t;
    public final Long u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CardDeliveryRecipient f1948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f1949x;

    public a(String str, String cardBrand, String encryptedPin, Address address, String deliveryMethodName, String cardDesignName, String str2, boolean z, String str3, String str4, String str5, String idempotencyKey, String str6, boolean z3, String str7, String str8, Boolean bool, Boolean bool2, d dVar, Set set, Long l2, dj0.d dVar2, CardDeliveryRecipient cardDeliveryRecipient, String str9) {
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(encryptedPin, "encryptedPin");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deliveryMethodName, "deliveryMethodName");
        Intrinsics.checkNotNullParameter(cardDesignName, "cardDesignName");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f1934a = str;
        this.f1935b = cardBrand;
        this.f1936c = encryptedPin;
        this.d = address;
        this.e = deliveryMethodName;
        this.f = cardDesignName;
        this.f1937g = str2;
        this.f1938h = z;
        this.i = str3;
        this.f1939j = str4;
        this.k = str5;
        this.f1940l = idempotencyKey;
        this.f1941m = str6;
        this.f1942n = z3;
        this.o = str7;
        this.f1943p = str8;
        this.f1944q = bool;
        this.f1945r = bool2;
        this.f1946s = dVar;
        this.f1947t = set;
        this.u = l2;
        this.v = dVar2;
        this.f1948w = cardDeliveryRecipient;
        this.f1949x = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f1934a, aVar.f1934a) && Intrinsics.f(this.f1935b, aVar.f1935b) && Intrinsics.f(this.f1936c, aVar.f1936c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f1937g, aVar.f1937g) && this.f1938h == aVar.f1938h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f1939j, aVar.f1939j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f1940l, aVar.f1940l) && Intrinsics.f(this.f1941m, aVar.f1941m) && this.f1942n == aVar.f1942n && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f1943p, aVar.f1943p) && Intrinsics.f(this.f1944q, aVar.f1944q) && Intrinsics.f(this.f1945r, aVar.f1945r) && this.f1946s == aVar.f1946s && Intrinsics.f(this.f1947t, aVar.f1947t) && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f1948w, aVar.f1948w) && Intrinsics.f(this.f1949x, aVar.f1949x);
    }

    public final int hashCode() {
        String str = this.f1934a;
        int iC = p.a.c(p.a.c((this.d.hashCode() + p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f1935b), 31, this.f1936c)) * 31, 31, this.e), 31, this.f);
        String str2 = this.f1937g;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f1938h);
        String str3 = this.i;
        int iHashCode = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1939j;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iC3 = p.a.c((iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f1940l);
        String str6 = this.f1941m;
        int iC4 = j6.a.c((iC3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f1942n);
        String str7 = this.o;
        int iHashCode3 = (iC4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1943p;
        int iHashCode4 = (iHashCode3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.f1944q;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f1945r;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d dVar = this.f1946s;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Set set = this.f1947t;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        Long l2 = this.u;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        dj0.d dVar2 = this.v;
        int iHashCode10 = (iHashCode9 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        CardDeliveryRecipient cardDeliveryRecipient = this.f1948w;
        int iHashCode11 = (iHashCode10 + (cardDeliveryRecipient == null ? 0 : cardDeliveryRecipient.hashCode())) * 31;
        String str9 = this.f1949x;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }
}
