package ft3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f137836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f137837c;

    public h1(String id10, d1 productClassification, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f137835a = id10;
        this.f137836b = productClassification;
        this.f137837c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f137835a, h1Var.f137835a) && Intrinsics.f(this.f137836b, h1Var.f137836b) && Intrinsics.f(this.f137837c, h1Var.f137837c);
    }

    public final int hashCode() {
        return this.f137837c.f297794a.hashCode() + ((this.f137836b.hashCode() + (this.f137835a.hashCode() * 31)) * 31);
    }
}
