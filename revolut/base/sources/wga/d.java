package wga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f297269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oga.c f297270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f297271c;

    public d(h title, oga.c cVar, c action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f297269a = title;
        this.f297270b = cVar;
        this.f297271c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f297269a, dVar.f297269a) && Intrinsics.f(this.f297270b, dVar.f297270b) && Intrinsics.f(this.f297271c, dVar.f297271c);
    }

    public final int hashCode() {
        int iHashCode = this.f297269a.hashCode() * 31;
        oga.c cVar = this.f297270b;
        return this.f297271c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
