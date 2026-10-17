package bpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dne.a f17611a;

    public d(dne.a stampDuty) {
        Intrinsics.checkNotNullParameter(stampDuty, "stampDuty");
        this.f17611a = stampDuty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f17611a, ((d) obj2).f17611a);
    }

    public final int hashCode() {
        return this.f17611a.hashCode();
    }
}
