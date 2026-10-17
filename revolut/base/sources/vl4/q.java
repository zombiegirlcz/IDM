package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f290280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290281b;

    public q(t tVar, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f290280a = tVar;
        this.f290281b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f290280a == qVar.f290280a && Intrinsics.f(this.f290281b, qVar.f290281b);
    }

    public final int hashCode() {
        t tVar = this.f290280a;
        return this.f290281b.hashCode() + ((tVar == null ? 0 : tVar.hashCode()) * 31);
    }
}
