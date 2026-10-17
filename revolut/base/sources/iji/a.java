package iji;

import aii.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flow f161798b;

    public a(Flow streamToAuthorize) {
        Intrinsics.checkNotNullParameter(streamToAuthorize, "streamToAuthorize");
        this.f161798b = streamToAuthorize;
    }

    public final Flow b() {
        return this.f161798b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161798b, ((a) obj2).f161798b);
    }

    public final int hashCode() {
        return this.f161798b.hashCode();
    }
}
