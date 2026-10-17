package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f247151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f247152b;

    public o(p initial, p actual) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f247151a = initial;
        this.f247152b = actual;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f247151a, oVar.f247151a) && Intrinsics.f(this.f247152b, oVar.f247152b);
    }

    public final int hashCode() {
        return this.f247152b.hashCode() + (this.f247151a.hashCode() * 31);
    }
}
