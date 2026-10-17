package qib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f246693c;
    public final b d;

    public i(String id10, String challengeId, g progress, b automation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(automation, "automation");
        this.f246691a = id10;
        this.f246692b = challengeId;
        this.f246693c = progress;
        this.d = automation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f246691a, iVar.f246691a) && Intrinsics.f(this.f246692b, iVar.f246692b) && Intrinsics.f(this.f246693c, iVar.f246693c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f246693c.hashCode() + p.a.c(this.f246691a.hashCode() * 31, 31, this.f246692b)) * 31);
    }
}
