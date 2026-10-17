package mc9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f204313a;

    public e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f204313a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f204313a, ((e) obj2).f204313a);
    }

    public final int hashCode() {
        return this.f204313a.hashCode();
    }
}
