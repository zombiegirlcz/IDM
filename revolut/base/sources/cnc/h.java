package cnc;

import ip0.v7;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f25391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f25392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25393c;

    public h(c0 period, dj0.d amount, String str) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f25391a = period;
        this.f25392b = amount;
        this.f25393c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f25391a == hVar.f25391a && Intrinsics.f(this.f25392b, hVar.f25392b) && Intrinsics.f(this.f25393c, hVar.f25393c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f25391a.hashCode() * 31, 31, this.f25392b);
        String str = this.f25393c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
