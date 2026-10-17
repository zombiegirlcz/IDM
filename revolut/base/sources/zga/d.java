package zga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wga.i f322097a;

    public d(wga.i banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f322097a = banner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322097a, ((d) obj2).f322097a);
    }

    public final int hashCode() {
        return this.f322097a.hashCode();
    }
}
