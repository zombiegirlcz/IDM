package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215762b;

    public e0(String hash, String link) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f215761a = hash;
        this.f215762b = link;
    }

    public final String a() {
        return this.f215761a;
    }

    public final String b() {
        return this.f215762b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f215761a, e0Var.f215761a) && Intrinsics.f(this.f215762b, e0Var.f215762b);
    }

    public final int hashCode() {
        return this.f215762b.hashCode() + (this.f215761a.hashCode() * 31);
    }
}
