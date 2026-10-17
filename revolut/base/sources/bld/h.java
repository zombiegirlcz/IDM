package bld;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalDestination.Browser f16538a;

    public h(ExternalDestination.Browser destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f16538a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f16538a.equals(((h) obj2).f16538a);
    }

    public final int hashCode() {
        return this.f16538a.hashCode();
    }
}
