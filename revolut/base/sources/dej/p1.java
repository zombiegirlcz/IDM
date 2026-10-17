package dej;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f113615b;

    public p1(String simProfileId, ArrayList scopes) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f113614a = simProfileId;
        this.f113615b = scopes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f113614a, p1Var.f113614a) && this.f113615b.equals(p1Var.f113615b);
    }

    public final int hashCode() {
        return this.f113615b.hashCode() + (this.f113614a.hashCode() * 31);
    }
}
