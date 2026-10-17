package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fva.e f133727a;

    public z(fva.e frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f133727a = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f133727a == ((z) obj2).f133727a;
    }

    public final int hashCode() {
        return this.f133727a.hashCode();
    }
}
