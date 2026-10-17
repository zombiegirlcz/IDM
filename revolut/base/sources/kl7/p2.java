package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f185373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185374b;

    public p2(o2 type, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f185373a = type;
        this.f185374b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return this.f185373a == p2Var.f185373a && Intrinsics.f(this.f185374b, p2Var.f185374b);
    }

    public final int hashCode() {
        return this.f185374b.hashCode() + (this.f185373a.hashCode() * 31);
    }
}
