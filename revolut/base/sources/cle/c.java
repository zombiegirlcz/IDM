package cle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vke.c f24979a;

    public c(vke.c banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f24979a = banner;
    }

    @Override // cle.e
    public final vke.c a() {
        return this.f24979a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f24979a, ((c) obj2).f24979a);
    }

    public final int hashCode() {
        return this.f24979a.hashCode();
    }
}
