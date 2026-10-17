package d3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IppProductType f111004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f111005c;
    public final long d;
    public final long e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f111006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f111007h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f111008j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f111009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f111010m;

    public c0(String sku, IppProductType type, e0 state, long j2, long j3, dj0.d unitPrice, dj0.d unitPriceWithoutDiscounts, dj0.d totalPrice, dj0.d totalPriceWithoutDiscounts, d0 metadata, List promotions, g strings, f images) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(unitPriceWithoutDiscounts, "unitPriceWithoutDiscounts");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(totalPriceWithoutDiscounts, "totalPriceWithoutDiscounts");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(promotions, "promotions");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f111003a = sku;
        this.f111004b = type;
        this.f111005c = state;
        this.d = j2;
        this.e = j3;
        this.f = unitPrice;
        this.f111006g = unitPriceWithoutDiscounts;
        this.f111007h = totalPrice;
        this.i = totalPriceWithoutDiscounts;
        this.f111008j = metadata;
        this.k = promotions;
        this.f111009l = strings;
        this.f111010m = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f111003a, c0Var.f111003a) && Intrinsics.f(this.f111004b, c0Var.f111004b) && this.f111005c == c0Var.f111005c && this.d == c0Var.d && this.e == c0Var.e && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f111006g, c0Var.f111006g) && Intrinsics.f(this.f111007h, c0Var.f111007h) && Intrinsics.f(this.i, c0Var.i) && Intrinsics.f(this.f111008j, c0Var.f111008j) && Intrinsics.f(this.k, c0Var.k) && Intrinsics.f(this.f111009l, c0Var.f111009l) && Intrinsics.f(this.f111010m, c0Var.f111010m);
    }

    public final int hashCode() {
        return this.f111010m.hashCode() + ((this.f111009l.hashCode() + p.a.d((this.f111008j.hashCode() + v7.c(v7.c(v7.c(v7.c(a0.d.c(a0.d.c((this.f111005c.hashCode() + ((this.f111004b.hashCode() + (this.f111003a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f111006g), 31, this.f111007h), 31, this.i)) * 31, 31, this.k)) * 31);
    }
}
