package wbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecg.e f296165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rei.h f296166b;

    public f(ecg.e price, rei.h paymentMode) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        this.f296165a = price;
        this.f296166b = paymentMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296165a, fVar.f296165a) && this.f296166b == fVar.f296166b;
    }

    public final int hashCode() {
        return this.f296166b.hashCode() + (this.f296165a.hashCode() * 31);
    }
}
