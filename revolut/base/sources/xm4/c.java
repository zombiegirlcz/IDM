package xm4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f307076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f307078c;
    public final String d;

    public c(a selectedOption, List discountOptions, long j2, String str) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(discountOptions, "discountOptions");
        this.f307076a = selectedOption;
        this.f307077b = discountOptions;
        this.f307078c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f307076a, cVar.f307076a) && Intrinsics.f(this.f307077b, cVar.f307077b) && this.f307078c == cVar.f307078c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.d(this.f307076a.hashCode() * 31, 31, this.f307077b), 31, this.f307078c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
