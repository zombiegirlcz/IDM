package xr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f308191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uk.a f308192b;

    public e(Object obj2, uk.a runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f308191a = obj2;
        this.f308192b = runnable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f308191a, eVar.f308191a) && this.f308192b.equals(eVar.f308192b);
    }

    public final int hashCode() {
        Object obj2 = this.f308191a;
        return this.f308192b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
