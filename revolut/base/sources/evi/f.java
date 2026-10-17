package evi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f129964b;

    public f(List items, lw0.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f129963a = items;
        this.f129964b = aVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f129963a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f129963a, fVar.f129963a) && Intrinsics.f(this.f129964b, fVar.f129964b);
    }

    public final int hashCode() {
        int iHashCode = this.f129963a.hashCode() * 31;
        m mVar = this.f129964b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
