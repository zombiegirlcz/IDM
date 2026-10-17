package iqg;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f167840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f167841b;

    public h(j spareChanges, s vault) {
        Intrinsics.checkNotNullParameter(spareChanges, "spareChanges");
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f167840a = spareChanges;
        this.f167841b = vault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f167840a, hVar.f167840a) && Intrinsics.f(this.f167841b, hVar.f167841b);
    }

    public final int hashCode() {
        return this.f167841b.hashCode() + (this.f167840a.hashCode() * 31);
    }
}
