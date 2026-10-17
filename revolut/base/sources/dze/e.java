package dze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f121330a;

    public e(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f121330a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f121330a, ((e) obj2).f121330a);
    }

    public final int hashCode() {
        return this.f121330a.hashCode();
    }
}
