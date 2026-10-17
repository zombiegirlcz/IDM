package ssi;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f265402a;

    public a(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f265402a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f265402a, ((a) obj2).f265402a);
    }

    public final int hashCode() {
        return this.f265402a.hashCode();
    }
}
