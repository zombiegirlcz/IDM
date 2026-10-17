package jq5;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f177471a;

    public c(dj0.d maxToSend) {
        Intrinsics.checkNotNullParameter(maxToSend, "maxToSend");
        this.f177471a = maxToSend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f177471a, ((c) obj2).f177471a);
    }

    public final int hashCode() {
        return this.f177471a.hashCode();
    }
}
