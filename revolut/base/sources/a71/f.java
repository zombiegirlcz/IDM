package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1732c;

    public f(String legalInfo, String copyright, String supportPhoneNumber) {
        Intrinsics.checkNotNullParameter(legalInfo, "legalInfo");
        Intrinsics.checkNotNullParameter(copyright, "copyright");
        Intrinsics.checkNotNullParameter(supportPhoneNumber, "supportPhoneNumber");
        this.f1730a = legalInfo;
        this.f1731b = copyright;
        this.f1732c = supportPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f1730a, fVar.f1730a) && Intrinsics.f(this.f1731b, fVar.f1731b) && Intrinsics.f(this.f1732c, fVar.f1732c);
    }

    public final int hashCode() {
        return this.f1732c.hashCode() + p.a.c(this.f1730a.hashCode() * 31, 31, this.f1731b);
    }
}
