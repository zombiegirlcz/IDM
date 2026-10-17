package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u4 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120793c;

    public u4(String minAmountLabel, String maxAmountLabel, String str) {
        Intrinsics.checkNotNullParameter(minAmountLabel, "minAmountLabel");
        Intrinsics.checkNotNullParameter(maxAmountLabel, "maxAmountLabel");
        this.f120791a = minAmountLabel;
        this.f120792b = maxAmountLabel;
        this.f120793c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj2;
        return Intrinsics.f(this.f120791a, u4Var.f120791a) && Intrinsics.f(this.f120792b, u4Var.f120792b) && Intrinsics.f(this.f120793c, u4Var.f120793c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120791a.hashCode() * 31, 31, this.f120792b);
        String str = this.f120793c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
