package nq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218300b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(List mediaKeys) {
        super(mediaKeys);
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        this.f218300b = mediaKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f218300b, ((h0) obj2).f218300b);
    }

    @Override // nq.i0
    public final List f() {
        return this.f218300b;
    }

    public final int hashCode() {
        return this.f218300b.hashCode();
    }
}
