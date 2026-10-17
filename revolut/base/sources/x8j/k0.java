package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends aii.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ytd.e f303457b;

    public k0(ytd.e unstakeResult) {
        Intrinsics.checkNotNullParameter(unstakeResult, "unstakeResult");
        this.f303457b = unstakeResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f303457b, ((k0) obj2).f303457b);
    }

    public final int hashCode() {
        return this.f303457b.hashCode();
    }
}
