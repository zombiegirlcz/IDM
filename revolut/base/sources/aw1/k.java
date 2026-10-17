package aw1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10657b;

    public k(String keyValue, String ownerAgent) {
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        Intrinsics.checkNotNullParameter(ownerAgent, "ownerAgent");
        this.f10656a = keyValue;
        this.f10657b = ownerAgent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f10656a, kVar.f10656a) && Intrinsics.f(this.f10657b, kVar.f10657b);
    }

    public final int hashCode() {
        return this.f10657b.hashCode() + (this.f10656a.hashCode() * 31);
    }
}
