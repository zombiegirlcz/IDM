package yt8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f316667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f316668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f316669c;
    public final g d;

    public f(i status, j element, h hVar, g gVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f316667a = status;
        this.f316668b = element;
        this.f316669c = hVar;
        this.d = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f316667a == fVar.f316667a && this.f316668b == fVar.f316668b && this.f316669c == fVar.f316669c && this.d == fVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f316668b.hashCode() + (this.f316667a.hashCode() * 31)) * 31;
        h hVar = this.f316669c;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.d;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
