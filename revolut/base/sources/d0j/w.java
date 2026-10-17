package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110443b;

    public w(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f110442a = type;
        this.f110443b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f110442a, wVar.f110442a) && Intrinsics.f(this.f110443b, wVar.f110443b);
    }

    public final int hashCode() {
        return this.f110443b.hashCode() + (this.f110442a.hashCode() * 31);
    }
}
