package d3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IppProductType f111035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111036c;
    public final dj0.d d;
    public final dj0.d e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f111037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f111038h;

    public j(String sku, IppProductType type, long j2, dj0.d unitPrice, dj0.d totalPrice, d0 metadata, g strings, f images) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f111034a = sku;
        this.f111035b = type;
        this.f111036c = j2;
        this.d = unitPrice;
        this.e = totalPrice;
        this.f = metadata;
        this.f111037g = strings;
        this.f111038h = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f111034a, jVar.f111034a) && Intrinsics.f(this.f111035b, jVar.f111035b) && this.f111036c == jVar.f111036c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f111037g, jVar.f111037g) && Intrinsics.f(this.f111038h, jVar.f111038h);
    }

    public final int hashCode() {
        return this.f111038h.hashCode() + ((this.f111037g.hashCode() + ((this.f.hashCode() + v7.c(v7.c(a0.d.c((this.f111035b.hashCode() + (this.f111034a.hashCode() * 31)) * 31, 31, this.f111036c), 31, this.d), 31, this.e)) * 31)) * 31);
    }
}
