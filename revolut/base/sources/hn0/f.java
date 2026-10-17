package hn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154020b;

    public f(String identityId) {
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        this.f154019a = identityId;
        this.f154020b = j6.a.q("IDENTITY_NON_BIOMETRIC:", identityId);
    }

    @Override // hn0.g
    public final boolean a() {
        return false;
    }

    @Override // hn0.i
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f154019a, ((f) obj2).f154019a);
    }

    @Override // hn0.i
    public final String getName() {
        return this.f154020b;
    }

    public final int hashCode() {
        return this.f154019a.hashCode();
    }
}
