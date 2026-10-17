package yac;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f312005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f312006b;

    public a(a3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f312005a = value;
        this.f312006b = value.f272591g.toInstant().getMillis();
    }

    @Override // yac.c
    public final int a() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312005a, ((a) obj2).f312005a);
    }

    public final int hashCode() {
        return this.f312005a.hashCode();
    }

    @Override // yac.c
    public final long l0() {
        return this.f312006b;
    }
}
