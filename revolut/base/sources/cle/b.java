package cle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vke.c f24978a;

    public b(vke.c banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f24978a = banner;
    }

    @Override // cle.e
    public final vke.c a() {
        return this.f24978a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f24978a, ((b) obj2).f24978a);
    }

    public final int hashCode() {
        return this.f24978a.hashCode();
    }
}
