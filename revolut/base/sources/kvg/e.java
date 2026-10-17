package kvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lwg.a f190117a;

    public e(lwg.a benchmark) {
        Intrinsics.checkNotNullParameter(benchmark, "benchmark");
        this.f190117a = benchmark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f190117a, ((e) obj2).f190117a);
    }

    public final int hashCode() {
        return this.f190117a.hashCode();
    }
}
