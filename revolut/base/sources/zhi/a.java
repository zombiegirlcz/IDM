package zhi;

import aii.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flow f322423b;

    public a(Flow streamToAuthorize) {
        Intrinsics.checkNotNullParameter(streamToAuthorize, "streamToAuthorize");
        this.f322423b = streamToAuthorize;
    }

    public final Flow b() {
        return this.f322423b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f322423b, ((a) obj2).f322423b);
    }

    public final int hashCode() {
        return this.f322423b.hashCode();
    }
}
