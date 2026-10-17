package ywg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwg.l f317426a;

    public c(pwg.l indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        this.f317426a = indicator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f317426a, ((c) obj2).f317426a);
    }

    public final int hashCode() {
        return this.f317426a.hashCode();
    }
}
