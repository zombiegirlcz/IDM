package qa6;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f243962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f243963b;

    public a(a3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f243962a = value;
        this.f243963b = value.f272593h.toInstant().getMillis();
    }

    @Override // qa6.c
    public final long a() {
        return this.f243963b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f243962a, ((a) obj2).f243962a);
    }

    public final int hashCode() {
        return this.f243962a.hashCode();
    }
}
