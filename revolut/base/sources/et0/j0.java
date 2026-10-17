package et0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f129055c;

    public j0(int i, int i2, n0 percentage) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.f129053a = i;
        this.f129054b = i2;
        this.f129055c = percentage;
        if (i >= i2) {
            return;
        }
        throw new IllegalStateException(("max size " + i + " is less than min size " + i2 + ".").toString());
    }

    @Override // et0.m0
    public final n0 a() {
        return this.f129055c;
    }

    @Override // et0.m0
    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kli.a.k(context, this.f129053a);
    }

    @Override // et0.m0
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f129054b;
        if (i == 0) {
            return 0;
        }
        return kli.a.k(context, i);
    }

    @Override // et0.m0
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f129053a == j0Var.f129053a && this.f129054b == j0Var.f129054b && this.f129055c == j0Var.f129055c;
    }

    public final int hashCode() {
        return this.f129055c.hashCode() + j6.a.b(this.f129054b, Integer.hashCode(this.f129053a) * 31, 31);
    }
}
