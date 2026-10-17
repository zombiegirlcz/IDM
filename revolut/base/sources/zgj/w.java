package zgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322187a;

    public w(dj0.d lackingAmount) {
        Intrinsics.checkNotNullParameter(lackingAmount, "lackingAmount");
        this.f322187a = lackingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f322187a, ((w) obj2).f322187a);
    }

    public final int hashCode() {
        return this.f322187a.hashCode();
    }
}
