package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class do0 implements fo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.d0 f163935a;

    public do0(aw0.d0 ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.f163935a = ratio;
    }

    @Override // ip0.fo0
    public final aw0.d0 a() {
        return this.f163935a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof do0) && Intrinsics.f(this.f163935a, ((do0) obj2).f163935a);
    }

    public final int hashCode() {
        return this.f163935a.hashCode();
    }
}
