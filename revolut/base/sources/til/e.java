package til;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f271577a;

    public e(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f271577a = controller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271577a, ((e) obj2).f271577a);
    }

    public final int hashCode() {
        return this.f271577a.hashCode();
    }
}
