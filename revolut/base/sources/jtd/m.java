package jtd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f178484a;

    public m(l esimValue) {
        Intrinsics.checkNotNullParameter(esimValue, "esimValue");
        this.f178484a = esimValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f178484a, ((m) obj2).f178484a);
    }

    public final int hashCode() {
        return this.f178484a.hashCode();
    }
}
