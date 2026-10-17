package ymi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315011a;

    public /* synthetic */ e(String str) {
        this.f315011a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return Intrinsics.f(this.f315011a, ((e) obj2).f315011a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f315011a.hashCode();
    }

    public final String toString() {
        return p.a.p("OAuthAuthorizationCode(code=", this.f315011a, ")");
    }
}
