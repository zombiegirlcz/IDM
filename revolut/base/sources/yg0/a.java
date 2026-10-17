package yg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f313481b;

    public a(String nonce, Throwable throwable) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f313480a = nonce;
        this.f313481b = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f313480a, aVar.f313480a) && Intrinsics.f(this.f313481b, aVar.f313481b);
    }

    public final int hashCode() {
        return this.f313481b.hashCode() + (this.f313480a.hashCode() * 31);
    }
}
