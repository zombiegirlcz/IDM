package nq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List mediaKeys) {
        super(mediaKeys);
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        this.f218297b = mediaKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f218297b, ((g0) obj2).f218297b);
    }

    @Override // nq.i0
    public final List f() {
        return this.f218297b;
    }

    public final int hashCode() {
        return this.f218297b.hashCode();
    }
}
