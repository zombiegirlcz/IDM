package rbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f253053a;

    public d(a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f253053a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f253053a.equals(((d) obj2).f253053a);
    }

    public final int hashCode() {
        return this.f253053a.f253049a.hashCode();
    }
}
