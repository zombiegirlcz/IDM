package yg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313483a;

    public c(String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.f313483a = nonce;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f313483a, ((c) obj2).f313483a);
    }

    public final int hashCode() {
        return this.f313483a.hashCode();
    }
}
