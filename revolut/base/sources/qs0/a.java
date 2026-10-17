package qs0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp0.a f248739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f248740b;

    public a(hp0.a aVar, int i) {
        this.f248739a = aVar;
        this.f248740b = i;
    }

    public final hp0.a a() {
        return this.f248739a;
    }

    public final int b() {
        return this.f248740b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248739a, aVar.f248739a) && this.f248740b == aVar.f248740b;
    }

    public final int hashCode() {
        hp0.a aVar = this.f248739a;
        return Integer.hashCode(this.f248740b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
