package hn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f154018c;
    public final boolean d;

    public e(String identityId) {
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        this.f154016a = identityId;
        this.f154017b = j6.a.q("IDENTITY:", identityId);
        this.f154018c = true;
        this.d = true;
    }

    @Override // hn0.g
    public final boolean a() {
        return this.d;
    }

    @Override // hn0.i
    public final boolean b() {
        return this.f154018c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f154016a, ((e) obj2).f154016a);
    }

    @Override // hn0.i
    public final String getName() {
        return this.f154017b;
    }

    public final int hashCode() {
        return this.f154016a.hashCode();
    }
}
