package qgg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f245833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245834b;

    public h(g gVar, String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        this.f245833a = gVar;
        this.f245834b = externalId;
    }

    public static h a(h hVar, g gVar, String externalId, int i) {
        if ((i & 1) != 0) {
            gVar = hVar.f245833a;
        }
        if ((i & 2) != 0) {
            externalId = hVar.f245834b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        return new h(gVar, externalId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f245833a, hVar.f245833a) && Intrinsics.f(this.f245834b, hVar.f245834b);
    }

    public final int hashCode() {
        g gVar = this.f245833a;
        return this.f245834b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }
}
