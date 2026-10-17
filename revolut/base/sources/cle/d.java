package cle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vke.c f24980a;

    public d(vke.c banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f24980a = banner;
    }

    @Override // cle.e
    public final vke.c a() {
        return this.f24980a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f24980a, ((d) obj2).f24980a);
    }

    public final int hashCode() {
        return this.f24980a.hashCode();
    }
}
