package d3c;

import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111073c;
    public final List d;
    public final String e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f111074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f111075h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f111076j;
    public final a k;

    public x(String sku, long j2, String smallImage, List images, String str, dj0.d price, dj0.d dVar, dj0.d deliveryPrice, long j3, ArrayList promotions, a assets) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(smallImage, "smallImage");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(deliveryPrice, "deliveryPrice");
        Intrinsics.checkNotNullParameter(promotions, "promotions");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f111071a = sku;
        this.f111072b = j2;
        this.f111073c = smallImage;
        this.d = images;
        this.e = str;
        this.f = price;
        this.f111074g = dVar;
        this.f111075h = deliveryPrice;
        this.i = j3;
        this.f111076j = promotions;
        this.k = assets;
    }

    public final j0 a(k0 promotionType) {
        Object next;
        Intrinsics.checkNotNullParameter(promotionType, "promotionType");
        Iterator it8 = this.f111076j.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((j0) next).f111039a == promotionType) {
                break;
            }
        }
        return (j0) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f111071a, xVar.f111071a) && this.f111072b == xVar.f111072b && Intrinsics.f(this.f111073c, xVar.f111073c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && this.f.equals(xVar.f) && Intrinsics.f(this.f111074g, xVar.f111074g) && this.f111075h.equals(xVar.f111075h) && this.i == xVar.i && this.f111076j.equals(xVar.f111076j) && this.k.equals(xVar.k);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(a0.d.c(this.f111071a.hashCode() * 31, 31, this.f111072b), 31, this.f111073c), 31, this.d);
        String str = this.e;
        int iC = v7.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        dj0.d dVar = this.f111074g;
        return this.k.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f111076j, a0.d.c(v7.c((iC + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f111075h), 31, this.i), 31);
    }
}
