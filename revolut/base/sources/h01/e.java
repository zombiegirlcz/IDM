package h01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f148171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f148172b;

    public e(c appearance, d source) {
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f148171a = appearance;
        this.f148172b = source;
    }

    public final c a() {
        return this.f148171a;
    }

    public final d b() {
        return this.f148172b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f148171a == eVar.f148171a && this.f148172b == eVar.f148172b;
    }

    public final int hashCode() {
        return this.f148172b.hashCode() + (this.f148171a.hashCode() * 31);
    }
}
