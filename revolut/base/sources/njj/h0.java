package njj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f216563a;

    public h0(dj0.d lackingAmount) {
        Intrinsics.checkNotNullParameter(lackingAmount, "lackingAmount");
        this.f216563a = lackingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f216563a, ((h0) obj2).f216563a);
    }

    public final int hashCode() {
        return this.f216563a.hashCode();
    }
}
