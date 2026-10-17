package oik;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f225703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f225705c;

    public c(hha.d plan, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f225703a = plan;
        this.f225704b = z;
        this.f225705c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f225703a, cVar.f225703a) && this.f225704b == cVar.f225704b && this.f225705c == cVar.f225705c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225705c) + j6.a.c(this.f225703a.hashCode() * 31, 31, this.f225704b);
    }
}
