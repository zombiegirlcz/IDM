package ovb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvb.f f230017a;

    public f(fvb.f result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f230017a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f230017a, ((f) obj2).f230017a);
    }

    public final int hashCode() {
        return this.f230017a.hashCode();
    }
}
