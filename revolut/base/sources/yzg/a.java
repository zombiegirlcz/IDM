package yzg;

import dfl.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f318102b;

    public a(String instrument, x locked) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(locked, "locked");
        this.f318101a = instrument;
        this.f318102b = locked;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f318101a, aVar.f318101a) && Intrinsics.f(this.f318102b, aVar.f318102b);
    }

    public final int hashCode() {
        return this.f318102b.f114516a.hashCode() + (this.f318101a.hashCode() * 31);
    }
}
