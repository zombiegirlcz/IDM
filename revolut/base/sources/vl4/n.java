package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f290276c;

    public n(String header, String mainText, l lVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        this.f290274a = header;
        this.f290275b = mainText;
        this.f290276c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f290274a, nVar.f290274a) && Intrinsics.f(this.f290275b, nVar.f290275b) && Intrinsics.f(this.f290276c, nVar.f290276c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f290274a.hashCode() * 31, 31, this.f290275b);
        l lVar = this.f290276c;
        return iC + (lVar == null ? 0 : lVar.hashCode());
    }
}
