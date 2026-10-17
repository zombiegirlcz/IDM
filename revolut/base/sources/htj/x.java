package htj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155447c;
    public final String d;

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(v.f155444a.getDescriptor(), i, 15);
            throw null;
        }
        this.f155445a = str;
        this.f155446b = str2;
        this.f155447c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f155445a, xVar.f155445a) && Intrinsics.f(this.f155446b, xVar.f155446b) && Intrinsics.f(this.f155447c, xVar.f155447c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f155445a.hashCode() * 31, 31, this.f155446b), 31, this.f155447c);
    }

    public x(String productName, String originCountry, String shippingFrom, String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingFrom, "shippingFrom");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        this.f155445a = productName;
        this.f155446b = originCountry;
        this.f155447c = shippingFrom;
        this.d = destinationCountry;
    }
}
