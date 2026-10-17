package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f122846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uh0.b f122847b;

    public g(i iVar, uh0.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f122846a = iVar;
        this.f122847b = request;
    }

    @Override // e60.h
    public final i a() {
        return this.f122846a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f122846a, gVar.f122846a) && Intrinsics.f(this.f122847b, gVar.f122847b);
    }

    public final int hashCode() {
        i iVar = this.f122846a;
        return this.f122847b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
    }
}
