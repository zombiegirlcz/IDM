package nxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f220553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qxd.a f220554b;

    public a(dj0.d amount, qxd.a editMode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        this.f220553a = amount;
        this.f220554b = editMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f220553a, aVar.f220553a) && this.f220554b == aVar.f220554b;
    }

    public final int hashCode() {
        return this.f220554b.hashCode() + (this.f220553a.hashCode() * 31);
    }
}
