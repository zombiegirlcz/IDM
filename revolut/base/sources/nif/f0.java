package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215788b;

    public f0(String walletAddress, String link) {
        Intrinsics.checkNotNullParameter(walletAddress, "walletAddress");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f215787a = walletAddress;
        this.f215788b = link;
    }

    public final String a() {
        return this.f215788b;
    }

    public final String b() {
        return this.f215787a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f215787a, f0Var.f215787a) && Intrinsics.f(this.f215788b, f0Var.f215788b);
    }

    public final int hashCode() {
        return this.f215788b.hashCode() + (this.f215787a.hashCode() * 31);
    }
}
