package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185372b;

    public p0(String key, String title) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f185371a = key;
        this.f185372b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f185371a, p0Var.f185371a) && Intrinsics.f(this.f185372b, p0Var.f185372b);
    }

    public final int hashCode() {
        return this.f185372b.hashCode() + (this.f185371a.hashCode() * 31);
    }
}
