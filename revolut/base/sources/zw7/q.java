package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325832b;

    public q(String str, String quoteRequestId) {
        Intrinsics.checkNotNullParameter(quoteRequestId, "quoteRequestId");
        this.f325831a = str;
        this.f325832b = quoteRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f325831a, qVar.f325831a) && Intrinsics.f(this.f325832b, qVar.f325832b);
    }

    public final int hashCode() {
        String str = this.f325831a;
        return this.f325832b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
