package ysj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316497c;
    public final String d;

    public /* synthetic */ q(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(o.f316494a.getDescriptor(), i, 15);
            throw null;
        }
        this.f316495a = str;
        this.f316496b = str2;
        this.f316497c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f316495a, qVar.f316495a) && Intrinsics.f(this.f316496b, qVar.f316496b) && Intrinsics.f(this.f316497c, qVar.f316497c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f316495a.hashCode() * 31, 31, this.f316496b), 31, this.f316497c);
    }

    public q(String productName, String originCountry, String shippingFrom, String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingFrom, "shippingFrom");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        this.f316495a = productName;
        this.f316496b = originCountry;
        this.f316497c = shippingFrom;
        this.d = destinationCountry;
    }
}
