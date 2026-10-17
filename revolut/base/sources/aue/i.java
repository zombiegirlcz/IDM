package aue;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f9810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f9811c;

    public i(c type, dj0.d totalLimit, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        this.f9809a = type;
        this.f9810b = totalLimit;
        this.f9811c = dVar;
    }

    @Override // aue.l
    public final c a() {
        return this.f9809a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f9809a == iVar.f9809a && Intrinsics.f(this.f9810b, iVar.f9810b) && Intrinsics.f(this.f9811c, iVar.f9811c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f9809a.hashCode() * 31, 31, this.f9810b);
        dj0.d dVar = this.f9811c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
