package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325785b;

    public g1(String str, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f325784a = str;
        this.f325785b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f325784a, g1Var.f325784a) && Intrinsics.f(this.f325785b, g1Var.f325785b);
    }

    public final int hashCode() {
        String str = this.f325784a;
        return this.f325785b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
