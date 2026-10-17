package ish;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dsh.p f168269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f168270b;

    public m(dsh.p info, Object model) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f168269a = info;
        this.f168270b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f168269a, mVar.f168269a) && Intrinsics.f(this.f168270b, mVar.f168270b);
    }

    public final int hashCode() {
        return this.f168270b.hashCode() + (this.f168269a.hashCode() * 31);
    }
}
