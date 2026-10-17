package d3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IppProductType f111081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111082c;

    public z(String sku, IppProductType type, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f111080a = sku;
        this.f111081b = type;
        this.f111082c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f111080a, zVar.f111080a) && Intrinsics.f(this.f111081b, zVar.f111081b) && this.f111082c == zVar.f111082c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111082c) + ((this.f111081b.hashCode() + (this.f111080a.hashCode() * 31)) * 31);
    }
}
