package jbe;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f172628a;

    public a(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f172628a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f172628a, ((a) obj2).f172628a);
    }

    public final int hashCode() {
        return this.f172628a.hashCode();
    }
}
