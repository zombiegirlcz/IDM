package bk4;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements ux4.e, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f16253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16254c;
    public final String d;

    public d(int i, dj0.d monthlyRepayment, String htmlUrl, String pdfUrl) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        this.f16252a = i;
        this.f16253b = monthlyRepayment;
        this.f16254c = htmlUrl;
        this.d = pdfUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f16252a == dVar.f16252a && Intrinsics.f(this.f16253b, dVar.f16253b) && Intrinsics.f(this.f16254c, dVar.f16254c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(v7.c(Integer.hashCode(this.f16252a) * 31, 31, this.f16253b), 31, this.f16254c);
    }

    @Override // ux4.e
    public final String j8() {
        return this.d;
    }

    @Override // ux4.e
    public final String v5() {
        return this.f16254c;
    }
}
