package wga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f297275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f297276b;

    public i(d content, e offer) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(offer, "offer");
        this.f297275a = content;
        this.f297276b = offer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f297275a, iVar.f297275a) && Intrinsics.f(this.f297276b, iVar.f297276b);
    }

    public final int hashCode() {
        return this.f297276b.f297272a.hashCode() + (this.f297275a.hashCode() * 31);
    }
}
