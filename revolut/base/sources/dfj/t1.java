package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t1 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f114111a;

    public t1(dj0.d amountLacking) {
        Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
        this.f114111a = amountLacking;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t1) && Intrinsics.f(this.f114111a, ((t1) obj2).f114111a);
    }

    public final int hashCode() {
        return this.f114111a.hashCode();
    }
}
