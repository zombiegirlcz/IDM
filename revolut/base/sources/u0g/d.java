package u0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f276190b;

    public d(String provider, c logos) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(logos, "logos");
        this.f276189a = provider;
        this.f276190b = logos;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f276189a, dVar.f276189a) && Intrinsics.f(this.f276190b, dVar.f276190b);
    }

    public final int hashCode() {
        return this.f276190b.hashCode() + (this.f276189a.hashCode() * 31);
    }
}
