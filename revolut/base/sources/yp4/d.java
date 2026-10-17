package yp4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f315784a;

    public d(Integer valueParcel) {
        Intrinsics.checkNotNullParameter(valueParcel, "valueParcel");
        this.f315784a = valueParcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f315784a.equals(((d) obj2).f315784a);
    }

    public final int hashCode() {
        return this.f315784a.hashCode();
    }
}
