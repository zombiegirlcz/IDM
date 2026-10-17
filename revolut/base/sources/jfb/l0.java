package jfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173822b;

    public l0(String accessToken, String url2) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f173821a = accessToken;
        this.f173822b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f173821a, l0Var.f173821a) && Intrinsics.f(this.f173822b, l0Var.f173822b);
    }

    public final int hashCode() {
        return this.f173822b.hashCode() + (this.f173821a.hashCode() * 31);
    }
}
