package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173560a;

    public r2(String placeholder) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f173560a = placeholder;
    }

    @Override // jel.s2
    public final String a() {
        return this.f173560a;
    }

    @Override // jel.s2
    public final t2 b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r2) && Intrinsics.f(this.f173560a, ((r2) obj2).f173560a);
    }

    public final int hashCode() {
        return this.f173560a.hashCode();
    }
}
