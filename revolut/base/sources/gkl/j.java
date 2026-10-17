package gkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144460b;

    public j(String codeVerifier, String codeChallenge) {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        this.f144459a = codeVerifier;
        this.f144460b = codeChallenge;
    }

    public final String a() {
        return this.f144460b;
    }

    public final String b() {
        return this.f144459a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f144459a, jVar.f144459a) && Intrinsics.f(this.f144460b, jVar.f144460b);
    }

    public final int hashCode() {
        return this.f144460b.hashCode() + (this.f144459a.hashCode() * 31);
    }
}
