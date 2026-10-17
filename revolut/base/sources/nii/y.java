package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f216242b;

    /* JADX WARN: Multi-variable type inference failed */
    public y() {
        this(3, null, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f216241a, yVar.f216241a) && Intrinsics.f(this.f216242b, yVar.f216242b);
    }

    public final int hashCode() {
        String str = this.f216241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f216242b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ y(int i, String str, Integer num) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public y(String str, Integer num) {
        this.f216241a = str;
        this.f216242b = num;
    }
}
