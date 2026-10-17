package nle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wel.d f217124a;

    public c(wel.d buyBlock) {
        Intrinsics.checkNotNullParameter(buyBlock, "buyBlock");
        this.f217124a = buyBlock;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f217124a, ((c) obj2).f217124a);
    }

    public final int hashCode() {
        return this.f217124a.hashCode();
    }
}
