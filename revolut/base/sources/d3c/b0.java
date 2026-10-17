package d3c;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110995c;
    public final String d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f110996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f110997h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f110998j;
    public final n0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f110999l;

    public b0(String id10, String str, String createdBy, String merchantId, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, ArrayList items, ArrayList shipments, String str2, n0 n0Var, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        this.f110993a = id10;
        this.f110994b = str;
        this.f110995c = createdBy;
        this.d = merchantId;
        this.e = dVar;
        this.f = dVar2;
        this.f110996g = dVar3;
        this.f110997h = items;
        this.i = shipments;
        this.f110998j = str2;
        this.k = n0Var;
        this.f110999l = str3;
    }

    public static b0 a(b0 b0Var, ArrayList items) {
        String id10 = b0Var.f110993a;
        String str = b0Var.f110994b;
        String createdBy = b0Var.f110995c;
        String merchantId = b0Var.d;
        dj0.d dVar = b0Var.e;
        dj0.d dVar2 = b0Var.f;
        dj0.d dVar3 = b0Var.f110996g;
        ArrayList shipments = b0Var.i;
        String str2 = b0Var.f110998j;
        n0 n0Var = b0Var.k;
        String str3 = b0Var.f110999l;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        return new b0(id10, str, createdBy, merchantId, dVar, dVar2, dVar3, items, shipments, str2, n0Var, str3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f110993a, b0Var.f110993a) && Intrinsics.f(this.f110994b, b0Var.f110994b) && Intrinsics.f(this.f110995c, b0Var.f110995c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f110996g, b0Var.f110996g) && this.f110997h.equals(b0Var.f110997h) && this.i.equals(b0Var.i) && Intrinsics.f(this.f110998j, b0Var.f110998j) && Intrinsics.f(this.k, b0Var.k) && Intrinsics.f(this.f110999l, b0Var.f110999l);
    }

    public final int hashCode() {
        int iHashCode = this.f110993a.hashCode() * 31;
        String str = this.f110994b;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f110995c), 31, this.d);
        dj0.d dVar = this.e;
        int iHashCode2 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f110996g;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f110997h, (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31, 31), 31);
        String str2 = this.f110998j;
        int iHashCode4 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        n0 n0Var = this.k;
        int iHashCode5 = (iHashCode4 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str3 = this.f110999l;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
