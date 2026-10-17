package zmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f323451a;

    public i(j type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f323451a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f323451a == ((i) obj2).f323451a;
    }

    public final int hashCode() {
        return this.f323451a.hashCode();
    }
}
