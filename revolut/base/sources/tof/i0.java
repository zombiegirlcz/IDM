package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272793b;

    public i0(String walletAddress, String link) {
        Intrinsics.checkNotNullParameter(walletAddress, "walletAddress");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f272792a = walletAddress;
        this.f272793b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f272792a, i0Var.f272792a) && Intrinsics.f(this.f272793b, i0Var.f272793b);
    }

    public final int hashCode() {
        return this.f272793b.hashCode() + (this.f272792a.hashCode() * 31);
    }
}
