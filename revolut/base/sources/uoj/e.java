package uoj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f281656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281657b;

    public e(a season, boolean z) {
        Intrinsics.checkNotNullParameter(season, "season");
        this.f281656a = season;
        this.f281657b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f281656a == eVar.f281656a && this.f281657b == eVar.f281657b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281657b) + (this.f281656a.hashCode() * 31);
    }
}
