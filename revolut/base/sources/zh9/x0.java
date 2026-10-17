package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f322363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f322364b;

    public x0(j1 state, i accountConfig) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        this.f322363a = state;
        this.f322364b = accountConfig;
    }

    @Override // zh9.y0
    public final j1 a() {
        return this.f322363a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f322363a, x0Var.f322363a) && Intrinsics.f(this.f322364b, x0Var.f322364b);
    }

    public final int hashCode() {
        return this.f322364b.hashCode() + (this.f322363a.hashCode() * 31);
    }
}
