package u0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f276193c;

    public e(double d, int i, String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f276191a = experienceId;
        this.f276192b = i;
        this.f276193c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276191a, eVar.f276191a) && this.f276192b == eVar.f276192b && Double.compare(this.f276193c, eVar.f276193c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f276193c) + j6.a.b(this.f276192b, this.f276191a.hashCode() * 31, 31);
    }
}
