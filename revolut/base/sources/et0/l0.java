package et0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f129069b;

    public l0(int i, n0 percentage) {
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.f129068a = i;
        this.f129069b = percentage;
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException(("max size " + i + " is less than min size 0.").toString());
    }

    @Override // et0.m0
    public final n0 a() {
        return this.f129069b;
    }

    @Override // et0.m0
    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kli.a.k(context, this.f129068a);
    }

    @Override // et0.m0
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    @Override // et0.m0
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f129068a == l0Var.f129068a && this.f129069b == l0Var.f129069b;
    }

    public final int hashCode() {
        return this.f129069b.hashCode() + (Integer.hashCode(this.f129068a) * 31);
    }
}
