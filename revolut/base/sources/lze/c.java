package lze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f200968a;

    public c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f200968a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f200968a, ((c) obj2).f200968a);
    }

    public final int hashCode() {
        return this.f200968a.hashCode();
    }
}
