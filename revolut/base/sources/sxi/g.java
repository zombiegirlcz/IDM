package sxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f266500a;

    public g(i loungeData) {
        Intrinsics.checkNotNullParameter(loungeData, "loungeData");
        this.f266500a = loungeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f266500a, ((g) obj2).f266500a);
    }

    public final int hashCode() {
        return this.f266500a.hashCode();
    }
}
