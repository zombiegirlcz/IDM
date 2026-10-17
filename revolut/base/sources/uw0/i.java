package uw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f283503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f283504c;

    public i(String id10, g playPolicy, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(playPolicy, "playPolicy");
        this.f283502a = id10;
        this.f283503b = playPolicy;
        this.f283504c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f283502a, iVar.f283502a) && this.f283503b == iVar.f283503b && this.f283504c == iVar.f283504c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283504c) + ((this.f283503b.hashCode() + (this.f283502a.hashCode() * 31)) * 31);
    }
}
