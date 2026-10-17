package d3c;

import com.revolut.feature.address.models.Address;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f111019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111020c;
    public final long d;
    public final long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111022h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Address f111023j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f111024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f111025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f111026n;
    public final dj0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f111027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f111028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f111029r;

    public h(String id10, g0 state, String createdBy, long j2, long j3, Long l2, String merchantId, String orderNumber, dj0.d totalAmount, Address deliveryAddress, k paymentMethod, ArrayList items, ArrayList shipments, dj0.d dVar, dj0.d dVar2, i iVar, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        this.f111018a = id10;
        this.f111019b = state;
        this.f111020c = createdBy;
        this.d = j2;
        this.e = j3;
        this.f = l2;
        this.f111021g = merchantId;
        this.f111022h = orderNumber;
        this.i = totalAmount;
        this.f111023j = deliveryAddress;
        this.k = paymentMethod;
        this.f111024l = items;
        this.f111025m = shipments;
        this.f111026n = dVar;
        this.o = dVar2;
        this.f111027p = iVar;
        this.f111028q = str;
        this.f111029r = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f111018a, hVar.f111018a) && this.f111019b == hVar.f111019b && Intrinsics.f(this.f111020c, hVar.f111020c) && this.d == hVar.d && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f111021g, hVar.f111021g) && Intrinsics.f(this.f111022h, hVar.f111022h) && this.i.equals(hVar.i) && this.f111023j.equals(hVar.f111023j) && this.k.equals(hVar.k) && this.f111024l.equals(hVar.f111024l) && this.f111025m.equals(hVar.f111025m) && Intrinsics.f(this.f111026n, hVar.f111026n) && Intrinsics.f(this.o, hVar.o) && this.f111027p == hVar.f111027p && Intrinsics.f(this.f111028q, hVar.f111028q) && this.f111029r == hVar.f111029r;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c((this.f111019b.hashCode() + (this.f111018a.hashCode() * 31)) * 31, 31, this.f111020c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f111025m, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f111024l, (this.k.hashCode() + ((this.f111023j.hashCode() + v7.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f111021g), 31, this.f111022h), 31, this.i)) * 31)) * 31, 31), 31);
        dj0.d dVar = this.f111026n;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.o;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        i iVar = this.f111027p;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f111028q;
        return Boolean.hashCode(this.f111029r) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
