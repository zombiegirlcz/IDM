package mm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f207101a;

    public g(Object obj2) {
        this.f207101a = obj2;
    }

    @Override // mm.c
    public final boolean a() {
        return true;
    }

    @Override // mm.c
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f207101a, ((g) obj2).f207101a);
    }

    public final int hashCode() {
        Object obj2 = this.f207101a;
        return Boolean.hashCode(true) + j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, true);
    }
}
