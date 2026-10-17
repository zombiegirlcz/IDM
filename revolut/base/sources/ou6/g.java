package ou6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f229824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f229826c;
    public final boolean d;

    public g() {
        this(h0.f322473a, false, false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f229824a, gVar.f229824a) && this.f229825b == gVar.f229825b && this.f229826c == gVar.f229826c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f229824a.hashCode() * 31, 31, this.f229825b), 31, this.f229826c);
    }

    public g(Set availableSaleTypes, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        this.f229824a = availableSaleTypes;
        this.f229825b = z;
        this.f229826c = z3;
        this.d = z4;
    }
}
