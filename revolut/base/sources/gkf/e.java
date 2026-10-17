package gkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sq9.a f144381a;

    public e(sq9.a groupBill) {
        Intrinsics.checkNotNullParameter(groupBill, "groupBill");
        this.f144381a = groupBill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f144381a, ((e) obj2).f144381a);
    }

    public final int hashCode() {
        return this.f144381a.hashCode();
    }
}
