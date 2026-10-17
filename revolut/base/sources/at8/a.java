package at8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9016a;

    public a(String identToken) {
        Intrinsics.checkNotNullParameter(identToken, "identToken");
        this.f9016a = identToken;
    }

    public final String b() {
        return this.f9016a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f9016a, ((a) obj2).f9016a);
    }

    public final int hashCode() {
        return this.f9016a.hashCode();
    }
}
