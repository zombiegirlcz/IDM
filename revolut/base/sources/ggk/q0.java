package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143772b;

    public q0(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f143771a = text;
        this.f143772b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f143771a, q0Var.f143771a) && Intrinsics.f(this.f143772b, q0Var.f143772b);
    }

    public final int hashCode() {
        return this.f143772b.hashCode() + (this.f143771a.hashCode() * 31);
    }
}
