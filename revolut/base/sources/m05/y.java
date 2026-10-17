package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201087c;
    public final String d;
    public final String e;

    public /* synthetic */ y(long j2, int i, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(w.f201084a.getDescriptor(), i, 31);
            throw null;
        }
        this.f201085a = str;
        this.f201086b = j2;
        this.f201087c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f201085a, yVar.f201085a) && this.f201086b == yVar.f201086b && Intrinsics.f(this.f201087c, yVar.f201087c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f201085a.hashCode() * 31, 31, this.f201086b), 31, this.f201087c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public y(long j2, String productType, String currency, String str, String str2) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f201085a = productType;
        this.f201086b = j2;
        this.f201087c = currency;
        this.d = str;
        this.e = str2;
    }
}
