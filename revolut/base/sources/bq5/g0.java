package bq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17714b;

    public g0(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f17713a = key;
        this.f17714b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f17713a.equals(g0Var.f17713a) && this.f17714b == g0Var.f17714b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17714b) + (this.f17713a.hashCode() * 31);
    }
}
