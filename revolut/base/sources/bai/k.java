package bai;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14103a;

    public k(List acceptedTerms) {
        Intrinsics.checkNotNullParameter(acceptedTerms, "acceptedTerms");
        this.f14103a = acceptedTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f14103a, ((k) obj2).f14103a);
    }

    public final int hashCode() {
        return this.f14103a.hashCode();
    }
}
