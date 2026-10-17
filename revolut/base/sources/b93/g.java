package b93;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f13619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13621c;
    public final Address d;
    public final d93.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c93.j f13623h;
    public final c93.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c93.j f13624j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f13625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f13626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f13627n;
    public final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj0.d f13628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i93.d f13629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f13630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Long f13631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dj0.d f13632t;
    public final CardDeliveryRecipient u;
    public final String v;

    public g(e93.f design, String str, String str2, Address address, d93.b bVar, String str3, String str4, c93.j jVar, c93.j jVar2, c93.j jVar3, String str5, String str6, String str7, Boolean bool, Boolean bool2, dj0.d dVar, i93.d dVar2, Set set, Long l2, dj0.d dVar3, CardDeliveryRecipient cardDeliveryRecipient, String str8) {
        Intrinsics.checkNotNullParameter(design, "design");
        this.f13619a = design;
        this.f13620b = str;
        this.f13621c = str2;
        this.d = address;
        this.e = bVar;
        this.f = str3;
        this.f13622g = str4;
        this.f13623h = jVar;
        this.i = jVar2;
        this.f13624j = jVar3;
        this.k = str5;
        this.f13625l = str6;
        this.f13626m = str7;
        this.f13627n = bool;
        this.o = bool2;
        this.f13628p = dVar;
        this.f13629q = dVar2;
        this.f13630r = set;
        this.f13631s = l2;
        this.f13632t = dVar3;
        this.u = cardDeliveryRecipient;
        this.v = str8;
    }

    public static g a(g gVar, d93.b bVar, c93.j jVar, Long l2, dj0.d dVar, String str, int i) {
        Set set;
        Long l3;
        CardDeliveryRecipient cardDeliveryRecipient;
        String str2;
        e93.f design = gVar.f13619a;
        String str3 = gVar.f13620b;
        String str4 = gVar.f13621c;
        Address address = gVar.d;
        d93.b bVar2 = (i & 16) != 0 ? gVar.e : bVar;
        String str5 = gVar.f;
        d93.b bVar3 = bVar2;
        String str6 = gVar.f13622g;
        c93.j jVar2 = gVar.f13623h;
        c93.j jVar3 = (i & 256) != 0 ? gVar.i : jVar;
        c93.j jVar4 = gVar.f13624j;
        c93.j jVar5 = jVar3;
        String str7 = gVar.k;
        String str8 = gVar.f13625l;
        String str9 = gVar.f13626m;
        Boolean bool = gVar.f13627n;
        Boolean bool2 = gVar.o;
        dj0.d dVar2 = gVar.f13628p;
        i93.d dVar3 = gVar.f13629q;
        Set set2 = gVar.f13630r;
        if ((i & 262144) != 0) {
            set = set2;
            l3 = gVar.f13631s;
        } else {
            set = set2;
            l3 = l2;
        }
        Long l4 = l3;
        dj0.d dVar4 = (i & 524288) != 0 ? gVar.f13632t : dVar;
        CardDeliveryRecipient cardDeliveryRecipient2 = gVar.u;
        if ((i & PKIFailureInfo.badSenderNonce) != 0) {
            cardDeliveryRecipient = cardDeliveryRecipient2;
            str2 = gVar.v;
        } else {
            cardDeliveryRecipient = cardDeliveryRecipient2;
            str2 = str;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(design, "design");
        return new g(design, str3, str4, address, bVar3, str5, str6, jVar2, jVar5, jVar4, str7, str8, str9, bool, bool2, dVar2, dVar3, set, l4, dVar4, cardDeliveryRecipient, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f13619a, gVar.f13619a) && Intrinsics.f(this.f13620b, gVar.f13620b) && Intrinsics.f(this.f13621c, gVar.f13621c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f13622g, gVar.f13622g) && Intrinsics.f(this.f13623h, gVar.f13623h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f13624j, gVar.f13624j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f13625l, gVar.f13625l) && Intrinsics.f(this.f13626m, gVar.f13626m) && Intrinsics.f(this.f13627n, gVar.f13627n) && Intrinsics.f(this.o, gVar.o) && Intrinsics.f(this.f13628p, gVar.f13628p) && this.f13629q == gVar.f13629q && Intrinsics.f(this.f13630r, gVar.f13630r) && Intrinsics.f(this.f13631s, gVar.f13631s) && Intrinsics.f(this.f13632t, gVar.f13632t) && Intrinsics.f(this.u, gVar.u) && Intrinsics.f(this.v, gVar.v);
    }

    public final int hashCode() {
        int iHashCode = this.f13619a.hashCode() * 31;
        String str = this.f13620b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13621c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.d;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        d93.b bVar = this.e;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13622g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c93.j jVar = this.f13623h;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        c93.j jVar2 = this.i;
        int iHashCode9 = (iHashCode8 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        c93.j jVar3 = this.f13624j;
        int iHashCode10 = (iHashCode9 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13625l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f13626m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f13627n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        dj0.d dVar = this.f13628p;
        int iHashCode16 = (iHashCode15 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i93.d dVar2 = this.f13629q;
        int iHashCode17 = (iHashCode16 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Set set = this.f13630r;
        int iHashCode18 = (iHashCode17 + (set == null ? 0 : set.hashCode())) * 31;
        Long l2 = this.f13631s;
        int iHashCode19 = (iHashCode18 + (l2 == null ? 0 : l2.hashCode())) * 31;
        dj0.d dVar3 = this.f13632t;
        int iHashCode20 = (iHashCode19 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        CardDeliveryRecipient cardDeliveryRecipient = this.u;
        int iHashCode21 = (iHashCode20 + (cardDeliveryRecipient == null ? 0 : cardDeliveryRecipient.hashCode())) * 31;
        String str8 = this.v;
        return iHashCode21 + (str8 != null ? str8.hashCode() : 0);
    }

    public /* synthetic */ g(e93.f fVar, String str, String str2, Address address, d93.b bVar, String str3, String str4, c93.j jVar, c93.j jVar2, c93.j jVar3, String str5, String str6, String str7, Boolean bool, Boolean bool2, dj0.d dVar, i93.d dVar2, Set set, CardDeliveryRecipient cardDeliveryRecipient, int i) {
        this(fVar, str, str2, address, bVar, str3, str4, jVar, jVar2, jVar3, str5, str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : bool2, (32768 & i) != 0 ? null : dVar, (65536 & i) != 0 ? null : dVar2, (131072 & i) != 0 ? null : set, null, null, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : cardDeliveryRecipient, null);
    }
}
