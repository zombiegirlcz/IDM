package hcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151072b;

    public m0(String ref2, List recommendations) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f151071a = ref2;
        this.f151072b = recommendations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f151071a, m0Var.f151071a) && Intrinsics.f(this.f151072b, m0Var.f151072b);
    }

    public final int hashCode() {
        return this.f151072b.hashCode() + (this.f151071a.hashCode() * 31);
    }
}
