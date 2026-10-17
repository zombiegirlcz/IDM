package bnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f17172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17173b;

    public b(q item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f17172a = item;
        this.f17173b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f17172a, bVar.f17172a) && this.f17173b == bVar.f17173b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17173b) + (this.f17172a.hashCode() * 31);
    }
}
