package nrf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f218643c;

    public h(dj0.d total, dj0.d dVar, List breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f218641a = total;
        this.f218642b = breakdown;
        this.f218643c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f218641a, hVar.f218641a) && Intrinsics.f(this.f218642b, hVar.f218642b) && Intrinsics.f(this.f218643c, hVar.f218643c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f218641a.hashCode() * 31, 31, this.f218642b);
        dj0.d dVar = this.f218643c;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }
}
