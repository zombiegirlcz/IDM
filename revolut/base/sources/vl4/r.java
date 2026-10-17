package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f290284c;
    public final o d;

    public r(String header, String mainText, q qVar, o oVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        this.f290282a = header;
        this.f290283b = mainText;
        this.f290284c = qVar;
        this.d = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f290282a, rVar.f290282a) && Intrinsics.f(this.f290283b, rVar.f290283b) && Intrinsics.f(this.f290284c, rVar.f290284c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f290282a.hashCode() * 31, 31, this.f290283b);
        q qVar = this.f290284c;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        o oVar = this.d;
        return iHashCode + (oVar != null ? oVar.f290277a.hashCode() : 0);
    }
}
